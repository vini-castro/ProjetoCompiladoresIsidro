//arquivo que gera os outros arquivos, para gerar, ou atualizar o funcionamento, use antlr4 Isi.g4 no cmd, dentro da pasta src
// depois de colocar o antlr nas variaveis de ambiente

grammar Isi;

prog : 'programa' declara bloco 'fimprog.'
;

declara : 'declare' ID (',' ID)* Ponto
;

bloco : (cmd)+
;

cmd : cmdLeitura | cmdEscrita | cmdExpr | cmdIf
;

cmdLeitura : 'leia' AP ID FP Ponto
;

cmdEscrita : 'escreva' AP ASPAS TEXTO ASPAS FP Ponto
;

cmdExpr : ID ':=' expr Ponto
;

cmdIf : 'if' AP expr OP_REL expr FP '{' cmd+ '}' ('else' '{' cmd+ '}')?
;

expr : termo (OP termo)?
;

termo : ID | NUMBER
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

ATTR : ':='
;

ID : ([a-z] | [A-Z]) ([a-z] | [A-Z] | [0-9])*
;

NUMBER : [0-9]+ ('.' [0.9]+)?
;

ASPAS : '"'
;

OP_REL : '<' | '>' | '<=' | '>=' | '!=' | '=='
;

TEXTO : ([0-9] | [a-z] | [A-Z] | ' ')+
;

//white space
WS : (' '| '\t' | '\n' | '\r')+ -> skip
;

