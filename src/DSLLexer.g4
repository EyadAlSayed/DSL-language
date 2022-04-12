lexer grammar  DSLLexer;


// EYAD
// Controller Tokens

CONTROLLER_DEF_ID: 'Controller';
CONTROLLER_DEF_END_ID: 'endController';


OPEN_SQR_BRACKT_ID : '[';
CLOSE_SQR_BRACKT_ID : ']';
OPEN_PAR_BRACKT_ID : '(';
CLOSE_PAR_BRACKT_ID : ')';
BUNDLE_ID:'BUNDLE';
VAR_NAME_ID: '_'* [a-zA-Z]+;
PRINT_ACTION:'print';
AND_OP_ID : 'and' | 'AND';
OR_OP_ID : 'or' | 'OR';
EQUAL_OP_ID : 'equal';

NAME_ID : [a-zA-Z]+;


fragment
HEXDIGIT
    : [a-fA-F0-9]
    ;