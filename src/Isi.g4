//arquivo que gera os outros arquivos, para gerar, ou atualizar o funcionamento, use antlr4 Isi.g4 no cmd, dentro da pasta src
// depois de colocar o antlr nas variaveis de ambiente

grammar Isi;

@header{
    import java.util.Stack;
	import datastructures.IsiSymbol;
	import datastructures.IsiVariable;
	import datastructures.IsiSymbolTable;
	import ast.Program;
	import exceptions.IsiSemanticException;
	import ast.AbstractCommand;
	import ast.CmdAttr;
	import ast.CmdLeitura;
	import ast.CmdEscrita;
	import ast.CmdIf;
	import ast.CmdExpr;
	import java.util.ArrayList;
}

@members{
    private int _tipo;
    private String _varName;
    private String _varValue;
    private IsiSymbolTable symbolTable = new IsiSymbolTable();
    private Program program = new Program();
    private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
    private IsiSymbol symbol;
    private boolean _is_attr;
    private int _tipo_attr;
    private ArrayList<AbstractCommand> listaTrue;
    private ArrayList<AbstractCommand> listaFalse;
    private ArrayList<AbstractCommand> curThread;
    private String _readID;
    private String _exprID;
    private String _exprIf;
    private String _writeID;
    private String _exprContent;

    public void generateCode(){
        program.generateTarget();
    }
}

prog : 'programa' declara+ bloco 'fimprog.'
           {  program.setVarTable(symbolTable);
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
            { curThread = new ArrayList<AbstractCommand>();
              stack.push(curThread);
            }
}(cmd)+
;

cmd : cmdLeitura | cmdEscrita | cmdAttr | cmdIf | cmdWhile
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
                    Ponto{
                        IsiVariable var = (IsiVariable)symbolTable.get(_readID);
                        CmdLeitura cmd = new CmdLeitura(_readID, var);
                        stack.peek().add(cmd);
                    }
;

//'escreva' ((AP TEXTO FP Ponto) | AP ID FP Ponto)
cmdEscrita : 'escreva' ((AP TEXTO{
                        _writeID = _input.LT(-1).getText();
                         } FP Ponto{
                             CmdEscrita cmd = new CmdEscrita(_writeID);
                             stack.peek().add(cmd);
                         }) | AP
                ID{ _varName = _input.LT(-1).getText();
                       if (!symbolTable.exists(_varName)){
                           throw new IsiSemanticException("Simbolo '"+_varName+"' nao declarado no escopo");
                       }
                       _writeID = _input.LT(-1).getText();
                   }
                FP Ponto{
                CmdEscrita cmd = new CmdEscrita(_writeID);
                stack.peek().add(cmd);
                })
;

cmdAttr : {_is_attr = true; }
         ID {
               _varName = _input.LT(-1).getText();
                       if (!symbolTable.exists(_varName)){
                           throw new IsiSemanticException("Simbolo '"+_varName+"' nao declarado no escopo");
                       }
               _tipo_attr = symbolTable.get(_varName).getType();
               _writeID = _input.LT(-1).getText();
         }
         EQ {_exprContent = "";} (
               TEXTO {
                  if (_tipo_attr == IsiVariable.NUMBER){
                     throw new IsiSemanticException("Simbolo '"+_varName+"' é um número e não pode receber um texto");
                  }
               }
               | expr
         )
         Ponto
         {_is_attr = false;
         CmdAttr cmd = new CmdAttr(_varName, _exprContent);
         stack.peek().add(cmd);}
;

cmdIf : 'if' AP
            expr { _exprIf = _input.LT(-1).getText(); }
            OP_REL { _exprIf += _input.LT(-1).getText(); }
             expr {_exprIf += _input.LT(-1).getText(); }
              FP
              '{' {
              { curThread = new ArrayList<AbstractCommand>();
               stack.push(curThread); }}
                cmd+
                '}' { listaTrue = stack.pop(); }
                 ('else'
                    '{' {curThread = new ArrayList<AbstractCommand>();
                          stack.push(curThread); }
                       cmd+
                       '}'{
                            listaFalse = stack.pop();
                            CmdIf cmd = new CmdIf(_exprIf, listaTrue, listaFalse);
                            stack.peek().add(cmd);}
                            )?
;

cmdWhile : ('while' AP expr OP_REL expr FP '{' cmd+ '}') | ('do' '{' cmd+ '}' 'while' AP expr OP_REL expr FP Ponto)
;

expr : termo (OP { _exprContent += _input.LT(-1).getText();}
        termo)*
;

termo : ID { _varName = _input.LT(-1).getText();
               if (!symbolTable.exists(_varName)){
                   throw new IsiSemanticException("Simbolo '"+_varName+"' nao declarado no escopo");
               }
               _exprContent += _input.LT(-1).getText();
            
               int tipo = symbolTable.get(_varName).getType();

               if (_is_attr && _tipo_attr != tipo){
                  throw new IsiSemanticException("Os tipos não batem");
               }
            }
        | NUMBER {_exprContent += _input.LT(-1).getText();}
;

//Abre parenteses
AP : '('
;

FP : ')'
;

AC : '{'
;

FC : '}'
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