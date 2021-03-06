grammar Chocopy;

tokens { INDENT, DEDENT }

@lexer::members {
  // A queue where extra tokens are pushed on (see the NEWLINE lexer rule).
  private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
  // The stack that keeps track of the indentation level.
  private java.util.Stack<Integer> indents = new java.util.Stack<>();
  // The amount of opened braces, brackets and parenthesis.
  private int opened = 0;
  // The most recently produced token.
  private Token lastToken = null;
  @Override
  public void emit(Token t) {
    super.setToken(t);
    tokens.offer(t);
  }

  @Override
  public Token nextToken() {
    // Check if the end-of-file is ahead and there are still some DEDENTS expected.
    if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
      // Remove any trailing EOF tokens from our buffer.
      for (int i = tokens.size() - 1; i >= 0; i--) {
        if (tokens.get(i).getType() == EOF) {
          tokens.remove(i);
        }
      }

      // First emit an extra line break that serves as the end of the statement.
      this.emit(commonToken(ChocopyParser.NEWLINE, "\n"));

      // Now emit as much DEDENT tokens as needed.
      while (!indents.isEmpty()) {
        this.emit(createDedent());
        indents.pop();
      }

      // Put the EOF back on the token stream.
      this.emit(commonToken(ChocopyParser.EOF, "<EOF>"));
    }

    Token next = super.nextToken();

    if (next.getChannel() == Token.DEFAULT_CHANNEL) {
      // Keep track of the last token on the default channel.
      this.lastToken = next;
    }
    return tokens.isEmpty() ? next : tokens.poll();
  }

  private Token createDedent() {
    CommonToken dedent = commonToken(ChocopyParser.DEDENT, "");
    dedent.setLine(this.lastToken.getLine());
    return dedent;
  }

  private CommonToken commonToken(int type, String text) {
    int stop = this.getCharIndex() - 1;
    int start = text.isEmpty() ? stop : stop - text.length() + 1;
    return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
  }

  // Calculates the indentation of the provided spaces, taking the
  // following rules into account:
  //
  // "Tabs are replaced (from left to right) by one to eight spaces
  //  such that the total number of characters up to and including
  //  the replacement is a multiple of eight [...]"
  //
  //  -- https://docs.python.org/3.1/reference/lexical_analysis.html#indentation
  static int getIndentationCount(String spaces) {
    int count = 0;
    for (char ch : spaces.toCharArray()) {
      switch (ch) {
        case '\t':
          count += 8 - (count % 8);
          break;
        default:
          // A normal space char.
          count++;
      }
    }

    return count;
  }

  boolean atStartOfInput() {
    return super.getCharPositionInLine() == 0 && super.getLine() == 1;
  }
}

program : (var_def | func_def | class_def )* stmt*;

class_def : 'class' ID PAR_IZQ ID PAR_DER ':' NEWLINE INDENT class_body DEDENT;

class_body : 'pass' NEWLINE | (var_def | func_def)+;

func_def : 'def' ID PAR_IZQ (typed_var (',' typed_var)*)? PAR_DER ('->' type)? ':' NEWLINE INDENT func_body DEDENT;

func_body : (global_decl | nonlocal_decl | var_def | func_def )* stmt+;

typed_var : ID ':' type;

type : ID
    | IDSTRING
    | COR_IZQ type COR_DER;

global_decl : 'global' ID NEWLINE;

nonlocal_decl : 'nonlocal' ID NEWLINE;

var_def : typed_var '=' literal NEWLINE;

stmt : simple_stmt NEWLINE
    | 'if' expr ':' block ('elif' expr ':' block )* ('else' ':' block)?
    | 'while' expr ':' block
    | 'for' ID 'in' expr ':' block;

simple_stmt : 'pass'
    | expr
    | 'return' expr?
    | (target '=')+ expr
    | 'print' PAR_IZQ expr PAR_DER;

block : NEWLINE INDENT stmt+ DEDENT;

literal : 'None'
    | 'True'
    | 'False'
    | INTEGER
    | IDSTRING
    | STRING;

expr : cexpr
    | NOT expr
    | expr (AND | OR) expr
    | expr IF expr ELSE expr
    | LEN PAR_IZQ expr PAR_DER
    | INPUT PAR_IZQ PAR_DER
    ;

cexpr : ID
    | literal
    | COR_IZQ (expr (COMMA expr)*)? COR_DER
    | PAR_IZQ expr PAR_DER
    | cexpr PUNTO ID
    | cexpr COR_IZQ expr COR_DER
    | cexpr PUNTO ID PAR_IZQ (expr (',' expr)*)? PAR_DER
    | ID PAR_IZQ (expr (',' expr)*)? PAR_DER
    | cexpr bin_op cexpr
    | MENOS cexpr
    ;

bin_op : '+'
    | MENOS
    | '*'
    | '//'
    | '%'
    | '=='
    | '!='
    | '<='
    | '>='
    | '<'
    | '>'
    | 'is';

target : ID
    | cexpr PUNTO ID
    | cexpr COR_IZQ expr COR_DER;


NOT : 'not';
AND : 'and';
OR : 'or';
IF : 'if';
ELSE : 'else';
INPUT : 'input';
PAR_IZQ : '(';
PAR_DER : ')';
LEN : 'len';
COMMA : ',';
COR_IZQ : '[';
COR_DER : ']';
PUNTO : '.';
MENOS : '-';

INTEGER : [1-9][0-9]* | '0';
ID 		: [a-zA-Z][a-zA-Z0-9_]* ;
IDSTRING: '"'[a-zA-Z][a-zA-Z0-9_]*'"' ;
STRING: '"'[a-zA-Z0-9_]*'"' ;

LINE_COMMENT 	: '#' ~[\r\n]* -> skip ;
fragment SPACES
 : [ \t]+
 ;

fragment COMMENT
 : '#' ~[\r\n\f]*
 ;

fragment LINE_JOINING
 : '\\' SPACES? ( '\r'? '\n' | '\r' | '\f')
 ;
SKIP_
 : ( SPACES | COMMENT | LINE_JOINING ) -> skip
 ;
NEWLINE
 : ( {atStartOfInput()}?   SPACES
   | ( '\r'? '\n' | '\r' | '\f' ) SPACES?
   )
   {
     String newLine = getText().replaceAll("[^\r\n\f]+", "");
     String spaces = getText().replaceAll("[\r\n\f]+", "");

     // Strip newlines inside open clauses except if we are near EOF. We keep NEWLINEs near EOF to
     // satisfy the final newline needed by the single_put rule used by the REPL.
     int next = _input.LA(1);
     int nextnext = _input.LA(2);
     if (opened > 0 || (nextnext != -1 && (next == '\r' || next == '\n' || next == '\f' || next == '#'))) {
       // If we're inside a list or on a blank line, ignore all indents,
       // dedents and line breaks.
       skip();
     }
     else {
       emit(commonToken(NEWLINE, newLine));
       int indent = getIndentationCount(spaces);
       int previous = indents.isEmpty() ? 0 : indents.peek();
       if (indent == previous) {
         // skip indents of the same size as the present indent-size
         skip();
       }
       else if (indent > previous) {
         indents.push(indent);
         emit(commonToken(ChocopyParser.INDENT, spaces));
       }
       else {
         // Possibly emit more than 1 DEDENT token.
         while(!indents.isEmpty() && indents.peek() > indent) {
           this.emit(createDedent());
           indents.pop();
         }
       }
     }
   }
 ;