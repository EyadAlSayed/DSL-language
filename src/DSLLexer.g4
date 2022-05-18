lexer grammar  DSLLexer;



// KEY TOKENS

NAME: 'name';

VALUE : 'value';

BODY_DEF_ID : 'Body';

BODY_DEF_END_ID : 'endBody';

TEXT_DEF_ID : 'Text';

TEXT_DEF_END_ID : 'endText';

TITLE : 'Title';

PAGE: 'Page';

EMAIL_AS_PARAMETER: 'email';

TEXT_AS_PARAMETER: 'text';

PASSWORD_AS_PARAMETER: 'password';

DATE_AS_PARAMETER: 'date';

END_PAGE: 'endPage';

HEADER: 'Head';

ENDHEADER: 'endHead';

ACTION:'action' ;

METHOD:'method';

POST_FORM:'PostForm';

GET_FORM:'GetForm';

END_FORM:'endForm';

SUBMIT_BUTTON:'SubmitButton';

END_SUBMIT_BUTTON:'endSubmitButton';

TEXT_FIELD:'TextField';

END_TEXT_FIELD:'endTextField';

EMAIL_FIELD:'EmailField';

END_EMAIL_FIELD:'endEmailField';

PASSWORD_FIELD:'PasswordField';

END_PASSWORD_FIELD:'endPasswordField';

CHECKBOX_FIELD:'CheckBoxField' ;

END_CHECKBOX_FIELD:'endCheckBoxField' ;

RADIO_FIELD:'RadioField';

END_RADIO_FIELD:'endRadioField';

CONTROLLER_DEF_ID: 'Controller';

CONTROLLER_DEF_END_ID: 'endController';

RADIO_GROUP
    : 'RadioGroup'
    ;

END_RADIO_GROUP
    : 'endRadioGroup'
    ;

BUNDLE_ID:'Bundle';

IF_ID:'if';

IFBODY_DEF_ID:'ifBody';

IFBODY_DEF_END_ID : 'endIfBody';

AND_OP_ID : 'AND';

OR_OP_ID : 'OR';

EQUAL_OP_ID : 'EQUAL';

PRINT_ACTION:'print';


//SYMBOL TOKENS

NEWLINE: '\n';

WHITE_SPACE:  (' '|'\t'|'\r');

SINGLE_QUOTE: '\'';

DOUBLE_QUOTE: '"';

ASSIGN : '=';

OPEN_SQR_BRACKT_ID : '[';

CLOSE_SQR_BRACKT_ID : ']';

OPEN_PAR_BRACKT_ID : '(';

CLOSE_PAR_BRACKT_ID : ')';

OPEN_CURLY_BRACES: '{';

CLOSE_CURLY_BRACES: '}';

COMMA: ',';

//FRAGMENT TOKENS

VAR_NAME_ID: '_' [a-zA-Z]+ [1-9]*;

//VAR_ID: [a-zA-Z]+ ([1-9]+ | [a-zA-Z]+ | '_')*;

FILE_NAME_ID: [a-zA-Z]+ [1-9]* | [a-zA-Z]+  [1-9]+ ;



TEXT: DOUBLE_QUOTE (([a-zA-Z]+ | [1-9]+)+ | WHITE_SPACE)* DOUBLE_QUOTE;
TEXTNUM: [1-9]+;
//TEXTCHAR: ([a-zA-Z] | [1-9])+;
