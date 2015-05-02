package oblig1NF;
import java_cup.runtime.*;
%%

%class Lexer
%unicode
%cup
%line
%column
%public
%{
 StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }

%}
Comment = \/\/.*
LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator} | [ \t\f]
Identifier = [:jletter:] [:jletterdigit:]*
Integer = [+-]?[1-9][0-9]*
String_literal = \"([^\\\"]|\\.)*\"
Float = [+-]?[0-9]*\.[0-9]*
%%
<YYINITIAL>{
        {WhiteSpace}                    {}
        "program"                       { return symbol(sym.PROGRAM); }
        "class"                         { return symbol(sym.CLASS); }
        "var"							{ return symbol(sym.VAR); }
        "proc"							{ return symbol(sym.PROC); }
        "ref"							{ return symbol(sym.REF); }
        "float"							{ return symbol(sym.FLOAT); }
        "int"							{ return symbol(sym.INT); }
        "string"						{ return symbol(sym.STRING); }
        "bool"							{ return symbol(sym.BOOL); }
        "new"							{ return symbol(sym.NEW); }
        "not"							{ return symbol(sym.NOT); }
        "if"							{ return symbol(sym.IF); }
        "then"							{ return symbol(sym.THEN); }
        ">"								{ return symbol(sym.GT); }
        "<"								{ return symbol(sym.LT); }
        "#"								{ return symbol(sym.EXPOP); }
        "+"								{ return symbol(sym.PLUS); }
        "="								{ return symbol(sym.EQUAL); }
        "{"                             { return symbol(sym.LBRACK); }
        "}"                             { return symbol(sym.RBRACK); }
        "("                             { return symbol(sym.LPAR); }
        ")"                             { return symbol(sym.RPAR); }
        ";"                             { return symbol(sym.SEMI); }
        ","								{ return symbol(sym.COMMA); }
        ":"								{ return symbol(sym.COLON); }
        "."								{ return symbol(sym.FSTOP); }
        "return"						{ return symbol(sym.RETURN); }
        {Comment}						{}
        {Integer}						{ return symbol(sym.INTEGER, yytext()); }
        {Float}							{ return symbol(sym.FLOAT_LITERAL, yytext()); }
        {Identifier}                    { return symbol(sym.ID,yytext()); }
        {String_literal}                { return symbol(sym.STRING_LITERAL,yytext()); }
}

.                           { throw new Error("Illegal character '" + yytext() + "' at line " + yyline + ", column " + yycolumn + "."); }
