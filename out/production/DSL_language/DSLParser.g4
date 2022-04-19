parser grammar DSLParser;

options { tokenVocab=DSLLexer; }

dslDocument:
    pageStructure NEWLINE*
   |controllerElement NEWLINE*
   ;


//CAESAR
pageStructure: PAGE WHITE_SPACE* FILE_NAME_ID WHITE_SPACE* NEWLINE space headerStructure space body? NEWLINE space END_PAGE;
headerStructure: HEADER space value TEXT+  NEWLINE space ENDHEADER;

//SALEM

body : BODY_DEF_ID space bodyAttribute*  BODY_DEF_END_ID;
bodyAttribute :
          text space
        | form space
        ;

text : TEXT_DEF_ID space  textName space  textAttribute* space TEXT_DEF_END_ID;
textName : NAME space ASSIGN space  TEXT*  ;
textAttribute : value;

value : VALUE WHITE_SPACE* ASSIGN WHITE_SPACE* TEXT+;


//ABD

form:
    (POST_FORM | GET_FORM)  NEWLINE+ form_attribute* children*  END_FORM
    ;

form_attribute:
    (NAME|ACTION) WHITE_SPACE* ASSIGN WHITE_SPACE* TEXT NEWLINE+
    ;

children:
    text_input
    | email_input
    | password_input
    | radio_group
    | radio_input
    | checkbox_input
    | submit_button
    ;


text_input:
    TEXT_FIELD NEWLINE+ attribute* children* END_TEXT_FIELD NEWLINE+
    ;

email_input:
    EMAIL_FIELD NEWLINE+ attribute* children* END_EMAIL_FIELD NEWLINE+
    ;

password_input:
    PASSWORD_FIELD NEWLINE+ attribute* children* END_PASSWORD_FIELD NEWLINE+
    ;

radio_input
    :RADIO_FIELD NEWLINE+ attribute*  END_RADIO_FIELD NEWLINE+
    ;

radio_group:
    RADIO_GROUP NEWLINE+  NAME WHITE_SPACE* ASSIGN WHITE_SPACE* TEXT NEWLINE+ radio_input* END_RADIO_GROUP NEWLINE+
    ;

checkbox_input
    :CHECKBOX_FIELD  NEWLINE+ attribute*  END_CHECKBOX_FIELD NEWLINE+
    ;


submit_button:
   SUBMIT_BUTTON NEWLINE+ attribute* END_SUBMIT_BUTTON NEWLINE+
    ;



attribute:
    (NAME|VALUE|TEXT_DEF) WHITE_SPACE* ASSIGN WHITE_SPACE* TEXT NEWLINE+
    ;



//EYAD

controllerElement:  controllerDef;
controllerDef: CONTROLLER_DEF_ID WHITE_SPACE* FILE_NAME_ID NEWLINE+  (controllerTokens | NEWLINE)+  WHITE_SPACE*  CONTROLLER_DEF_END_ID;

controllerTokens:
    bundle
    |ifCondition
    |action
    ;

bundle : VAR_NAME_ID WHITE_SPACE* ASSIGN  WHITE_SPACE* BUNDLE_ID WHITE_SPACE* OPEN_SQR_BRACKT_ID WHITE_SPACE* TEXT WHITE_SPACE* CLOSE_SQR_BRACKT_ID;
ifCondition : IF_ID WHITE_SPACE* OPEN_PAR_BRACKT_ID WHITE_SPACE* condition+ WHITE_SPACE* CLOSE_PAR_BRACKT_ID;

condition : var WHITE_SPACE* logicalOp WHITE_SPACE* textname WHITE_SPACE* logicalOp* WHITE_SPACE*;
var: VAR_NAME_ID;
logicalOp: AND_OP_ID|OR_OP_ID|EQUAL_OP_ID;
action: PRINT_ACTION WHITE_SPACE* textname;
textname :  (TEXT |TEXTNUM) ;

space: (NEWLINE+ | WHITE_SPACE)*;









