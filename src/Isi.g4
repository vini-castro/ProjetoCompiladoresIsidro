//arquivo que gera os outros arquivos, para gerar, ou atualizar o funcionamento, use antlr4 Isi.g4 no cmd, dentro da pasta src
// depois de colocar o antlr nas variaveis de ambiente

grammar Isi;

@header{
	import datastructures.IsiSymbol;
	import datastructures.IsiVariable;
	import datastructures.IsiSymbolTable;
	import exceptions.IsiSemanticException;
	import ast.*;
	import java.util.ArrayList;
	import java.util.Stack;
}

@members{
    private int _tipo;
    private String _varName;
    private String _varValue;
    private IsiSymbolTable symbolTable = new IsiSymbolTable();
    private IsiSymbol symbol;
    private boolean _is_attr;
    private int _tipo_attr;
    private IsiProgram program = new IsiProgram();
    private ArrayList<AbstractCommand> curThread;
    private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();

    private String _readID;
    private String _writeID;
    private String _exprID;
    private String _exprContent;
    private String _exprDecision;
    private ArrayList<AbstractCommand> listaTrue;
    private ArrayList<AbstractCommand> listaFalse;

    public void generateCode() {
        program.generateTarget();
    }

}

prog : 'programa' declara+ bloco 'fimprog.'
        {
            program.setVarTable(symbolTable);
            program.setComandos(stack.pop());
        }
     ;

//declara : tipo ID (',' ID)* Ponto'
declara : tipo ID {
                          _varName = _input.LT(-1).getText();
                          _varValue = null;
                          symbol = new IsiVariable(_varName, _tipo, _varValue);
                          if (!symbolTable.exists(_varName)){
                             symbolTable.add(symbol);
                          }
                          else{
                             throw new IsiSemanticException("Simbolo '"+_varName+"' ja foi declarado previamente");
                          }
                         }
              (',' ID {
                          _varName = _input.LT(-1).getText();
                          _varValue = null;
                          symbol = new IsiVariable(_varName, _tipo, _varValue);
                          if (!symbolTable.exists(_varName)){
                             symbolTable.add(symbol);
                          }
                          else{
                             throw new IsiSemanticException("Simbolo '"+_varName+"' ja foi declarado previamente");
                          }
                       }
              )* Ponto
;

tipo  : 'numero' {_tipo = IsiVariable.NUMBER;}
      | 'texto'  {_tipo = IsiVariable.TEXT;}
      ;

bloco : {
          curThread = new ArrayList<AbstractCommand>();
          stack.push(curThread);
        }
        (cmd)+
;

cmd : cmdLeitura | cmdEscrita | cmdAttr | cmdExpr | cmdIf | cmdWhile
;

//cmdLeitura : 'leia' AP ID FP Ponto
cmdLeitura : 'leia' AP
                    ID{ _varName = _input.LT(-1).getText();
                            if (!symbolTable.exists(_varName)){
                                throw new IsiSemanticException("Simbolo '"+_varName+"' nao declarado no escopo");
                            }
                            _readID = _input.LT(-1).getText();
                       }
                    FP
                    Ponto
                    {
                        IsiVariable var = (IsiVariable) symbolTable.get(_readID);
                        CommandLeitura cmd = new CommandLeitura(_readID, var);
                        stack.peek().add(cmd);
                    }
;

//'escreva' ((AP TEXTO FP Ponto) | AP ID FP Ponto)
cmdEscrita : 'escreva' ((AP
                TEXTO {
                    _writeID = _input.LT(-1).getText();
                }
                FP Ponto)
                | (AP
                ID{ _varName = _input.LT(-1).getText();
                       if (!symbolTable.exists(_varName)){
                           throw new IsiSemanticException("Simbolo '"+_varName+"' nao declarado no escopo");
                       }
                       _writeID = _input.LT(-1).getText();
                   }
                FP Ponto))
                {
                    CommandEscrita cmd = new CommandEscrita(_writeID);
                    stack.peek().add(cmd);
                }

;

cmdAttr : {_is_attr = true; }
         ID {
               _varName = _input.LT(-1).getText();
                       if (!symbolTable.exists(_varName)){
                           throw new IsiSemanticException("Simbolo '"+_varName+"' nao declarado no escopo");
                       }
               _tipo_attr = symbolTable.get(_varName).getType();
               _exprID = _input.LT(-1).getText();
         }
         EQ { _exprContent = "";}
         (
               TEXTO {
                  if (_tipo_attr == IsiVariable.NUMBER){
                     throw new IsiSemanticException("Simbolo '"+_varName+"' é um número e não pode receber um texto");
                  }
                  _exprContent = _input.LT(-1).getText();
               }
               | expr 
         )
         Ponto
         {_is_attr = false;
          CommandAtribuicao cmd = new CommandAtribuicao(_exprID, _exprContent);
          stack.peek().add(cmd);
          }
;

//ID ':=' expr Ponto
cmdExpr : ID{ _varName = _input.LT(-1).getText();
               if (!symbolTable.exists(_varName)){
                   throw new IsiSemanticException("Simbolo '"+_varName+"' nao declarado no escopo");
               }
             }
          ':=' expr Ponto
;

cmdIf : 'if' AP {   _exprDecision = "";
                    _exprContent = "";
                }
             expr
             { _exprDecision += _exprContent;}
             OP_REL { _exprDecision += _input.LT(-1).getText();
                      _exprContent = "";
                    }
             expr
             { _exprDecision += _exprContent;}
             FP
             '{'
                {
                    curThread = new ArrayList<AbstractCommand>();
                    stack.push(curThread);
                }
              cmd+
              '}'
             {
                listaTrue = stack.pop();
             }
             ('else'
                {
                    curThread = new ArrayList<AbstractCommand>();
                    stack.push(curThread);
                }
              '{' cmd+ '}'
                {
                    listaFalse = stack.pop();
                    CommandDecisao cmd = new CommandDecisao(_exprDecision, listaTrue, listaFalse);
                    System.out.println(_exprDecision);
                    stack.peek().add(cmd);
                }
              )?
;

cmdWhile : ('while' AP expr OP_REL expr FP '{' cmd+ '}') | ('do' '{' cmd+ '}' 'while' AP expr OP_REL expr FP Ponto)
;

expr : termo (
        OP { _exprContent += _input.LT(-1).getText();}
       termo)*
;

termo : ID { _varName = _input.LT(-1).getText();
               if (!symbolTable.exists(_varName)){
                   throw new IsiSemanticException("Simbolo '"+_varName+"' nao declarado no escopo");
               }
            
               int tipo = symbolTable.get(_varName).getType();

               if (_is_attr && _tipo_attr != tipo){
                  throw new IsiSemanticException("Os tipos não batem");
               }

               _exprContent += _input.LT(-1).getText();
            }
        | NUMBER {
            _exprContent += _input.LT(-1).getText();
        }
;

//Abre parenteses
AP : '('
;

FP : ')'
;

Ponto : '.'
;

EQ: '='
;

OP : '+' | '-' | '*' | '/'
;

ID : ([a-z] | [A-Z]) ([a-z] | [A-Z] | [0-9])*
;

NUMBER : [0-9]+ ('.' [0-9]+)?
;

OP_REL : '<' | '>' | '<=' | '>=' | '!=' | '=='
;

TEXTO: '"' ([a-z]|[A-Z]|[0-9]|' '|'\t'|'!'|'-')* '"'
;

//white space
WS : (' '| '\t' | '\n' | '\r')+ -> skip
;

COMMENT : '//' .*? ('\n' | '\r') -> skip
;