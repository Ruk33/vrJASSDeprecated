grammar vrJASS;

inits 
	:	libraryDef 
	|	scopeDef
	|	structDef 
	|	functionDef	
	|	globalDef
	;
	
init : (inits (EOL inits)*)?;

variableName : THIS | ID;
variableType : THISTYPE | ID;

arrayVariableDef : variableType ARRAY variableName;
variableDef : variableType variableName ('=' expr)?;

localArrayVariableDefStat : LOCAL arrayVariableDef;
localVariableDefStat : LOCAL variableDef;

variableAssignment : variableName ('[' intExpr ']')? ('=' | ASSERTDIV | ASSERTMINUS | ASSERTMULT | ASSERTPLUS) expr;
variableAssignmentStat : SET variableAssignment;

propertyAssignment : (variableName DOT) variableAssignment;
propertyAssignmentStat : SET propertyAssignment;

intExpr
	:	intExpr ('*' | '/') intExpr
	|	intExpr ('+' | '-') intExpr
	|	(method | THIS | THISTYPE | ID) DOT expr
	|	variableAssignment
	|	method
	|	function
	|	INTEGER
	|	THIS
	|	'(' intExpr ')'
	|	ID '[' intExpr ']'
	|	ID
	;	

expr
	:	expr ('*' | '/') expr
	|	expr ('+' | '-') expr
	|	(method | THIS | THISTYPE | ID) DOT expr
	|	variableAssignment
	|	method
	|	function
	|	INTEGER
	|	REAL
	|	STRING
	|	THIS
	|	THISTYPE
	|	TRUE
	|	FALSE
	|	NULL
	|	expr '!=' expr
	|	expr '==' expr
	|	expr '<=' expr
	|	expr '>=' expr
	|	expr '<' expr
	|	expr '>' expr
	|	expr OR expr
	|	expr AND expr
	|	NOT expr
	|	'(' expr ')'
	|	ID '[' intExpr ']'
	|	ID
	;

exprList : expr (',' expr)*;

stat 
	: expr 
	| ifStat 
	| whileStat 
	| forStat 
	| loopStat 
	| returnStat 
	| methodCall 
	| functionCall
	| localArrayVariableDefStat
	| localVariableDefStat
	| variableAssignmentStat
	;

statBlock : (((DEBUG)? stat)? EOL)*;

loopBlock : (((DEBUG)? stat | BREAK | CONTINUE | (DEBUG)? EXITWHEN '(' expr ')')? EOL)*;
forStat : FOR '(' expr ')' EOL loopBlock (ENDFOR | END);
whileStat : WHILE '(' expr ')' EOL loopBlock (ENDWHILE | END);
loopStat : LOOP '(' expr ')' EOL loopBlock (ENDLOOP | END);

ifStat 
	:	IF '(' expr ')' (THEN)? EOL 
			statBlock
		(ELSEIF '(' expr ')' (THEN)? EOL
			statBlock
		)?
		(ELSE EOL
			statBlock
		)?
		(ENDIF | END)
	;

returnStat : RETURN expr;

typeArgumentList : NOTHING | typeArgument (',' typeArgument)*;
typeArgument : variableType ID;

argList : '(' exprList ')' | '(' ')';
function : ID argList;
method : (THISTYPE | THIS | ID) DOT function;

methodCall : CALL method;
functionCall : CALL function;

globalVariableDefStat : (PUBLIC | PRIVATE)? (CONSTANT)? variableDef;

globalDef
	:	GLOBAL EOL
			((globalVariableDefStat)? EOL)*
		(ENDGLOBAL | END)
	;

functionDef 
	:	(PUBLIC | PRIVATE)? FUNCTION ID TAKES typeArgumentList RETURNS (ID | NOTHING) EOL 
			statBlock
		(ENDFUNCTION | END)
	;

methodDef
	:	(PUBLIC | PRIVATE)? (STATIC | STUB)? METHOD ID TAKES typeArgumentList RETURNS (variableType | NOTHING) EOL
			statBlock
		(ENDMETHOD | END)
	;

propertyDef : (PUBLIC | PRIVATE | READONLY)? (STATIC)? (CONSTANT)? variableDef;

structDef
	:	(PUBLIC | PRIVATE)? STRUCT ID (EXTENDS ID)? EOL
			((methodDef|propertyDef)? EOL)*
		(ENDSTRUCT | END)
	;

scopeDef
	:	SCOPE ID (INITIALIZER ID)? EOL
			((structDef|functionDef|globalDef)? EOL)*
		(ENDSCOPE | END)
	;

requirementList : ID (',' ID)*;
	
libraryDef
	:	LIBRARY ID (INITIALIZER ID)? (REQUIRES requirementList)? EOL
			((scopeDef|structDef|functionDef|globalDef)? EOL)*
		(ENDLIBRARY | END)
	;

END : 'end';

PRIVATE : 'private';
PROTECTED : 'protected';
PUBLIC : 'public';
READONLY : 'readonly';
CONSTANT : 'constant';

NOT : 'not';
AND : 'and';
OR : 'or';
TAKES : 'takes';
RETURNS : 'returns';
RETURN : 'return';
CALL : 'call';
SET : 'set';
DEBUG : 'debug';
LOCAL : 'local';
USES : 'uses';
REQUIRES : 'requires';
INITIALIZER : 'initializer';
THISTYPE : 'thistype';
THIS : 'this';
SUPER : 'super';
DELEGATE : 'delegate';
OPERATOR : 'operator';
STATIC : 'static';
ARRAY : 'array';
DEFAULTS : 'defaults';
EXTENDS : 'extends';
IMPLEMENT : 'implement';
OPTIONAL : 'optional';
HOOK : 'hook';
STUB : 'stub';

LIBRARY : 'library';
ENDLIBRARY : 'endlibrary';

SCOPE : 'scope';
ENDSCOPE : 'endscope';

STRUCT : 'struct';
ENDSTRUCT: 'endstruct';

INTERFACE : 'interface';
ENDINTERFACE : 'endinterface';

MODULE : 'module';
ENDMODULE : 'endmodule';

FUNCTION : 'function';
ENDFUNCTION : 'endfunction';

METHOD : 'method';
ENDMETHOD : 'endmethod';

FOR : 'for';
ENDFOR : 'endfor';

WHILE : 'while';
ENDWHILE : 'endwhile';

LOOP : 'loop';
EXITWHEN : 'exitwhen';
BREAK : 'break';
CONTINUE : 'continue';
ENDLOOP : 'endloop';

NOTHING : 'nothing';
TRUE : 'true';
FALSE : 'false';
NULL : 'null';
	
IF : 'if';
THEN : 'then';
ELSEIF : 'elseif';
ELSE : 'else';
ENDIF : 'endif';

GLOBAL : 'globals';
ENDGLOBAL : 'endglobals';

LINECOMMENT : '//' .*? '\r'? '\n' -> skip;
COMMENT : '/*' .*? '*/' -> skip;

ASSERTPLUS : '+=';
ASSERTMINUS : '-=';
ASSERTMULT : '*=';
ASSERTDIV : '/=';

DOT : '.';

STRING : '"' .*? '"';
REAL : ('-')? INT '.' [0-9]* | '.' INT;
RAWCODE : '\'' . . . . '\'' | '\'' . '\'';
HEX : '0x' [0-9a-fA-F]+;
INTEGER : ('-')? INT | HEX | RAWCODE;

INT : [0-9]+;
EOL : [\r\n]+;
ID : [a-zA-Z_][a-zA-Z0-9_]*;
WS : [ \t]+ -> skip;