lexer grammar  DSLLexer;


// EYAD start here !
// Controller Tokens


// symbols

ASSIGN : '=';

OPEN_SQR_BRACKT_ID : '[';
CLOSE_SQR_BRACKT_ID : ']';

OPEN_PAR_BRACKT_ID : '(';
CLOSE_PAR_BRACKT_ID : ')';

SPACE : ' ';

// controller definition
CONTROLLER_DEF_ID: 'Controller';
CONTROLLER_DEF_END_ID: 'endController';

// controller words
BUNDLE_ID:'BUNDLE' | 'bundle' | 'Bundle';
VAR_NAME_ID: '_' [a-zA-Z]+ [1-9]*;
NAME_ID : [a-zA-Z]+;

// controller actions
PRINT_ACTION:'print';

// logical operation
AND_OP_ID : 'and' | 'AND';
OR_OP_ID : 'or' | 'OR';
EQUAL_OP_ID : 'equal';

// condition
IF_ID:'if'|'IF';

// Eyad  end here !