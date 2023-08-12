//arquivo que gera os outros arquivos, para gerar, ou atualizar o funcionamento, use antlr4 Isi.g4 no cmd, dentro da pasta src
// depois de colocar o antlr nas variaveis de ambiente

grammar Isi;

prog : 'programa' 'fimprog.'
;

declara : 'declare' ID (','ID)* '.'
;

bloco : (cmd. )+
;

cmd : cmdLeitura | cmdEscrita | cmdAttrib
;

cmdLeitura : 'leia' AP ID FP Ponto
;

cmdEscrita : 'escreva' AP ID FP Ponto
;

cmdAttrib : ID ATTR expr Ponto
;

expr : termo ( OP termo)*
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

ATTR : '='
;

ID : [a-z] ([a-z] | [A-Z] | [0-9])*
;

NUMBER : [0-9]+ ('.' [0.9]+)?
;

//white space
WS : (' ' | '\t' | '\n' | '\r') -> skip
;

