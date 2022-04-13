lexer grammar  DSLLexer;


// EYAD start here !
// Controller Tokens

// condition
IF_ID:'if'|'IF';

// logical operation
AND_OP_ID : 'and' | 'AND';
OR_OP_ID : 'or' | 'OR';
EQUAL_OP_ID : 'equal'|'EQUAL';

// symbols

ASSIGN : '=';

OPEN_SQR_BRACKT_ID : '[';
CLOSE_SQR_BRACKT_ID : ']';

OPEN_PAR_BRACKT_ID : '(';
CLOSE_PAR_BRACKT_ID : ')';

SPACE : ' ';

// controller definition
CONTROLLER_DEF_ID: 'Controller'|'controller'|'CONTROLLER';
CONTROLLER_DEF_END_ID: 'endController'|'endcontroller'| 'ENDCONTROLLER'|'EndController' ;

// controller words
BUNDLE_ID:'BUNDLE' | 'bundle' | 'Bundle';
VAR_NAME_ID: ('_' [a-zA-Z]+ [1-9]*) | ('_' [1-9]+ [a-zA-Z]*);
NAME_ID : '\'' ~[<']* '\'';

// controller actions
PRINT_ACTION:'print'|'PRINT';
// Eyad  end here !