/* The following code was generated by JFlex 1.4.3 on 5/2/15 6:25 PM */

package oblig1NF;
import java_cup.runtime.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 5/2/15 6:25 PM from the specification file
 * <tt>/home/niko/inf5110/INF5110_mandatory2_current_point_NF/grammars/oblig1NF.lex</tt>
 */
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\6\1\4\1\2\1\0\1\4\1\3\16\6\4\0\1\4\1\0"+
    "\1\12\1\45\1\5\1\0\1\37\1\0\1\52\1\53\1\0\1\46"+
    "\1\55\1\7\1\14\1\1\1\11\11\10\1\56\1\54\1\44\1\47"+
    "\1\43\2\0\32\5\1\0\1\13\2\0\1\5\1\0\1\21\1\34"+
    "\1\23\1\42\1\27\1\30\1\20\1\41\1\32\2\5\1\24\1\22"+
    "\1\33\1\17\1\15\1\5\1\16\1\25\1\31\1\36\1\26\1\35"+
    "\3\5\1\50\1\40\1\51\1\0\41\6\2\0\4\5\4\0\1\5"+
    "\2\0\1\6\7\0\1\5\4\0\1\5\5\0\27\5\1\0\37\5"+
    "\1\0\u01ca\5\4\0\14\5\16\0\5\5\7\0\1\5\1\0\1\5"+
    "\21\0\160\6\5\5\1\0\2\5\2\0\4\5\10\0\1\5\1\0"+
    "\3\5\1\0\1\5\1\0\24\5\1\0\123\5\1\0\213\5\1\0"+
    "\5\6\2\0\236\5\11\0\46\5\2\0\1\5\7\0\47\5\11\0"+
    "\55\6\1\0\1\6\1\0\2\6\1\0\2\6\1\0\1\6\10\0"+
    "\33\5\5\0\3\5\15\0\4\6\7\0\1\5\4\0\13\6\5\0"+
    "\53\5\37\6\4\0\2\5\1\6\143\5\1\0\1\5\10\6\1\0"+
    "\6\6\2\5\2\6\1\0\4\6\2\5\12\6\3\5\2\0\1\5"+
    "\17\0\1\6\1\5\1\6\36\5\33\6\2\0\131\5\13\6\1\5"+
    "\16\0\12\6\41\5\11\6\2\5\4\0\1\5\5\0\26\5\4\6"+
    "\1\5\11\6\1\5\3\6\1\5\5\6\22\0\31\5\3\6\244\0"+
    "\4\6\66\5\3\6\1\5\22\6\1\5\7\6\12\5\2\6\2\0"+
    "\12\6\1\0\7\5\1\0\7\5\1\0\3\6\1\0\10\5\2\0"+
    "\2\5\2\0\26\5\1\0\7\5\1\0\1\5\3\0\4\5\2\0"+
    "\1\6\1\5\7\6\2\0\2\6\2\0\3\6\1\5\10\0\1\6"+
    "\4\0\2\5\1\0\3\5\2\6\2\0\12\6\4\5\7\0\1\5"+
    "\5\0\3\6\1\0\6\5\4\0\2\5\2\0\26\5\1\0\7\5"+
    "\1\0\2\5\1\0\2\5\1\0\2\5\2\0\1\6\1\0\5\6"+
    "\4\0\2\6\2\0\3\6\3\0\1\6\7\0\4\5\1\0\1\5"+
    "\7\0\14\6\3\5\1\6\13\0\3\6\1\0\11\5\1\0\3\5"+
    "\1\0\26\5\1\0\7\5\1\0\2\5\1\0\5\5\2\0\1\6"+
    "\1\5\10\6\1\0\3\6\1\0\3\6\2\0\1\5\17\0\2\5"+
    "\2\6\2\0\12\6\1\0\1\5\17\0\3\6\1\0\10\5\2\0"+
    "\2\5\2\0\26\5\1\0\7\5\1\0\2\5\1\0\5\5\2\0"+
    "\1\6\1\5\7\6\2\0\2\6\2\0\3\6\10\0\2\6\4\0"+
    "\2\5\1\0\3\5\2\6\2\0\12\6\1\0\1\5\20\0\1\6"+
    "\1\5\1\0\6\5\3\0\3\5\1\0\4\5\3\0\2\5\1\0"+
    "\1\5\1\0\2\5\3\0\2\5\3\0\3\5\3\0\14\5\4\0"+
    "\5\6\3\0\3\6\1\0\4\6\2\0\1\5\6\0\1\6\16\0"+
    "\12\6\11\0\1\5\7\0\3\6\1\0\10\5\1\0\3\5\1\0"+
    "\27\5\1\0\12\5\1\0\5\5\3\0\1\5\7\6\1\0\3\6"+
    "\1\0\4\6\7\0\2\6\1\0\2\5\6\0\2\5\2\6\2\0"+
    "\12\6\22\0\2\6\1\0\10\5\1\0\3\5\1\0\27\5\1\0"+
    "\12\5\1\0\5\5\2\0\1\6\1\5\7\6\1\0\3\6\1\0"+
    "\4\6\7\0\2\6\7\0\1\5\1\0\2\5\2\6\2\0\12\6"+
    "\1\0\2\5\17\0\2\6\1\0\10\5\1\0\3\5\1\0\51\5"+
    "\2\0\1\5\7\6\1\0\3\6\1\0\4\6\1\5\10\0\1\6"+
    "\10\0\2\5\2\6\2\0\12\6\12\0\6\5\2\0\2\6\1\0"+
    "\22\5\3\0\30\5\1\0\11\5\1\0\1\5\2\0\7\5\3\0"+
    "\1\6\4\0\6\6\1\0\1\6\1\0\10\6\22\0\2\6\15\0"+
    "\60\5\1\6\2\5\7\6\4\0\10\5\10\6\1\0\12\6\47\0"+
    "\2\5\1\0\1\5\2\0\2\5\1\0\1\5\2\0\1\5\6\0"+
    "\4\5\1\0\7\5\1\0\3\5\1\0\1\5\1\0\1\5\2\0"+
    "\2\5\1\0\4\5\1\6\2\5\6\6\1\0\2\6\1\5\2\0"+
    "\5\5\1\0\1\5\1\0\6\6\2\0\12\6\2\0\2\5\42\0"+
    "\1\5\27\0\2\6\6\0\12\6\13\0\1\6\1\0\1\6\1\0"+
    "\1\6\4\0\2\6\10\5\1\0\44\5\4\0\24\6\1\0\2\6"+
    "\5\5\13\6\1\0\44\6\11\0\1\6\71\0\53\5\24\6\1\5"+
    "\12\6\6\0\6\5\4\6\4\5\3\6\1\5\3\6\2\5\7\6"+
    "\3\5\4\6\15\5\14\6\1\5\17\6\2\0\46\5\12\0\53\5"+
    "\1\0\1\5\3\0\u0149\5\1\0\4\5\2\0\7\5\1\0\1\5"+
    "\1\0\4\5\2\0\51\5\1\0\4\5\2\0\41\5\1\0\4\5"+
    "\2\0\7\5\1\0\1\5\1\0\4\5\2\0\17\5\1\0\71\5"+
    "\1\0\4\5\2\0\103\5\2\0\3\6\40\0\20\5\20\0\125\5"+
    "\14\0\u026c\5\2\0\21\5\1\0\32\5\5\0\113\5\3\0\3\5"+
    "\17\0\15\5\1\0\4\5\3\6\13\0\22\5\3\6\13\0\22\5"+
    "\2\6\14\0\15\5\1\0\3\5\1\0\2\6\14\0\64\5\40\6"+
    "\3\0\1\5\3\0\2\5\1\6\2\0\12\6\41\0\3\6\2\0"+
    "\12\6\6\0\130\5\10\0\51\5\1\6\1\5\5\0\106\5\12\0"+
    "\35\5\3\0\14\6\4\0\14\6\12\0\12\6\36\5\2\0\5\5"+
    "\13\0\54\5\4\0\21\6\7\5\2\6\6\0\12\6\46\0\27\5"+
    "\5\6\4\0\65\5\12\6\1\0\35\6\2\0\13\6\6\0\12\6"+
    "\15\0\1\5\130\0\5\6\57\5\21\6\7\5\4\0\12\6\21\0"+
    "\11\6\14\0\3\6\36\5\12\6\3\0\2\5\12\6\6\0\46\5"+
    "\16\6\14\0\44\5\24\6\10\0\12\6\3\0\3\5\12\6\44\5"+
    "\122\0\3\6\1\0\25\6\4\5\1\6\4\5\1\6\15\0\300\5"+
    "\47\6\25\0\4\6\u0116\5\2\0\6\5\2\0\46\5\2\0\6\5"+
    "\2\0\10\5\1\0\1\5\1\0\1\5\1\0\1\5\1\0\37\5"+
    "\2\0\65\5\1\0\7\5\1\0\1\5\3\0\3\5\1\0\7\5"+
    "\3\0\4\5\2\0\6\5\4\0\15\5\5\0\3\5\1\0\7\5"+
    "\16\0\5\6\32\0\5\6\20\0\2\5\23\0\1\5\13\0\5\6"+
    "\5\0\6\6\1\0\1\5\15\0\1\5\20\0\15\5\3\0\32\5"+
    "\26\0\15\6\4\0\1\6\3\0\14\6\21\0\1\5\4\0\1\5"+
    "\2\0\12\5\1\0\1\5\3\0\5\5\6\0\1\5\1\0\1\5"+
    "\1\0\1\5\1\0\4\5\1\0\13\5\2\0\4\5\5\0\5\5"+
    "\4\0\1\5\21\0\51\5\u0a77\0\57\5\1\0\57\5\1\0\205\5"+
    "\6\0\4\5\3\6\16\0\46\5\12\0\66\5\11\0\1\5\17\0"+
    "\1\6\27\5\11\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5"+
    "\1\0\7\5\1\0\7\5\1\0\7\5\1\0\7\5\1\0\40\6"+
    "\57\0\1\5\u01d5\0\3\5\31\0\11\5\6\6\1\0\5\5\2\0"+
    "\5\5\4\0\126\5\2\0\2\6\2\0\3\5\1\0\132\5\1\0"+
    "\4\5\5\0\51\5\3\0\136\5\21\0\33\5\65\0\20\5\u0200\0"+
    "\u19b6\5\112\0\u51cc\5\64\0\u048d\5\103\0\56\5\2\0\u010d\5\3\0"+
    "\20\5\12\6\2\5\24\0\57\5\1\6\14\0\2\6\1\0\31\5"+
    "\10\0\120\5\2\6\45\0\11\5\2\0\147\5\2\0\4\5\1\0"+
    "\2\5\16\0\12\5\120\0\10\5\1\6\3\5\1\6\4\5\1\6"+
    "\27\5\5\6\20\0\1\5\7\0\64\5\14\0\2\6\62\5\21\6"+
    "\13\0\12\6\6\0\22\6\6\5\3\0\1\5\4\0\12\6\34\5"+
    "\10\6\2\0\27\5\15\6\14\0\35\5\3\0\4\6\57\5\16\6"+
    "\16\0\1\5\12\6\46\0\51\5\16\6\11\0\3\5\1\6\10\5"+
    "\2\6\2\0\12\6\6\0\27\5\3\0\1\5\1\6\4\0\60\5"+
    "\1\6\1\5\3\6\2\5\2\6\5\5\2\6\1\5\1\6\1\5"+
    "\30\0\3\5\43\0\6\5\2\0\6\5\2\0\6\5\11\0\7\5"+
    "\1\0\7\5\221\0\43\5\10\6\1\0\2\6\2\0\12\6\6\0"+
    "\u2ba4\5\14\0\27\5\4\0\61\5\u2104\0\u012e\5\2\0\76\5\2\0"+
    "\152\5\46\0\7\5\14\0\5\5\5\0\1\5\1\6\12\5\1\0"+
    "\15\5\1\0\5\5\1\0\1\5\1\0\2\5\1\0\2\5\1\0"+
    "\154\5\41\0\u016b\5\22\0\100\5\2\0\66\5\50\0\15\5\3\0"+
    "\20\6\20\0\7\6\14\0\2\5\30\0\3\5\31\0\1\5\6\0"+
    "\5\5\1\0\207\5\2\0\1\6\4\0\1\5\13\0\12\6\7\0"+
    "\32\5\4\0\1\5\1\0\32\5\13\0\131\5\3\0\6\5\2\0"+
    "\6\5\2\0\6\5\2\0\3\5\3\0\2\5\3\0\2\5\22\0"+
    "\3\6\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\2\2\1\3\1\1\2\4\1\1\1\5"+
    "\13\3\2\1\1\3\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\2"+
    "\1\0\1\22\1\0\1\23\1\0\11\3\1\24\6\3"+
    "\1\25\1\26\1\27\1\3\1\30\3\3\1\31\4\3"+
    "\1\32\1\33\1\34\4\3\1\35\5\3\1\36\1\37"+
    "\1\40\1\41\3\3\1\42\1\3\1\43\1\44\1\45"+
    "\1\3\1\46\1\47\1\50";

  private static int [] zzUnpackAction() {
    int [] result = new int[101];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\57\0\215\0\274\0\353\0\u011a"+
    "\0\u0149\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292"+
    "\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db\0\u040a"+
    "\0\u0439\0\57\0\57\0\57\0\353\0\57\0\57\0\57"+
    "\0\57\0\57\0\57\0\57\0\57\0\u0468\0\u0149\0\u01a7"+
    "\0\u0178\0\57\0\u0497\0\u04c6\0\u04f5\0\u0524\0\u0553\0\u0582"+
    "\0\u05b1\0\u05e0\0\u060f\0\u063e\0\274\0\u066d\0\u069c\0\u06cb"+
    "\0\u06fa\0\u0729\0\u0758\0\57\0\57\0\274\0\u0787\0\274"+
    "\0\u07b6\0\u07e5\0\u0814\0\274\0\u0843\0\u0872\0\u08a1\0\u08d0"+
    "\0\274\0\274\0\274\0\u08ff\0\u092e\0\u095d\0\u098c\0\274"+
    "\0\u09bb\0\u09ea\0\u0a19\0\u0a48\0\u0a77\0\274\0\274\0\274"+
    "\0\274\0\u0aa6\0\u0ad5\0\u0b04\0\274\0\u0b33\0\274\0\274"+
    "\0\274\0\u0b62\0\274\0\274\0\274";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[101];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\4\1\6\1\2\1\7"+
    "\1\10\1\11\1\12\1\2\1\13\1\14\1\15\4\6"+
    "\1\16\1\6\1\17\1\20\1\6\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\6\1\27\1\30\1\6\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\60\0\1\46\57\0\1\4"+
    "\61\0\2\6\1\0\2\6\3\0\22\6\2\0\2\6"+
    "\24\0\1\10\1\47\2\0\1\50\52\0\2\10\2\0"+
    "\1\50\52\0\2\47\2\0\1\50\42\0\12\51\1\52"+
    "\1\53\43\51\10\0\2\50\52\0\2\6\1\0\2\6"+
    "\3\0\1\6\1\54\20\6\2\0\2\6\21\0\2\6"+
    "\1\0\2\6\3\0\12\6\1\55\7\6\2\0\2\6"+
    "\21\0\2\6\1\0\2\6\3\0\7\6\1\56\12\6"+
    "\2\0\2\6\21\0\2\6\1\0\2\6\3\0\14\6"+
    "\1\57\5\6\2\0\2\6\21\0\2\6\1\0\2\6"+
    "\3\0\4\6\1\60\15\6\2\0\2\6\21\0\2\6"+
    "\1\0\2\6\3\0\4\6\1\61\2\6\1\62\12\6"+
    "\2\0\2\6\21\0\2\6\1\0\2\6\3\0\1\6"+
    "\1\63\20\6\2\0\1\64\1\6\21\0\2\6\1\0"+
    "\2\6\3\0\13\6\1\65\2\6\1\66\3\6\2\0"+
    "\2\6\21\0\2\6\1\0\2\6\3\0\2\6\1\67"+
    "\7\6\1\70\6\6\1\71\2\0\2\6\21\0\2\6"+
    "\1\0\2\6\3\0\2\6\1\72\17\6\2\0\2\6"+
    "\21\0\2\6\1\0\2\6\3\0\22\6\2\0\1\73"+
    "\1\6\53\0\1\74\57\0\1\75\23\0\2\6\1\0"+
    "\2\6\3\0\2\6\1\76\17\6\2\0\2\6\14\0"+
    "\2\46\1\0\54\46\2\51\1\0\54\51\5\0\2\6"+
    "\1\0\2\6\3\0\2\6\1\77\17\6\2\0\2\6"+
    "\21\0\2\6\1\0\2\6\3\0\13\6\1\100\1\101"+
    "\5\6\2\0\2\6\21\0\2\6\1\0\2\6\3\0"+
    "\4\6\1\102\15\6\2\0\2\6\21\0\2\6\1\0"+
    "\2\6\3\0\1\6\1\103\20\6\2\0\2\6\21\0"+
    "\2\6\1\0\2\6\3\0\1\6\1\104\20\6\2\0"+
    "\2\6\21\0\2\6\1\0\2\6\3\0\7\6\1\105"+
    "\12\6\2\0\2\6\21\0\2\6\1\0\2\6\3\0"+
    "\2\6\1\106\17\6\2\0\2\6\21\0\2\6\1\0"+
    "\2\6\3\0\21\6\1\107\2\0\2\6\21\0\2\6"+
    "\1\0\2\6\3\0\12\6\1\110\7\6\2\0\2\6"+
    "\21\0\2\6\1\0\2\6\3\0\14\6\1\111\5\6"+
    "\2\0\2\6\21\0\2\6\1\0\2\6\3\0\14\6"+
    "\1\112\5\6\2\0\2\6\21\0\2\6\1\0\2\6"+
    "\3\0\20\6\1\113\1\6\2\0\2\6\21\0\2\6"+
    "\1\0\2\6\3\0\7\6\1\114\12\6\2\0\2\6"+
    "\21\0\2\6\1\0\2\6\3\0\2\6\1\115\17\6"+
    "\2\0\2\6\21\0\2\6\1\0\2\6\3\0\15\6"+
    "\1\116\4\6\2\0\2\6\21\0\2\6\1\0\2\6"+
    "\3\0\3\6\1\117\2\6\1\120\13\6\2\0\2\6"+
    "\21\0\2\6\1\0\2\6\3\0\21\6\1\121\2\0"+
    "\2\6\21\0\2\6\1\0\2\6\3\0\10\6\1\122"+
    "\11\6\2\0\2\6\21\0\2\6\1\0\2\6\3\0"+
    "\15\6\1\123\4\6\2\0\2\6\21\0\2\6\1\0"+
    "\2\6\3\0\10\6\1\124\11\6\2\0\2\6\21\0"+
    "\2\6\1\0\2\6\3\0\4\6\1\125\15\6\2\0"+
    "\2\6\21\0\2\6\1\0\2\6\3\0\12\6\1\126"+
    "\7\6\2\0\2\6\21\0\2\6\1\0\2\6\3\0"+
    "\16\6\1\127\3\6\2\0\2\6\21\0\2\6\1\0"+
    "\2\6\3\0\7\6\1\130\12\6\2\0\2\6\21\0"+
    "\2\6\1\0\2\6\3\0\7\6\1\131\12\6\2\0"+
    "\2\6\21\0\2\6\1\0\2\6\3\0\7\6\1\132"+
    "\12\6\2\0\2\6\21\0\2\6\1\0\2\6\3\0"+
    "\1\6\1\133\20\6\2\0\2\6\21\0\2\6\1\0"+
    "\2\6\3\0\1\6\1\134\20\6\2\0\2\6\21\0"+
    "\2\6\1\0\2\6\3\0\10\6\1\135\11\6\2\0"+
    "\2\6\21\0\2\6\1\0\2\6\3\0\16\6\1\136"+
    "\3\6\2\0\2\6\21\0\2\6\1\0\2\6\3\0"+
    "\12\6\1\137\7\6\2\0\2\6\21\0\2\6\1\0"+
    "\2\6\3\0\14\6\1\140\5\6\2\0\2\6\21\0"+
    "\2\6\1\0\2\6\3\0\12\6\1\141\7\6\2\0"+
    "\2\6\21\0\2\6\1\0\2\6\3\0\4\6\1\142"+
    "\15\6\2\0\2\6\21\0\2\6\1\0\2\6\3\0"+
    "\16\6\1\143\3\6\2\0\2\6\21\0\2\6\1\0"+
    "\2\6\3\0\3\6\1\144\16\6\2\0\2\6\21\0"+
    "\2\6\1\0\2\6\3\0\5\6\1\145\14\6\2\0"+
    "\2\6\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2961];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\25\1\3\11\1\1\10\11"+
    "\1\1\1\0\1\1\1\0\1\11\1\0\20\1\2\11"+
    "\50\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[101];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
 StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2204) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 34: 
          { return symbol(sym.CLASS);
          }
        case 41: break;
        case 29: 
          { return symbol(sym.PROC);
          }
        case 42: break;
        case 13: 
          { return symbol(sym.LPAR);
          }
        case 43: break;
        case 6: 
          { return symbol(sym.GT);
          }
        case 44: break;
        case 5: 
          { return symbol(sym.FSTOP);
          }
        case 45: break;
        case 7: 
          { return symbol(sym.LT);
          }
        case 46: break;
        case 26: 
          { return symbol(sym.INT);
          }
        case 47: break;
        case 14: 
          { return symbol(sym.RPAR);
          }
        case 48: break;
        case 27: 
          { return symbol(sym.NOT);
          }
        case 49: break;
        case 21: 
          { return symbol(sym.AND);
          }
        case 50: break;
        case 38: 
          { return symbol(sym.RETURN);
          }
        case 51: break;
        case 9: 
          { return symbol(sym.PLUS);
          }
        case 52: break;
        case 30: 
          { return symbol(sym.TRUE);
          }
        case 53: break;
        case 3: 
          { return symbol(sym.ID,yytext());
          }
        case 54: break;
        case 23: 
          { return symbol(sym.DO);
          }
        case 55: break;
        case 11: 
          { return symbol(sym.LBRACK);
          }
        case 56: break;
        case 17: 
          { return symbol(sym.COLON);
          }
        case 57: break;
        case 31: 
          { return symbol(sym.THEN);
          }
        case 58: break;
        case 25: 
          { return symbol(sym.VAR);
          }
        case 59: break;
        case 37: 
          { return symbol(sym.WHILE);
          }
        case 60: break;
        case 10: 
          { return symbol(sym.EQUAL);
          }
        case 61: break;
        case 20: 
          { return symbol(sym.IF);
          }
        case 62: break;
        case 1: 
          { throw new Error("Illegal character '" + yytext() + "' at line " + yyline + ", column " + yycolumn + ".");
          }
        case 63: break;
        case 22: 
          { return symbol(sym.OR);
          }
        case 64: break;
        case 18: 
          { return symbol(sym.FLOAT_LITERAL, yytext());
          }
        case 65: break;
        case 24: 
          { return symbol(sym.REF);
          }
        case 66: break;
        case 33: 
          { return symbol(sym.BOOL);
          }
        case 67: break;
        case 36: 
          { return symbol(sym.FLOAT);
          }
        case 68: break;
        case 15: 
          { return symbol(sym.SEMI);
          }
        case 69: break;
        case 28: 
          { return symbol(sym.NEW);
          }
        case 70: break;
        case 8: 
          { return symbol(sym.EXPOP);
          }
        case 71: break;
        case 39: 
          { return symbol(sym.STRING);
          }
        case 72: break;
        case 19: 
          { return symbol(sym.STRING_LITERAL,yytext());
          }
        case 73: break;
        case 16: 
          { return symbol(sym.COMMA);
          }
        case 74: break;
        case 35: 
          { return symbol(sym.FALSE);
          }
        case 75: break;
        case 12: 
          { return symbol(sym.RBRACK);
          }
        case 76: break;
        case 4: 
          { return symbol(sym.INTEGER, yytext());
          }
        case 77: break;
        case 32: 
          { return symbol(sym.NULL);
          }
        case 78: break;
        case 40: 
          { return symbol(sym.PROGRAM);
          }
        case 79: break;
        case 2: 
          { 
          }
        case 80: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
