parser grammar DSLParser;

options { tokenVocab=DSLLexer; }

dslDocument:
controllerElement
;
controllerElement:
controllerDef
;


controllerDef: CONTROLLER_DEF_ID SPACE* var  controllerTokens+ SPACE* CONTROLLER_DEF_END_ID;

controllerTokens:
bundle
|singleCondition
|doubleCondition
|action
;

bundle : VAR_NAME_ID SPACE* ASSIGN  SPACE* BUNDLE_ID SPACE* OPEN_SQR_BRACKT_ID SPACE* name SPACE* CLOSE_SQR_BRACKT_ID;
singleCondition :IF_ID SPACE* OPEN_PAR_BRACKT_ID SPACE* var SPACE* logicalOp SPACE* name SPACE* CLOSE_PAR_BRACKT_ID;
doubleCondition: IF_ID SPACE* OPEN_PAR_BRACKT_ID SPACE* var SPACE* logicalOp SPACE* NAME_ID SPACE* logicalOp SPACE* var SPACE* logicalOp SPACE* name SPACE*CLOSE_PAR_BRACKT_ID;

var: VAR_NAME_ID;
name: NAME_ID;
logicalOp: AND_OP_ID|OR_OP_ID|EQUAL_OP_ID;
action: PRINT_ACTION SPACE* NAME_ID+;
