
grammar FreedomLessLess;

program_def:
	 attribute_def* function_def* class_def* main_def ;

class_def:
	CLASS ID OPEN_KEY class_members_def CLOSE_KEY ;

class_members_def:
	private_def |
	public_def private_def? ;

public_def:
	PUBLIC class_scope_def ;

private_def:
	PRIVATE class_scope_def ;

class_scope_def:
	(attribute_def SEMICOLON)* function_def* ;

attribute_def:
	type_def ID (ASSIGN valued_expression_def)? (COMMA ID (ASSIGN valued_expression_def)?)* |
	type_def ID OPEN_BRAK INT CLOSE_BRAK (ASSIGN valued_expression_def)? (COMMA ID OPEN_BRAK INT CLOSE_BRAK (ASSIGN valued_expression_def)?)* |
	type_def MULT ID (ASSIGN valued_expression_def)? (COMMA MULT ID (ASSIGN valued_expression_def)?)* ;

valued_expression_def:
	value_def operation|
	function_call_def operation |
	(MULT | REF) OPEN_PAR valued_expression_def CLOSE_PAR operation |
	ID (((ASSIGN | auto_assign_op) valued_expression_def) | auto_increm_op | OPEN_BRAK INT CLOSE_BRAK )? operation ;

operation:
	((logical_op | arithmetic_op) valued_expression_def)* ;

function_call_def:
	DELETE ID |
	FREE OPEN_PAR ID CLOSE_PAR |
	NEW ID OPEN_PAR argument_def? CLOSE_PAR |
	MALLOC OPEN_PAR valued_expression_def CLOSE_PAR |
	SIZEOF OPEN_PAR type_def (MULT | OPEN_BRAK INT CLOSE_BRAK)? CLOSE_PAR |
	(ID ('.' | ARROW))? ID OPEN_PAR argument_def? CLOSE_PAR (('.' | ARROW) ID OPEN_PAR argument_def? CLOSE_PAR)* ;

argument_def:
	valued_expression_def (COMMA valued_expression_def)* ;

function_def:
	VOID_T ID OPEN_PAR param_def? CLOSE_PAR block_def |
	type_def (MULT | OPEN_BRAK INT CLOSE_BRAK)? ID OPEN_PAR param_def? CLOSE_PAR block_def ;

param_def:
	type_def MULT ID (COMMA param_def)* |
	type_def ID (OPEN_BRAK INT CLOSE_BRAK)? (COMMA param_def)*;

block_def:
	OPEN_KEY (valueless_expression_def SEMICOLON | struct_def)* CLOSE_KEY ;

valueless_expression_def:
	BREAK |
	CONTINUE |
	attribute_def |
	function_call_def |
	RETURN valued_expression_def |
	(MULT OPEN_PAR ID CLOSE_PAR | ID) ((ASSIGN | auto_assign_op) valued_expression_def | auto_increm_op) ;

struct_def:
	if_def |
	for_def |
	while_def |
	switch_def ;

if_def:
	IF OPEN_PAR valued_expression_def CLOSE_PAR block_def (ELSE block_def)? ;

for_def:
	FOR OPEN_PAR valued_attribute_def (COMMA valued_attribute_def)* SEMICOLON valued_expression_def SEMICOLON valued_expression_def (COMMA valued_expression_def)* CLOSE_PAR block_def ;

valued_attribute_def:
	type_def (MULT ID | ID OPEN_BRAK INT CLOSE_BRAK) ASSIGN valued_expression_def ;

while_def:
	WHILE OPEN_PAR valued_expression_def CLOSE_PAR block_def ;

switch_def:
	SWITCH OPEN_PAR valued_expression_def CLOSE_PAR OPEN_KEY switch_case_def* switch_default_def CLOSE_KEY ;

switch_case_def:
	CASE value_def TWOPOINTS (valueless_expression_def SEMICOLON | struct_def)+ BREAK SEMICOLON ;

switch_default_def:
	DEFAULT TWOPOINTS (valueless_expression_def SEMICOLON | struct_def)* BREAK SEMICOLON ;

main_def:
	VOID_T MAIN OPEN_PAR INT_T ID COMMA CHAR_T MULT MULT ID CLOSE_PAR block_def ;

type_def:
	INT_T |
	DOUBLE_T |
	CHAR_T |
	BOOL_T |
	CLASS ID ;

value_def:
	INT |
	CHAR |
	STRING |
	INTEGER |
	FLOATING |
	BOOLEAN |
	NULL ;

logical_op:
	LESS |
	BIGGER |
	LESS_EQ |
	BIGGER_EQ |
	EQUALS |
	NOT_EQUALS |
	AND |
	OR ;

arithmetic_op:
	PLUS |
	MINUS |
	MULT |
	DIV ;

auto_assign_op:
	AUTOPLUS |
	AUTOMINUS |
	AUTOMULT |
	AUTODIV ;

auto_increm_op:
	INCREM |
	DECREM ;

//! Primitive types
INT_T		: 'int';
UNSIGNED_T	: 'unsigned';
FLOAT_T		: 'float';
DOUBLE_T	: 'double';
SHORT_T		: 'short';
CHAR_T		: 'char';
BOOL_T		: 'bool';
VOID_T		: 'void';

//! Some reserved words
IMPORT		: 'import';
CLASS		: 'class';
PUBLIC		: 'public' TWOPOINTS;
PRIVATE		: 'private' TWOPOINTS;
MAIN		: 'main';

//! Primitive structs
IF		: 'if';
ELSE	: 'else';
FOR		: 'for';
WHILE	: 'while';
SWITCH	: 'switch';
CASE	: 'case';
BREAK	: 'break';
CONTINUE: 'continue';
DEFAULT	: 'default';
RETURN	: 'return';

//! Memory Allocation
NEW		: 'new' ;
FREE	: 'free' ;
MALLOC	: 'malloc' ;
DELETE	: 'delete' ;
SIZEOF	: 'sizeof' ;

//! Operations and operators
ASSIGN		: '=';
PLUS		: '+';
MINUS		: '-';
MULT		: '*';
DIV			: '/';
REF			: '&';
ARROW		: '->';
INCREM		: '++';
DECREM		: '--';
AUTOPLUS	: '+=';
AUTOMINUS	: '-=';
AUTOMULT	: '*=';
AUTODIV		: '/=';
LESS		: '<';
BIGGER		: '>';
LESS_EQ		: '<=';
BIGGER_EQ	: '>=';
EQUALS		: '==';
NOT_EQUALS	: '!=';
AND			: '&&';
OR			: '||';

//! Control tokens
OPEN_PAR	: '(';
CLOSE_PAR	: ')';
OPEN_KEY	: '{';
CLOSE_KEY	: '}';
OPEN_BRAK	: '[';
CLOSE_BRAK	: ']';
COMMA		: ',';
SEMICOLON	: ';';
TWOPOINTS	: ':';

//! Another types
NULL	: 'null' ;
INT		: NUMBER+ ;
INTEGER	: '-'? INT ;
BOOLEAN	: 'true' | 'false' ;
STRING	: '"' ~('"')* '"' ;
CHAR	: '\'' ~('\'') '\'' ;
FLOATING: INTEGER ? '.' INT ;
ID		: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

//! Desconsidered text
COMMENT		: ('/*' .*? '*/') -> channel(HIDDEN) ;
WS			: ( ' ' | '\t' | '\r' | '\n') -> channel(HIDDEN) ;
LINE_COMMENT: ('//' ~('\n'|'\r')* '\r'? '\n') -> channel(HIDDEN) ;

//! Auxiliary datas
fragment NUMBER	: '0'..'9' ;
fragment ESC	: '\\' ('b' | 't' | 'n' | 'f' | 'r') ;
