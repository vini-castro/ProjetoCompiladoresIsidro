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
}

prog : 'programa' declara+ bloco 'fimprog.'
;

//declara : 'declare' ID (',' ID)* Ponto'
declara : 'declare' ID {
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

bloco : (cmd)+
;

cmd : cmdLeitura | cmdEscrita | cmdExpr | cmdIf | cmdWhile
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
;

//'escreva' ((AP TEXTO FP Ponto) | AP ID FP Ponto)
cmdEscrita : 'escreva' ((AP TEXTO FP Ponto) | AP
                ID{ _varName = _input.LT(-1).getText();
                       if (!symbolTable.exists(_varName)){
                           throw new IsiSemanticException("Simbolo '"+_varName+"' nao declarado no escopo");
                       }
                   }
                FP Ponto)
;

//ID ':=' expr Ponto
cmdExpr : ID{ _varName = _input.LT(-1).getText();
               if (!symbolTable.exists(_varName)){
                   throw new IsiSemanticException("Simbolo '"+_varName+"' nao declarado no escopo");
               }
             }
          ':=' expr Ponto
;

cmdIf : 'if' AP expr OP_REL expr FP '{' cmd+ '}' ('else' '{' cmd+ '}')?
;

cmdWhile : 'while' AP expr OP_REL expr FP '{' cmd+ '}'
;

expr : termo (OP termo)*
;

termo : ID { _varName = _input.LT(-1).getText();
               if (!symbolTable.exists(_varName)){
                   throw new IsiSemanticException("Simbolo '"+_varName+"' nao declarado no escopo");
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