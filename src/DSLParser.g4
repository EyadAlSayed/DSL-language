parser grammar DSLParser;

options { tokenVocab=DSLLexer; }

dslDocument:
controllerElement
;
controllerElement:
controllerTokens*
;
controllerTokens:
controllerDef
|bundle
|doubleCondition
| singleCondition
|action
;


controllerDef: CONTROLLER_DEF_ID SPACE NAME_ID SPACE;
bundle : VAR_NAME_ID SPACE ASSIGN  SPACE BUNDLE_ID SPACE OPEN_SQR_BRACKT_ID SPACE NAME_ID SPACE CLOSE_SQR_BRACKT_ID;
singleCondition :IF_ID OPEN_PAR_BRACKT_ID SPACE VAR_NAME_ID SPACE logicalOp SPACE NAME_ID SPACE CLOSE_PAR_BRACKT_ID;
doubleCondition: IF_ID OPEN_PAR_BRACKT_ID SPACE VAR_NAME_ID SPACE logicalOp SPACE NAME_ID SPACE logicalOp SPACE VAR_NAME_ID SPACE logicalOp SPACE NAME_ID SPACE CLOSE_PAR_BRACKT_ID;
logicalOp: AND_OP_ID|OR_OP_ID|EQUAL_OP_ID;
action: PRINT_ACTION SPACE NAME_ID+;
