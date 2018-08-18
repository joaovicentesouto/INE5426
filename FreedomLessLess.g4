grammar FreedomLessLess;

file : /*import_def**/ (class_def | function_def)+ /*mainFunction*/;

// import_def : IMPORT '<' ID '.fll>';

class_def : CLASS ID OPEN_KEY classMembers CLOSE_KEY SEMICOLON;

classMembers : public_def private_def? | private_def;

public_def : PUBLIC class_scope_def;

private_def : PRIVATE class_scope_def;

class_scope_def : decl_def* function_def*;

decl_def : type_def ID (ASSIGN exp_def)? (COMMA ID (ASSIGN exp_def)?)* SEMICOLON;

function_def: type_def ID OPEN_PAR param_def? CLOSE_PAR block_def SEMICOLON;

param_def : type_def ID (COMMA type_def ID)*;

arg_def : exp_def (COMMA exp_def)*;

struct_def : if_def | for_def | while_def | switch_def;

if_def : IF OPEN_PAR exp_def CLOSE_PAR block_def (ELSE block_def)?;

for_def : FOR OPEN_PAR (decl_def COMMA)* SEMICOLON exp_def SEMICOLON exp_def CLOSE_PAR block_def;

while_def : WHILE OPEN_PAR exp_def CLOSE_PAR block_def;

switch_def
	: SWITCH OPEN_PAR exp_def CLOSE_PAR OPEN_KEY
		(CASE VALUE ':' (exp_def SEMICOLON)+ )*
		DEFAULT ':' (exp_def SEMICOLON)* CLOSE_BRAK
	;

block_def : OPEN_KEY (exp_def SEMICOLON | struct_def)+ CLOSE_KEY ;

exp_def //! Exp tudo o que gera um valor final
	: funcCall_def
	| scoped_decl_def
	| exp_def (OPLOGICAL | SIGNAL | OPSIGNAL) exp_def
	| ID
	| VALUE
	| RETURN exp_def
	| BREAK
	| CONTINUE
	;

funcCall_def : ID OPEN_PAR arg_def CLOSE_PAR ;// SEMICOLON;
scoped_decl_def : type_def ID (ASSIGN exp_def)? (COMMA ID (ASSIGN exp_def)?)*;

// mainFunction : INT MAIN OPEN_PAR INT ID COMMA CHAR MULT MULT ID CLOSE_PAR block_def;

type_def
    : INT
	| UNSIGNED
	| SHORT
	| FLOAT
	| DOUBLE
	| CHAR
	| BOOL
	| VOID
	;

//! TOKENS ONLY |
//! 	        V

//! Primitive types
INT      : 'int';
UNSIGNED : 'unsigned';
FLOAT    : 'float';
DOUBLE   : 'double';
SHORT    : 'short';
CHAR     : 'char';
BOOL     : 'bool';
VOID     : 'void';

IMPORT   : 'import';
CLASS    : 'class';
PUBLIC   : 'public' TWOPOINTS;
PRIVATE  : 'private' TWOPOINTS;
MAIN     : 'main';

RETURN   : 'return' ;

//! Primitive structs
IF 		 : 'if' ;
ELSE     : 'else' ;
FOR 	 : 'for' ;
WHILE 	 : 'while' ;
SWITCH 	 : 'switch' ;
CASE 	 : 'case' ;
BREAK 	 : 'break' ;
CONTINUE : 'continue';
DEFAULT	 : 'default';

OPLOGICAL : LESS | BIGGER | LESS_EQ | BIGGER_EQ | EQUALS | NOT_EQUALS | AND | OR;
SIGNAL : PLUS | MINUS | MULT | DIV;
OPSIGNAL : AUTOPLUS | AUTOMINUS | AUTOMULT | AUTODIV;

//! Operations
ASSIGN    : '=';
PLUS      : '+';
MINUS     : '-';
MULT      : '*';
DIV	      : '/';
INCREM    : '++';
DECREM    : '--';
AUTOPLUS  : '+=';
AUTOMINUS : '-=';
AUTOMULT  : '*=';
AUTODIV   : '/=';
LESS  	  : '<';
BIGGER    : '>';
LESS_EQ   : '<=';
BIGGER_EQ : '>=';
EQUALS    : '==';
NOT_EQUALS: '!=';
AND       : '&&';
OR 	      : '||';

OPEN_PAR   : '(';
CLOSE_PAR  : ')';
OPEN_KEY   : '{';
CLOSE_KEY  : '}';
OPEN_BRAK  : '[';
CLOSE_BRAK : ']';
COMMA	   : ',';
SEMICOLON  : ';';
TWOPOINTS  : ':';

TRUE : 'true';
FALSE : 'false';

VALUE 	: DIGIT+ | TRUE | FALSE | LITERAL;
ID 		: ID_LETTER (ID_LETTER | DIGIT)*;
LITERAL : '\'' (DIGIT | ID_LETTER)+ '\'';

fragment ID_LETTER : 'a' .. 'z' | 'A' .. 'Z' | '_';
fragment DIGIT : '0' ..'9';

WHITE_SPACE  : (' ' | '\t' | '\r' | '\n')+ -> channel(HIDDEN);
LINE_COMMENT : '//' ~('\r' | '\n')* -> channel(HIDDEN);
COMMENT 	 : '/*' .*? '*/' -> channel(HIDDEN);