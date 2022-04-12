parser grammar Parser;

options { tokenVocab=DSLLexer; }

htmlDocument
    : scriptletOrSeaWs* XML? scriptletOrSeaWs* DTD? scriptletOrSeaWs* htmlElements*
    ;

scriptletOrSeaWs
    : SCRIPTLET
    | SEA_WS
    ;

htmlElements
    : htmlMisc* htmlElement htmlMisc*
    ;


htmlElement
    :
    TAG_OPEN TAG_NAME htmlAttribute*  (TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)? | TAG_SLASH_CLOSE)
    | SCRIPTLET
    | mustach_open
    | script
    | style
    ;
htmlData: ((htmlElement| CDATA | htmlComment|htmlAttribute) htmlChardata?);

htmlContent
    :  htmlChardata? htmlData*
    | SEA_WS* model_variable  (FUNCTION_INDICATOR FUNCTION_NAME)?
    | SEA_WS* open_b
    ;

htmlAttribute
    :
    ngswitch
    |ngswitch_case
    | ngswitch_default
    |  ng_for// eyad
    |  ng_show
    |  ng_if
    |  ng_hide
    |  event
    | app
    | TYPE_EQUALS TYPE_VALUE    //type! ' '   SALEM
    | NG_MODEL_EQUALS MODEL_VALUE //ng-model! ' '   SALEM
    | TAG_NAME (TAG_EQUALS  ATTVALUE_VALUE)?
    ;


app: APP APPEQUAL APP_CLOSE;

/*  ng for keyword  */



ng_for :NGFOR NGFOREQUAL NG_FOR_CLOSE;
ngfor_close:NG_FOR_CLOSE;

ng_show :NGSHOW NGSHOWEQUAL NG_SHOW_CLOSE;


ng_hide :NGHIDE NGHIDEEQUAL NG_HIDE_CLOSE;

ng_if :NGIF NGIFEQUAL NG_IF_CLOSE;

model_variable : MODEL_VARIABLE;

//switch_content: SEA_WS* (ngswitch_case  | htmlElement | htmlComment  )* SEA_WS* ngswitch_default? SEA_WS*;

ngswitch: NGSWITCH NG_SWITCH_ATTRBIUTE NG_SWITCH_VALUE;

ngswitch_case: NGSWITCHCASE NG_SWITCH_CASE_ATTRBIUTE NG_SWITCH_CASE_VALUE ;

ngswitch_default: NGSWITCHDEFAULT ;

ngmodel:TAG_OPEN_INPUT  (TYPE_EQUALS TYPE_VALUE NG_MODEL_EQUALS MODEL_VALUE)+ TAG_SLASH_CLOSE_INPUT ;


/* event */
event:EVENT EVENTEQUAL EVENT_CLOSE;

/*  mustach template  */
mustach_open : (SEA_WS* TAG_OPEN_MUSTACH SEA_WS* mustach_body SEA_WS*MUSTACH_CLOSE) ;
mustach_body : MUSTACH_VALUE;

open_b : (SEA_WS* TAG_OPEN_MUSTACH SEA_WS* b_attribute SEA_WS* MUSTACH_CLOSE);
b_attribute : MUSTACH_VALUE;

htmlChardata
    :
     HTML_TEXT
    | SEA_WS
    ;

htmlMisc
    : htmlComment
    | SEA_WS
    ;

htmlComment
    : HTML_COMMENT
    | HTML_CONDITIONAL_COMMENT
    ;

script
    :SEA_WS* SCRIPT_OPEN (VAR VAR_VARIABLE VAR_EQUALS VAR_VARIABLE_VALUE)* SCRIPT_CLOSE // salem
    | SEA_WS* SCRIPT_OPEN (VAR VAR_OBJ)* SCRIPT_CLOSE //eyad
    ;

style
    : STYLE_OPEN (STYLE_BODY | STYLE_SHORT_BODY)
    ;