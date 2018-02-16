grammar ltl;

@header {
package ltl2lustre.parsing;
}


program: (ltl_spec*) EOF;

ltl_spec : 
   'LTLSPEC' expr=ltl_expr ';'                                       # anonymousLtlExpr
   | 'LTLSPEC' 'NAME' name=ID ':=' expr=ltl_expr ';'                 # namedLtlExpr
   ; 
   
ltl_expr : 
   op=('!' | 'X' | 'G' | 'Y' | 'Z' | 'H' | 'O') sub=ltl_expr      # unyLtlExpr
   | lhs=ltl_expr op=('U' | 'V' | 'S' | 'T') rhs=ltl_expr         # binaryLtlExpr
   | lhs=ltl_expr op='&' rhs=ltl_expr                             # binaryLtlExpr
   | lhs=ltl_expr op=('|' | 'xor' | 'xnor') rhs=ltl_expr          # binaryLtlExpr
   | <assoc=right> lhs=ltl_expr op='->' rhs=ltl_expr              # binaryLtlExpr
   | lhs=ltl_expr op='<->' rhs=ltl_expr                           # binaryLtlExpr
   | basicexpr                                                    # basicLtlExpr 
   | '(' ltl_expr ')'                                             # nestedLtlExpr
   ; 

basicexpr : 
   constant                                                                 # constantExpr
   | variable_identifier                                                    # idExpr
   | op='!' sub=basicexpr                                                   # unyExpr 
   | op='-' sub=basicexpr                                                   # unyExpr
   | lhs=basicexpr op=('*' | '/' | 'mod') rhs=basicexpr                     # binaryExpr
   | lhs=basicexpr op=('+' | '-' ) rhs=basicexpr                            # binaryExpr
   | lhs=basicexpr op=('<<' | '>>' ) rhs=basicexpr                          # binaryExpr
   | lhs=basicexpr op=('=' | '!=' | '<' | '>' | '<=' | '>=') rhs=basicexpr  # binaryExpr
   | lhs=basicexpr op='&' rhs=basicexpr                                     # binaryExpr
   | lhs=basicexpr op=('|' | 'xor' | 'xnor') rhs=basicexpr                  # binaryExpr
   | cond=basicexpr '?' thene=basicexpr ':' elsee=basicexpr                 # ifThenElseExpr
   | lhs=basicexpr op='<->' rhs=basicexpr                                   # binaryExpr
   | lhs=basicexpr op='->' rhs=basicexpr                                    # binaryExpr
   | op='next' '(' sub=basicexpr ')'                                        # unyExpr 
   | '(' basicexpr ')'                                                      # nestedExpr
   | 'count' '(' el+=basicexpr (',' el+=basicexpr)* ')'                     # countExpr
   ;
 

   // CURRENTLY UNSUPPORTED EXPRESSIONS!
// | define_identifier
// | function_call                        // a call to a function
// | basicexpr '[' index ']'              // index subscript
// | basicexpr '[' basicexpr ':' basicexpr ']'
// | basicexpr '::' basicexpr             // word concatenation
// | abs '(' basicexpr ')'                // absolute value
// | max '(' basicexpr ',' basicexpr ')'  // max
// | min '(' basicexpr ',' basicexpr ')'  // min
   // word bits selection
// | 'word1' '(' basicexpr ')'            // boolean to unsigned word[1] conversion
// | 'bool' '(' basicexpr ')'             // unsigned word[1] and int to boolean conversion
// | 'toint' '(' basicexpr ')'            // word and boolean to integer constant conversion
// | 'swconst' '(' basicexpr ',' basicexpr ')'
   // integer to signed word constant conversion
// | 'uwconst' '(' basicexpr ',' basicexpr ')'
   // integer to unsigned word constant conversion
// | 'signed' '(' basicexpr ')'           // unsigned word to signed word conversion
// | 'unsigned' '(' basicexpr ')'         // signed word to unsigned word conversion
// | 'sizeof' '(' basicexpr ')'           // word size as an integer
// | 'floor' '(' basicexpr ')'            // from a real to an integer
// | 'extend' '(' basicexpr ',' basicexpr')'
   // word width extension
// | resize '(' basicexpr ',' basicexpr')'
   // word width resize
// | 'signed word' '[' size ']' '(' basicexpr ')'     // integer to signed word conversion
// | 'unsigned word' '[' size ']' '(' basicexpr ')'   // integer to unsigned word conversion
// | basicexpr 'union' basicexpr         // union of set expressions
// | '{' set_body_expr '}'               // set expression
// | basicexpr 'in' basicexpr            // inclusion in a set expression
   // if-then-else expression
// | case_expr                           // case expression


// set_body_expr :  ; 


constant : 
   intconstant 
   | realconstant
   | boolconstant;

intconstant: INT;
realconstant: REAL;
boolconstant: BOOL;   
    
variable_identifier : ID ;    
   
REAL: INT '.' INT;

BOOL: 'TRUE' | 'FALSE';
INT: [0-9]+;

// ~ is used internally. Users should not use it.
ID: [a-zA-Z_~][a-zA-Z_0-9~]*;
   
WS: [ \t\n\r\f]+ -> skip;

SL_COMMENT: '--' (~[%\n\r] ~[\n\r]* | /* empty */) ('\r'? '\n')? -> skip;
ML_COMMENT: '(*' .*? '*)' -> skip;

ERROR: .;
   