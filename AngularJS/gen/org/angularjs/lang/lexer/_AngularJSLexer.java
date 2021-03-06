/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package org.angularjs.lang.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static org.angularjs.lang.lexer.AngularJSTokenTypes.*;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>angular.flex</tt>
 */
class _AngularJSLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int YYSTRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [8, 6, 7]
   * Total runtime size is 1296 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>13]|((ch>>7)&0x3f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 136 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\207\100");

  /* The ZZ_CMAP_Y table has 128 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\176\2");

  /* The ZZ_CMAP_A table has 384 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\1\1\3\1\1\1\0\1\61\22\0\1\31\1\42\1\12\1\0\1\10\1\37\1\45\1\11\1\47"+
    "\1\50\1\35\1\34\1\56\1\7\1\5\1\36\12\4\1\60\1\57\1\43\1\41\1\44\1\55\1\0\4"+
    "\62\1\6\1\62\24\10\1\53\1\2\1\54\1\40\1\10\1\0\1\20\1\32\1\27\1\24\1\16\1"+
    "\17\2\10\1\25\1\10\1\30\1\21\1\10\1\23\1\26\2\10\1\14\1\22\1\13\1\15\3\10"+
    "\1\33\1\10\1\51\1\46\1\52\42\0\1\1\337\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\10\5\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\2\37\1\40\1\41\1\0\2\3\3\5\1\42"+
    "\2\5\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\1\55\1\0\1\3\4\5\1\56"+
    "\1\57\1\5\1\60\1\61\1\62\1\63\1\64\3\5"+
    "\1\65\1\63\2\5\1\66\1\63\1\0\1\5\1\0"+
    "\1\5\1\67\1\5\1\70";

  private static int [] zzUnpackAction() {
    int [] result = new int[95];
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
    "\0\0\0\63\0\146\0\231\0\314\0\377\0\u0132\0\u0165"+
    "\0\146\0\146\0\146\0\u0198\0\u01cb\0\u01fe\0\u0231\0\u0264"+
    "\0\u0297\0\u02ca\0\u02fd\0\146\0\146\0\146\0\146\0\146"+
    "\0\u0330\0\u0363\0\u0396\0\u03c9\0\u03fc\0\u042f\0\146\0\146"+
    "\0\146\0\146\0\146\0\146\0\u0462\0\146\0\146\0\u0495"+
    "\0\u04c8\0\u04fb\0\146\0\146\0\146\0\314\0\u052e\0\u0561"+
    "\0\u0594\0\u05c7\0\u05fa\0\u062d\0\u0660\0\u0693\0\u0165\0\u0165"+
    "\0\u06c6\0\u06f9\0\146\0\146\0\146\0\146\0\146\0\146"+
    "\0\146\0\u072c\0\u075f\0\u0792\0\u07c5\0\u07f8\0\u082b\0\146"+
    "\0\u0165\0\u085e\0\146\0\146\0\146\0\u0891\0\u0165\0\u08c4"+
    "\0\u08f7\0\u092a\0\u0165\0\u095d\0\u0990\0\u09c3\0\u0165\0\u09f6"+
    "\0\u0a29\0\u0a5c\0\u0a8f\0\u0ac2\0\146\0\u0af5\0\u0165";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[95];
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
    "\1\3\1\4\1\5\1\4\1\6\1\7\1\10\1\11"+
    "\1\10\1\12\1\13\1\14\1\10\1\15\1\10\1\16"+
    "\1\17\1\20\1\10\1\21\1\10\1\22\1\23\2\10"+
    "\1\4\2\10\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\4"+
    "\1\10\2\51\1\52\1\53\5\51\1\54\1\55\46\51"+
    "\1\53\1\51\64\0\1\4\1\56\1\4\25\0\1\4"+
    "\27\0\1\4\4\0\1\4\63\0\1\6\1\57\1\60"+
    "\7\0\1\60\50\0\1\57\62\0\1\10\1\0\1\10"+
    "\1\0\1\10\2\0\16\10\1\0\2\10\26\0\1\10"+
    "\4\0\1\10\1\0\1\10\1\0\1\10\2\0\1\10"+
    "\1\61\14\10\1\0\2\10\26\0\1\10\4\0\1\10"+
    "\1\0\1\10\1\0\1\10\2\0\10\10\1\62\5\10"+
    "\1\0\2\10\26\0\1\10\4\0\1\10\1\0\1\10"+
    "\1\0\1\10\2\0\5\10\1\63\10\10\1\0\2\10"+
    "\26\0\1\10\4\0\1\10\1\0\1\10\1\0\1\10"+
    "\2\0\7\10\1\64\6\10\1\0\2\10\26\0\1\10"+
    "\4\0\1\10\1\0\1\10\1\0\1\10\2\0\3\10"+
    "\1\65\12\10\1\0\2\10\26\0\1\10\4\0\1\10"+
    "\1\0\1\10\1\0\1\10\2\0\2\10\1\66\13\10"+
    "\1\0\2\10\26\0\1\10\4\0\1\10\1\0\1\10"+
    "\1\0\1\10\2\0\10\10\1\67\5\10\1\0\2\10"+
    "\26\0\1\10\4\0\1\10\1\0\1\10\1\0\1\10"+
    "\2\0\4\10\1\70\11\10\1\0\2\10\26\0\1\10"+
    "\41\0\1\71\62\0\1\72\62\0\1\73\62\0\1\74"+
    "\66\0\1\75\63\0\1\76\21\0\1\77\135\0\1\100"+
    "\2\0\2\51\2\0\5\51\2\0\46\51\1\0\1\51"+
    "\3\101\1\0\11\101\1\102\43\101\1\0\1\101\4\0"+
    "\1\57\1\0\1\60\7\0\1\60\50\0\1\103\2\0"+
    "\1\103\24\0\1\103\32\0\1\10\1\0\1\10\1\0"+
    "\1\10\2\0\2\10\1\104\2\10\1\105\10\10\1\0"+
    "\2\10\26\0\1\10\4\0\1\10\1\0\1\10\1\0"+
    "\1\10\2\0\11\10\1\106\4\10\1\0\2\10\26\0"+
    "\1\10\4\0\1\10\1\0\1\10\1\0\1\10\2\0"+
    "\6\10\1\107\7\10\1\0\2\10\26\0\1\10\4\0"+
    "\1\10\1\110\1\10\1\0\1\10\2\0\16\10\1\0"+
    "\2\10\26\0\1\10\4\0\1\10\1\0\1\10\1\0"+
    "\1\10\2\0\1\111\15\10\1\0\2\10\26\0\1\10"+
    "\4\0\1\10\1\0\1\10\1\0\1\10\2\0\6\10"+
    "\1\112\7\10\1\0\2\10\26\0\1\10\41\0\1\113"+
    "\62\0\1\114\21\0\4\115\1\116\1\115\1\116\7\115"+
    "\3\116\3\115\1\116\2\115\1\116\2\115\1\116\27\115"+
    "\1\116\4\0\1\103\62\0\1\10\1\0\1\10\1\0"+
    "\1\10\2\0\3\10\1\117\12\10\1\0\2\10\26\0"+
    "\1\10\4\0\1\10\1\0\1\10\1\0\1\10\2\0"+
    "\14\10\1\120\1\10\1\0\2\10\26\0\1\10\4\0"+
    "\1\10\1\0\1\10\1\0\1\10\2\0\3\10\1\121"+
    "\12\10\1\0\2\10\26\0\1\10\4\0\1\10\1\0"+
    "\1\10\1\0\1\10\2\0\7\10\1\122\6\10\1\0"+
    "\2\10\26\0\1\10\4\0\1\10\1\0\1\10\1\0"+
    "\1\10\2\0\6\10\1\123\7\10\1\0\2\10\26\0"+
    "\1\10\4\0\1\124\1\0\1\124\7\0\3\124\3\0"+
    "\1\124\2\0\1\124\2\0\1\124\27\0\1\124\4\0"+
    "\1\10\1\0\1\10\1\0\1\10\2\0\15\10\1\125"+
    "\1\0\2\10\26\0\1\10\4\0\1\10\1\0\1\10"+
    "\1\0\1\10\2\0\4\10\1\126\11\10\1\0\2\10"+
    "\26\0\1\10\4\0\1\10\1\0\1\10\1\0\1\10"+
    "\2\0\3\10\1\127\12\10\1\0\2\10\26\0\1\10"+
    "\4\0\1\130\1\0\1\130\7\0\3\130\3\0\1\130"+
    "\2\0\1\130\2\0\1\130\27\0\1\130\4\0\1\10"+
    "\1\0\1\10\1\0\1\10\2\0\16\10\1\131\2\10"+
    "\26\0\1\10\4\0\1\10\1\0\1\10\1\0\1\10"+
    "\2\0\12\10\1\132\3\10\1\0\2\10\26\0\1\10"+
    "\4\0\1\101\1\0\1\101\7\0\3\101\3\0\1\101"+
    "\2\0\1\101\2\0\1\101\27\0\1\101\32\0\1\133"+
    "\34\0\1\10\1\0\1\10\1\0\1\10\2\0\10\10"+
    "\1\134\5\10\1\0\2\10\26\0\1\10\33\0\1\135"+
    "\33\0\1\10\1\0\1\10\1\0\1\10\2\0\3\10"+
    "\1\136\12\10\1\0\2\10\26\0\1\10\4\0\1\10"+
    "\1\0\1\10\1\0\1\10\2\0\11\10\1\137\4\10"+
    "\1\0\2\10\26\0\1\10";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2856];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\5\1\3\11\10\1\5\11\6\1\6\11"+
    "\1\1\2\11\3\1\3\11\1\0\14\1\7\11\1\0"+
    "\5\1\1\11\2\1\3\11\13\1\1\0\1\1\1\0"+
    "\1\1\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[95];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private char quote;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  _AngularJSLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBuffer.charAt(zzStartRead+pos);
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            }
          case 57: break;
          case 2: 
            { return WHITE_SPACE;
            }
          case 58: break;
          case 3: 
            { return NUMERIC_LITERAL;
            }
          case 59: break;
          case 4: 
            { return DOT;
            }
          case 60: break;
          case 5: 
            { return IDENTIFIER;
            }
          case 61: break;
          case 6: 
            { return MINUS;
            }
          case 62: break;
          case 7: 
            { yybegin(YYSTRING); quote = '\''; return STRING_LITERAL;
            }
          case 63: break;
          case 8: 
            { yybegin(YYSTRING); quote = '"'; return STRING_LITERAL;
            }
          case 64: break;
          case 9: 
            { return PLUS;
            }
          case 65: break;
          case 10: 
            { return MULT;
            }
          case 66: break;
          case 11: 
            { return DIV;
            }
          case 67: break;
          case 12: 
            { return PERC;
            }
          case 68: break;
          case 13: 
            { return XOR;
            }
          case 69: break;
          case 14: 
            { return EQ;
            }
          case 70: break;
          case 15: 
            { return EXCL;
            }
          case 71: break;
          case 16: 
            { return LT;
            }
          case 72: break;
          case 17: 
            { return GT;
            }
          case 73: break;
          case 18: 
            { return AND;
            }
          case 74: break;
          case 19: 
            { return OR;
            }
          case 75: break;
          case 20: 
            { return LPAR;
            }
          case 76: break;
          case 21: 
            { return RPAR;
            }
          case 77: break;
          case 22: 
            { return LBRACE;
            }
          case 78: break;
          case 23: 
            { return RBRACE;
            }
          case 79: break;
          case 24: 
            { return LBRACKET;
            }
          case 80: break;
          case 25: 
            { return RBRACKET;
            }
          case 81: break;
          case 26: 
            { return QUEST;
            }
          case 82: break;
          case 27: 
            { return COMMA;
            }
          case 83: break;
          case 28: 
            { return SEMICOLON;
            }
          case 84: break;
          case 29: 
            { return COLON;
            }
          case 85: break;
          case 30: 
            { return STRING_LITERAL;
            }
          case 86: break;
          case 31: 
            { yypushback(yytext().length()); yybegin(YYINITIAL);
            }
          case 87: break;
          case 32: 
            { if (quote == '\'') yybegin(YYINITIAL); return STRING_LITERAL;
            }
          case 88: break;
          case 33: 
            { if (quote == '"') yybegin(YYINITIAL); return STRING_LITERAL;
            }
          case 89: break;
          case 34: 
            { return AS_KEYWORD;
            }
          case 90: break;
          case 35: 
            { return IN_KEYWORD;
            }
          case 91: break;
          case 36: 
            { return OF_KEYWORD;
            }
          case 92: break;
          case 37: 
            { return EQEQ;
            }
          case 93: break;
          case 38: 
            { return NE;
            }
          case 94: break;
          case 39: 
            { return LE;
            }
          case 95: break;
          case 40: 
            { return GE;
            }
          case 96: break;
          case 41: 
            { return ANDAND;
            }
          case 97: break;
          case 42: 
            { return OROR;
            }
          case 98: break;
          case 43: 
            { return ELVIS;
            }
          case 99: break;
          case 44: 
            { return ONE_TIME_BINDING;
            }
          case 100: break;
          case 45: 
            { return ESCAPE_SEQUENCE;
            }
          case 101: break;
          case 46: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzStartRead, 2);
            { return IDENTIFIER;
            }
          case 102: break;
          case 47: 
            { return LET_KEYWORD;
            }
          case 103: break;
          case 48: 
            { return EQEQEQ;
            }
          case 104: break;
          case 49: 
            { return NEQEQ;
            }
          case 105: break;
          case 50: 
            { yypushback(1); return INVALID_ESCAPE_SEQUENCE;
            }
          case 106: break;
          case 51: 
            { return INVALID_ESCAPE_SEQUENCE;
            }
          case 107: break;
          case 52: 
            { return TRUE_KEYWORD;
            }
          case 108: break;
          case 53: 
            { return NULL_KEYWORD;
            }
          case 109: break;
          case 54: 
            { return FALSE_KEYWORD;
            }
          case 110: break;
          case 55: 
            { return TRACK_BY_KEYWORD;
            }
          case 111: break;
          case 56: 
            { return UNDEFINED_KEYWORD;
            }
          case 112: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
