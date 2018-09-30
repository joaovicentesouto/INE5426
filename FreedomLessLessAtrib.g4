
grammar FreedomLessLessAtrib;

program_def:
	import_def? class_def* function_def* main_def? ;

import_def:
	(IMPORT STRING {still_not_imported(STRING.val)}? )+ ;

class_def:
	CLASS ID OPEN_KEY class_members_def CLOSE_KEY {class_free_name(ID)}? ;

class_members_def:
	private_def |
	public_def private_def? ;

public_def:
	PUBLIC class_scope_def ;

private_def:
	PRIVATE class_scope_def ;

class_scope_def:
		{class_scope_def.scope = father.scope}
	(attribute_def SEMICOLON
		{attribute_def.scope = class_scope_def.scope}
	)*
	(function_def
		{function_def.scope = class_scope_def.scope}
	)* ;

attribute_def:
	type_def ID (ASSIGN valued_expression_def)?
			{scope_free_name(ID[0]) && type_def.type == valued_expression_def.type}?
		( COMMA ID (ASSIGN valued_expression_def)?
			{scope_free_name(ID[1]) && type_def.type == valued_expression_def.type}?
		)* |
	
	type_def ID (OPEN_BRAK INT CLOSE_BRAK)+ (ASSIGN valued_expression_def)?
			{scope_free_name(ID[0]) && type_def.type == valued_expression_def.type && valued_expression_def.type2 == "vector"}?
		( COMMA ID (OPEN_BRAK INT CLOSE_BRAK)+ (ASSIGN valued_expression_def)?
			{scope_free_name(ID[1]) && type_def.type == valued_expression_def.type && valued_expression_def.type2 == "vector"}?
		)* |
	
	type_def MULT+ ID (ASSIGN valued_expression_def)?
			{scope_free_name(ID[0]) && type_def.type == valued_expression_def.type && valued_expression_def.type2 == "pointers"}?
		( COMMA MULT+ ID (ASSIGN valued_expression_def)?
			{scope_free_name(ID[0]) && type_def.type == valued_expression_def.type && valued_expression_def.type2 == "pointers"}?
		)* ;

valued_expression_def:
	value_def
		{valued_expression_def.type = value_def.type}
		operation |

	function_call_def
		 {valued_expression_def.type = value_def.type} 
		 operation |

	(MULT {valued_expression_def.type = "* "} | REF {valued_expression_def.type = "& "})
		OPEN_PAR valued_expression_def CLOSE_PAR
		{valued_expression_def.type += valued_expression_def[0].type}
		operation |

	ID (
		((ASSIGN | auto_assign_op)
			{exits(ID[0])}?
			valued_expression_def
		) |
		auto_increm_op
			{!is_class(ID[0])}? |
		(OPEN_BRAK INT CLOSE_BRAK)+
			{!is_class(ID[0])}?
	)?
		{lookup(ID[0]) && INT[0].val >= 0}?
	operation
		{operation == null || function_call_def.type == operation.type}?
		{valued_expression_def.type = function_call_def.type} |
	;

operation:
	(
		(logical_op
			{operation.type == null || operation.type == "bool"}?
			{operation.type = "bool"} |
		arithmetic_op
			{operation.type == null || operation.type != "bool"}?
	) valued_expression_def
		{operation.type == null || operation.type == valued_expression_def.type}?
		{operation.type = valued_expression_def.type}
	)* ;

function_call_def:
	NEW ID OPEN_PAR argument_def? CLOSE_PAR
		{lookup(ID[0]) && is_class(ID[0])}? |

	DELETE ID
		{lookup(ID[0]) && is_class(ID[0])}? |

	FREE OPEN_PAR ID CLOSE_PAR
		{lookup(ID[0]) && is_dynamic(ID)}? |

	MALLOC OPEN_PAR valued_expression_def CLOSE_PAR
		{valued_attribute_def.size() >= 0}? |

	SIZEOF OPEN_PAR type_def (MULT+ | (OPEN_BRAK INT CLOSE_BRAK)+)? CLOSE_PAR |

	(ID ('.' | ARROW)
		{lookup(ID[0]) && is_class(ID[0])}?
	)? ID OPEN_PAR argument_def? CLOSE_PAR
		{lookup(ID[1]) && (is_function(ID[1]) && argument_def.caracteristicas == func_caract(ID[1])}?
	(('.' | ARROW) ID OPEN_PAR argument_def? CLOSE_PAR
		{lookup(ID[2]) && (is_function(ID[2]) && argument_def == func_arg(ID[2]))}?
	)* ;

argument_def:
	valued_expression_def (COMMA valued_expression_def)* ;

function_def:
	type_def (MULT+ | (OPEN_BRAK INT CLOSE_BRAK)+)? ID OPEN_PAR param_def? CLOSE_PAR block_def |
	VOID_T ID OPEN_PAR param_def? CLOSE_PAR block_def {!exits(ID)}? ;

param_def:
	type_def MULT+ ID (COMMA param_def)*
		{no_exists(ID) && (is_class(type_def.val) && )}? |

	type_def ID (OPEN_BRAK INT CLOSE_BRAK)* (COMMA param_def)*;

block_def:
	OPEN_KEY (valueless_expression_def SEMICOLON | struct_def)* CLOSE_KEY ;

valueless_expression_def:
	BREAK
		{valueless_expression_def.val = "break"} |
	CONTINUE
		{valueless_expression_def.val = "continue"} |
	attribute_def
		{valueless_expression_def.val = attribute_def.val} |
	function_call_def
		{valueless_expression_def.val = attribute_def.val} |
	RETURN valued_expression_def
		{valueless_expression_def.val = attribute_def.val} |
	(MULT OPEN_PAR ID CLOSE_PAR | ID) ((ASSIGN | auto_assign_op) valued_expression_def | auto_increm_op) ;

struct_def:
	if_def
		{struct_def.type = "if"} |
	for_def
		{struct_def.type = "for"} |
	while_def
		{struct_def.type = "while"} |
	switch_def
		{struct_def.type = "switch"} ;

if_def:
	IF OPEN_PAR valued_expression_def CLOSE_PAR block_def (ELSE block_def)? ;

for_def:
	FOR OPEN_PAR valued_attribute_def (COMMA valued_attribute_def)* SEMICOLON valued_expression_def SEMICOLON valued_expression_def (COMMA valued_expression_def)* CLOSE_PAR block_def ;

valued_attribute_def:
	type_def (
		MULT* ID
			{exits(ID[0])}? |
		ID (OPEN_BRAK INT CLOSE_BRAK)+
			{exits(ID[1])}?
	) ASSIGN valued_expression_def
		{valued_attribute_def.type = type_def.type}
		{valued_attribute_def.val = valued_expression_def.val};

while_def:
	WHILE OPEN_PAR valued_expression_def CLOSE_PAR block_def ;

switch_def:
	SWITCH OPEN_PAR valued_expression_def CLOSE_PAR OPEN_KEY switch_case_def* switch_default_def CLOSE_KEY ;

switch_case_def:
	CASE value_def TWOPOINTS (
		valueless_expression_def SEMICOLON
			{switch_default_def.val = valueless_expression_def.val} |
		struct_def
			{switch_default_def.val = valueless_expression_def.val}
	)+ BREAK SEMICOLON ;

switch_default_def:
	DEFAULT TWOPOINTS (
		valueless_expression_def SEMICOLON
			{switch_default_def.val = valueless_expression_def.val} |
		struct_def
			{switch_default_def.val = struct_def.val}
	)* BREAK SEMICOLON ;

main_def:
	VOID_T MAIN OPEN_PAR INT_T ID COMMA CHAR_T MULT MULT ID CLOSE_PAR block_def ;

type_def:
	INT_T {type_def.type = "int"} |
	UNSIGNED_T {type_def.type = "unsigned"} |
	SHORT_T {type_def.type = "short"} |
	FLOAT_T {type_def.type = "float"} |
	DOUBLE_T {type_def.type = "double"} |
	CHAR_T {type_def.type = "char"} |
	BOOL_T {type_def.type = "bool"} |
	CLASS ID {type_def.type = "class"; type_def.val = ID.val} ;

value_def:
	INT {value_def.val = INT.val} |
	CHAR  {value_def.val = CHAR.val} |
	STRING  {value_def.val = STRING.val} |
	INTEGER  {value_def.val = INTEGER.val} |
	FLOATING  {value_def.val = FLOATING.val} |
	BOOLEAN  {value_def.val = BOOLEAN.val} |
	NULL;

logical_op:
	LESS 		{logical_op.val = "<"} |
	BIGGER 		{logical_op.val = ">"} |
	LESS_EQ 	{logical_op.val = "=<"} |
	BIGGER_EQ 	{logical_op.val = ">="} |
	EQUALS 		{logical_op.val = "=="} |
	NOT_EQUALS 	{logical_op.val = "!="} |
	AND 		{logical_op.val = "&&"} |
	OR 			{logical_op.val = "||"} ;

arithmetic_op:
	PLUS  {arithmetic_op.val = "+"} |
	MINUS {arithmetic_op.val = "-"} |
	MULT  {arithmetic_op.val = "*"} |
	DIV   {arithmetic_op.val = "/"} ;

auto_assign_op:
	AUTOPLUS  {arithmetic_op.val = AUTOPLUS.val} |  ???
	AUTOMINUS {arithmetic_op.val = AUTOMINUS.val} | ???
	AUTOMULT  {arithmetic_op.val = AUTOMULT.val} |  ???
	AUTODIV   {arithmetic_op.val = AUTODIV.val} ;   ???

auto_increm_op:
	INCREM {auto_increm_op.val = "++"} |
	DECREM {auto_increm_op.val = "--"} ;

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
