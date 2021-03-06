lexer grammar  DSLLexer;



//EYAD

CONTROLLER_DEF:'Controller';
CONTROLLER_METHOD:'controls';

OPEN_CURLY_BRACKT_ID:'{';
CLOSE_CURLY_BRACKT_ID:'}';

SUM_OP_ID:'+';
MINUS_OP_ID:'-';
MULT_OP_ID:'*';
DIV_OP_ID:'/';
MOD_OP_ID:'%';
END_STATMENT_ID:';';

// KEY TOKENS




TEXT_DEF_ID : 'Text';

TITLE : 'Title';

PAGE: 'Page';

EMAIL_AS_PARAMETER: 'Email';

PASSWORD_AS_PARAMETER: 'Password';

DATE_AS_PARAMETER: 'Date';

TEXT_FIELD:'TextField';

FOR_ID:'for';
IF_ID:'if';
AND_OP_ID : 'AND';
OR_OP_ID : 'OR';
EQUAL_OP_ID : 'EQUAL';
PRINT_ACTION:'print';
RADIO_GROUP_ID : 'Radiogroup';
CHECKBOX: 'Checkbox';
CONTROLLED_BY: 'controlled' WHITE_SPACE+ 'by';
BUTTON_ID : 'Button';
FORM_ID : 'Form';
DOT : '.';
SEND : 'send';

//SYMBOL TOKENS

NEWLINE: '\n';

WHITE_SPACE:  (' '|'\t'|'\r');

DOUBLE_QUOTE: '"';


ASSIGN_OP_ID : '=';
OPEN_SQR_BRACKT_ID: '[';
CLOSE_SQR_BRACKT_ID : ']';

COMMA: ',';
OPEN_PAR_BRACKT_ID : '(';
CLOSE_PAR_BRACKT_ID : ')';

RANG:':';



//FRAGMENT TOKENS

VAR_NAME_ID: '_' [a-zA-Z]+ [1-9]*;

//VAR_ID: [a-zA-Z]+ ([1-9]+ | [a-zA-Z]+ | '_')*;

FILE_NAME_ID: [a-z]+ [1-9]* | [a-z]+  [1-9]+ ;

TEXT: DOUBLE_QUOTE (([a-zA-Z]+ | [1-9]+)+ | WHITE_SPACE)* DOUBLE_QUOTE;
TEXTNUM: [1-9]+;
//TEXTCHAR: ([a-zA-Z] | [1-9])+;

