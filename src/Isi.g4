//arquivo que gera os outros arquivos, para gerar, ou atualizar o funcionamento, use antlr4 Isi.g4 no cmd, dentro da pasta src
// depois de colocar o antlr nas variaveis de ambiente

grammar Isi;

@header{
	import datastructures.IsiSymbol;
	import datastructures.IsiVariable;
	import datastructures.IsiSymbolTable;
	import exceptions.IsiSemanticException;
}

@members{
    private int _tipo;
    private String _varName;
    private String _varValue;
    private IsiSymbolTable symbolTable = new IsiSymbolTable();
    private IsiSymbol symbol;
    private boolean _is_attr;
    private int _tipo_attr;
}

prog : 'programa' declara+ bloco 'fimprog.'
;

//declara : tipo ID (',' ID)* Ponto'
declara : tipo ID {
                          _varName = _input.LT(-1).getText();
                          _varValue = null;
                          symbol = new IsiVariable(_varName, _tipo, _varValue, false);
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
                          symbol = new IsiVariable(_varName, _tipo, _varValue, false);
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

bloco : (cmd)+
;

cmd : cmdLeitura | cmdEscrita | cmdAttr | cmdIf | cmdWhile
;

//cmdLeitura : 'leia' AP ID FP Ponto
cmdLeitura : 'leia' AP
                    ID{ _varName = _input.LT(-1).getText();
                            if (!symbolTable.exists(_varName)){
                                throw new IsiSemanticException("Simbolo '"+_varName+"' nao declarado no escopo");
                            }
                       }
                    FP
                    Ponto
                    {symbolTable.get(_varName).setInitialized(true);}
;

//'escreva' ((AP TEXTO FP Ponto) | AP ID FP Ponto)
cmdEscrita : 'escreva' ((AP TEXTO FP Ponto) | AP
                ID{ _varName = _input.LT(-1).getText();
                        if (!symbolTable.exists(_varName)){
                           throw new IsiSemanticException("Simbolo '"+_varName+"' nao declarado no escopo");
                        }
                        if (!symbolTable.hasValue(_varName)){
                           throw new IsiSemanticException("Simbolo '"+_varName+"' não inicializado");
                        }
                   }
                FP Ponto)
;

cmdAttr : {_is_attr = true; }
         ID {
               String _varName = _input.LT(-1).getText();
                       if (!symbolTable.exists(_varName)){
                           throw new IsiSemanticException("Simbolo '"+_varName+"' nao declarado no escopo");
                       }
               _tipo_attr = symbolTable.get(_varName).getType();
         }
         EQ (
               TEXTO {
                  if (_tipo_attr == IsiVariable.NUMBER){
                     throw new IsiSemanticException("Simbolo '"+_varName+"' é um número e não pode receber um texto");
                  }
               }
               | expr 
         )
         Ponto
         {
            symbolTable.get(_varName).setInitialized(true);
            _is_attr = false;

         }
;

cmdIf : 'if' AP expr OP_REL expr FP '{' cmd+ '}' ('else' '{' cmd+ '}')?
;

cmdWhile : ('while' AP expr OP_REL expr FP '{' cmd+ '}') | ('do' '{' cmd+ '}' 'while' AP expr OP_REL expr FP Ponto)
;

expr : termo (OP termo)*
;

termo : ID { _varName = _input.LT(-1).getText();
               if (!symbolTable.exists(_varName)){
                   throw new IsiSemanticException("Simbolo '"+_varName+"' nao declarado no escopo");
               }

               if (!symbolTable.hasValue(_varName)){
                  throw new IsiSemanticException("Simbolo '"+_varName+"' não inicializado");
               }
            
               int tipo = symbolTable.get(_varName).getType();

               if (_is_attr && _tipo_attr != tipo){
                  throw new IsiSemanticException("Os tipos não batem");
               }
            }
        | NUMBER
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