grammar FreedomLessLess;

file:
	import_def? (class_def | function_def)* mainFunction;

import_def : (IMPORT STRING)+;

class_def
	: CLASS ID OPEN_KEY classMembers CLOSE_KEY SEMICOLON
	;

classMembers
	: public_def private_def? | private_def
	;

public_def
	: PUBLIC class_scope_def
	;

private_def
	: PRIVATE class_scope_def
	;

class_scope_def
	: decl_def* function_def*
	;

decl_def
	: scoped_decl_def SEMICOLON
	| vector_def SEMICOLON
	;

function_def:
	type_def ID OPEN_PAR param_def? CLOSE_PAR
		block_def
	SEMICOLON
	;

param_def
	: type_def ID (COMMA type_def ID)*
	;

arg_def
	: exp_def (COMMA exp_def)*
	;

struct_def
	: if_def
	| for_def
	| while_def
	| switch_def
	;

if_def
	: IF OPEN_PAR exp_def CLOSE_PAR
		block_def
	  (ELSE block_def)?
	;

for_def
	: FOR OPEN_PAR
		scoped_decl_def? SEMICOLON
		exp_def? SEMICOLON
		exp_def?
	  CLOSE_PAR
	  	block_def
	;

while_def
	: WHILE OPEN_PAR exp_def CLOSE_PAR
		block_def
	;

switch_def
	: SWITCH OPEN_PAR exp_def CLOSE_PAR
	  OPEN_KEY
		( CASE value_def TWOPOINTS
			(exp_def SEMICOLON)+
		)*
		  DEFAULT TWOPOINTS
		  	(exp_def SEMICOLON)*
	  CLOSE_KEY
	;

block_def
	: OPEN_KEY
		(exp_def SEMICOLON | struct_def)+
	  CLOSE_KEY
	;

exp_def  //! Exp tudo o que gera um valor final
	: funcCall_def
	| scoped_decl_def
	| vector_def
	| value_def
	| exp_def (op_logical | op_arithmetic) exp_def
	| ID ( ((ASSIGN | op_auto_assign) exp_def) | op_auto_increm )?
	| RETURN exp_def
	| BREAK
	| CONTINUE
	;

funcCall_def: ID OPEN_PAR arg_def CLOSE_PAR;

scoped_decl_def
	: type_def ID (ASSIGN exp_def)? (COMMA ID (ASSIGN exp_def)?)*
	| CLASS ID ID (ASSIGN exp_def)? (COMMA ID (ASSIGN exp_def)?)*
	;

vector_def
	: type_def ID OPEN_BRAK INTEGER CLOSE_BRAK (ASSIGN exp_def)?
	| CLASS ID ID OPEN_BRAK INTEGER CLOSE_BRAK (ASSIGN exp_def)?
	;

mainFunction : INT_T MAIN OPEN_PAR INT_T ID COMMA CHAR_T MULT MULT ID CLOSE_PAR block_def;

type_def
	: INT_T
	| UNSIGNED_T
	| SHORT_T
	| FLOAT_T
	| DOUBLE_T
	| CHAR_T
	| BOOL_T
	| VOID_T
	;

value_def
	: STRING
	| INTEGER
	| FLOATING
	| BOOLEAN
	| NULL
	;

op_logical
	: LESS
	| BIGGER
	| LESS_EQ
	| BIGGER_EQ
	| EQUALS
	| NOT_EQUALS
	| AND
	| OR
	;

op_arithmetic
	: PLUS
	| MINUS
	| MULT
	| DIV
	;

op_auto_assign
	: AUTOPLUS
	| AUTOMINUS
	| AUTOMULT
	| AUTODIV
	;

op_auto_increm
	: INCREM
	| DECREM
	;

//! TOKENS ONLY | ! V

//! Primitive types
INT_T	   : 'int';
UNSIGNED_T : 'unsigned';
FLOAT_T	   : 'float';
DOUBLE_T   : 'double';
SHORT_T    : 'short';
CHAR_T     : 'char';
BOOL_T     : 'bool';
VOID_T     : 'void';

IMPORT	   : 'import';
CLASS	   : 'class';
PUBLIC	   : 'public' TWOPOINTS;
PRIVATE	   : 'private' TWOPOINTS;
MAIN	   : 'main';

//! Primitive structs
IF		 : 'if';
ELSE     : 'else';
FOR      : 'for';
WHILE    : 'while';
SWITCH   : 'switch';
CASE     : 'case';
BREAK    : 'break';
CONTINUE : 'continue';
DEFAULT  : 'default';
RETURN   : 'return';

//! Operations
ASSIGN : '=';
PLUS   : '+';
MINUS  : '-';
MULT   : '*';
DIV    : '/';

INCREM : '++';
DECREM : '--';

AUTOPLUS  : '+=';
AUTOMINUS : '-=';
AUTOMULT  : '*=';
AUTODIV   : '/=';

LESS	   : '<';
BIGGER	   : '>';
LESS_EQ	   : '<=';
BIGGER_EQ  : '>=';
EQUALS     : '==';
NOT_EQUALS : '!=';
AND	 	   : '&&';
OR		   : '||';

OPEN_PAR   : '(';
CLOSE_PAR  : ')';
OPEN_KEY   : '{';
CLOSE_KEY  : '}';
OPEN_BRAK  : '[';
CLOSE_BRAK : ']';
COMMA	   : ',';
SEMICOLON  : ';';
TWOPOINTS  : ':';

TRUE  : 'true';
FALSE : 'false';
NULL  : 'null';

STRING
	: '"' ( ESC | ~ ["\\])* '"'
	| '\'' ( ESC | ~ ["\\])* '\''
	;

BOOLEAN
	: TRUE
	| FALSE
	;

INTEGER
	: '-'? INT
	;

FLOATING
	: '-'? INT '.' [0-9]+
	;

fragment INT
	: '0'
	| [1-9] [0-9]*
	;

fragment ESC
	: '\\' (["\\/bfnrt])
	;

ID	: [_A-Za-z] [_0-9A-Za-z]*
	;

WS: [ \t\n\r]+ -> channel(HIDDEN);
LINE_COMMENT: '//' ~('\r' | '\n')* -> channel(HIDDEN);
COMMENT: '/*' .*? '*/' -> channel(HIDDEN);