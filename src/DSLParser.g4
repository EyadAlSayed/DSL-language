parser grammar DSLParser;

options { tokenVocab=DSLLexer; }

dslDocument:
    pageStructure NEWLINE*
   |controllerElement NEWLINE*
   ;


//CAESAR
pageStructure: PAGE WHITE_SPACE* FILE_NAME_ID space headerStructure space body?  space END_PAGE;
headerStructure: HEADER space value space  ENDHEADER;

//SALEM

body : BODY_DEF_ID space bodyAttribute*  BODY_DEF_END_ID;
bodyAttribute :
          text space
        | form space
        ;

text : TEXT_DEF_ID space textName space value space TEXT_DEF_END_ID; // it was 'value*'
textName : NAME space ASSIGN space TEXT;


value : VALUE WHITE_SPACE* ASSIGN WHITE_SPACE* TEXT;


//ABD

form:
    (POST_FORM | GET_FORM) space form_attribute* children*  END_FORM
    ;

form_attribute:
    (NAME|ACTION) WHITE_SPACE* ASSIGN WHITE_SPACE* TEXT space
    ;

children:
     space text_input space
    | space email_input space
    | space password_input space
    | space radio_group space
    | space radio_input space
    | space checkbox_input space
    | space submit_button space
    | space text  space
    ;


text_input:
    TEXT_FIELD space attribute* END_TEXT_FIELD space
    ;

email_input:
    EMAIL_FIELD space attribute* END_EMAIL_FIELD space
    ;

password_input:
    PASSWORD_FIELD space attribute* END_PASSWORD_FIELD space
    ;

radio_input
    :RADIO_FIELD space attribute*  END_RADIO_FIELD space
    ;

radio_group:
    RADIO_GROUP space  NAME WHITE_SPACE* ASSIGN WHITE_SPACE* TEXT space radio_input* space END_RADIO_GROUP space
    ;

checkbox_input
    :CHECKBOX_FIELD space attribute*  END_CHECKBOX_FIELD space
    ;


submit_button:
   SUBMIT_BUTTON space attribute* END_SUBMIT_BUTTON space
    ;



attribute:
 space   (NAME|VALUE|TEXT_DEF) WHITE_SPACE* ASSIGN WHITE_SPACE* TEXT space
    ;

//EYAD

controllerElement:  controllerDef;
controllerDef: CONTROLLER_DEF_ID WHITE_SPACE* FILE_NAME_ID space  (controllerTokens | NEWLINE)+  WHITE_SPACE*  CONTROLLER_DEF_END_ID;

controllerTokens:
    bundle
    |ifCondition
    |action
    ;

bundle : var WHITE_SPACE* ASSIGN  WHITE_SPACE* BUNDLE_ID WHITE_SPACE* OPEN_SQR_BRACKT_ID WHITE_SPACE* TEXT WHITE_SPACE* CLOSE_SQR_BRACKT_ID space;
ifCondition : IF_ID WHITE_SPACE* OPEN_PAR_BRACKT_ID WHITE_SPACE* condition+ WHITE_SPACE* CLOSE_PAR_BRACKT_ID space ifBody;

ifBody: IFBODY_DEF_ID space ifBodyTokens+ WHITE_SPACE* IFBODY_DEF_END_ID space ;
ifBodyTokens:
    ifCondition
    |bundle
    |action
    |varDeclear;

varDeclear: VAR_NAME_ID WHITE_SPACE* ASSIGN WHITE_SPACE* textValue ;
condition : var WHITE_SPACE* logicalOp WHITE_SPACE* textValue WHITE_SPACE* logicalOp? WHITE_SPACE*;
var: VAR_NAME_ID;
logicalOp: AND_OP_ID|OR_OP_ID|EQUAL_OP_ID;
action: PRINT_ACTION WHITE_SPACE* textValue space;
textValue :  (TEXT |TEXTNUM) ;

space: (NEWLINE+ | WHITE_SPACE)*;









