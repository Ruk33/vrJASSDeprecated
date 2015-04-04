grammar vrJASS;

/*
 * Where everything begins
 */
inits:	libraryBlockStatement 
	 |	scopeBlockStatement
	 |	structBlockStatement
	 |	functionStatement
	 |	globalBlockStatement
	 ;  
	
init: (inits (EOL inits)*)?;

/*
 * Mini-helpers
 */
nonePublicPrivateVisibility: (PUBLIC | PRIVATE)?;
publicPrivateProtectedVisiblity: PUBLIC | PRIVATE | PRIVATE;

variableType : THISTYPE | ID;

/*
 * Expression time
 */
argList : '(' exprList ')' | '(' ')';
 
mathExpression: ('*'|'/'|'-'|'+') expr;
functionExpression: ID argList;
methodExpression: DOT functionExpression;
variableArrayExpression: ID '[' expr ']';
variableExpression: THIS | THISTYPE | ID;
propertyExpression: DOT ID; 
integerExpression: INTEGER;
realExpression: REAL;
stringExpression: STRING;
booleanExpression: TRUE | FALSE;
comparisonExpression: (EQUAL | NOT_EQUAL | GREATER_THAN | GREATER_THAN_OR_EQUAL_THAN | LOWER_THAN | LOWER_THAN_OR_EQUAL_THAN) expr;
orExpression: OR expr;
andExpression: AND expr;
notExpression: NOT expr;
parenthesisExpression: '(' expr ')';
nullExpression: NULL;

expr:	mathExpression
	|	functionExpression
	|	expr methodExpression
	|	integerExpression
	|	realExpression
	|	stringExpression
	|	nullExpression
	|	booleanExpression
	|	expr comparisonExpression
	|	expr orExpression
	|	expr andExpression
	|	notExpression
	|	parenthesisExpression
	|	expr propertyExpression
	|	variableArrayExpression
	|	variableExpression
	;

exprList : expr (',' expr)*;

/*
 * Statement time
 */
debugStatement: DEBUG stat;

elseIfStatement: ELSEIF '(' expr ')' (THEN)? EOL stat*;
elseStatement: ELSE EOL stat*;
ifStatement: IF '(' expr ')' (THEN)? EOL stat* (elseIfStatement)* (elseStatement)? (ENDIF | END);

breakStatement: BREAK;
continueStatement: CONTINUE;
exitWhenStatement: EXITWHEN '(' expr ')';
forStatement : FOR '(' expr ';' expr ';' expr ')' EOL stat* (ENDFOR | END); // <- are u sure that it can be three expressions?
whileStatement : WHILE '(' expr ')' EOL stat* (ENDWHILE | END);
loopStatement : LOOP '(' expr ')' EOL stat* (ENDLOOP | END);

returnStatement : RETURN expr;

functionCallStatement: CALL functionExpression;
methodCallStatement: CALL expr methodExpression;

variableStatement: variableType variableExpression ('=' expr)?;
globalVariableStatement: nonePublicPrivateVisibility (CONSTANT)? variableStatement;
localVariableArrayStatement: LOCAL variableType variableArrayExpression;
localVariableStatement: LOCAL variableStatement;
setVariableStatement: SET ((expr propertyExpression) | variableArrayExpression | variableExpression) '=' expr;

propertyVisibility: (PUBLIC | PRIVATE | READONLY)?;
propertyStatement: propertyVisibility (STATIC)? (CONSTANT)? variableStatement;

stat: EOL
	| expr
	| ifStatement 
	| whileStatement 
	| forStatement 
	| loopStatement 
	| returnStatement 
	| functionCallStatement 
	| methodCallStatement
	| localVariableArrayStatement
	| localVariableStatement
	| propertyExpression
	| setVariableStatement
	| debugStatement
	;

/*
 * Block statements
 */
globalBlockStatement: GLOBAL EOL ((globalVariableStatement)? EOL)* (ENDGLOBAL | END);

typeArgumentList : NOTHING | typeArgument (',' typeArgument)*;
typeArgument : variableType variableExpression;

functionStatement: nonePublicPrivateVisibility FUNCTION ID TAKES typeArgumentList RETURNS (ID | NOTHING) EOL stat* (ENDFUNCTION | END);
methodStatement: nonePublicPrivateVisibility (STATIC | STUB)? METHOD ID TAKES typeArgumentList RETURNS (variableType | NOTHING) EOL stat* (ENDMETHOD | END);

structBlockStatement
	:	nonePublicPrivateVisibility STRUCT ID (EXTENDS ID)? EOL
			((methodStatement|propertyStatement)? EOL)*
		(ENDSTRUCT | END)
	;

scopeBlockStatement
	:	SCOPE ID (INITIALIZER ID)? EOL
			((structBlockStatement|functionStatement|globalBlockStatement)? EOL)*
		(ENDSCOPE | END)
	;

requirementList : ID (',' ID)*;
libraryBlockStatement
	:	LIBRARY ID (INITIALIZER ID)? (REQUIRES requirementList)? EOL
			((scopeBlockStatement|structBlockStatement|functionStatement|globalBlockStatement)? EOL)*
		(ENDLIBRARY | END)
	;

/*
 * 
 */
// Tired of endmethod, endfunction, ...? Me too 
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

EQUAL : '==';
NOT_EQUAL : '!=';
GREATER_THAN : '>';
GREATER_THAN_OR_EQUAL_THAN : '>=';
LOWER_THAN : '<';
LOWER_THAN_OR_EQUAL_THAN : '<=';

INT : [0-9]+;
EOL : [\r\n]+;
ID : [a-zA-Z_][a-zA-Z0-9_]*;
WS : [ \t]+ -> skip;