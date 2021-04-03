// JavaLine 1 <== SourceLine 2
package simulaTestPrograms;
// Simula-2.0 Compiled at Thu Apr 09 11:03:31 CEST 2020
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class issue39$ extends BASICIO$ {
    // SubBlock: Kind=SimulaProgram, BlockLevel=1, firstLine=2, lastLine=52, hasLocalClasses=false, System=false
    // Declare local labels
    // JavaLine 9 <== SourceLine 50
    final LABQNT$ LNID=new LABQNT$(this,1,"LNID"); // Local Label #1=LNID
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 2
    final int curline=(int)(134);
    // JavaLine 14 <== SourceLine 3
    TXT$ inim=null;
    TXT$ leftintbuf=null;
    // JavaLine 17 <== SourceLine 4
    char c=0;
    // JavaLine 19 <== SourceLine 5
    int impos=0;
    // Normal Constructor
    public issue39$(RTObject$ staticLink) {
        super(staticLink);
        BBLK();
        BPRG("issue39$");
        // Declaration Code
    }
    // SimulaProgram Statements
    public RTObject$ STM$() {
        issue39$ THIS$=(issue39$)CUR$;
        LOOP$:while(JTX$>=0) {
            try {
                JUMPTABLE$(JTX$); // For ByteCode Engineering
                // JavaLine 34 <== SourceLine 27
                inim=copy(copy(new TXT$("ABC : ")));
                ;
                // JavaLine 37 <== SourceLine 28
                leftintbuf=blanks(12);
                ;
                // JavaLine 40 <== SourceLine 30
                c=loadChar(inim,impos);
                ;
                impos=Math.addExact(impos,1);
                ;
                // JavaLine 45 <== SourceLine 31
                new issue39$$TRACE(((issue39$)(CUR$)),CONC(new TXT$("Pass1.GETSYMB: LOOP: c="),new issue39$$edchar(((issue39$)(CUR$)),c).RESULT$));
                ;
                // JavaLine 48 <== SourceLine 32
                switch(c) { // BEGIN SWITCH STATEMENT
                case 97: 
                case 98: 
                case 99: 
                case 100: 
                case 101: 
                case 102: 
                case 103: 
                case 104: 
                case 105: 
                case 106: 
                case 107: 
                case 108: 
                case 109: 
                case 110: 
                case 111: 
                case 112: 
                case 113: 
                case 114: 
                case 115: 
                case 116: 
                case 117: 
                case 118: 
                case 119: 
                case 120: 
                case 121: 
                case 122: 
                case 65: 
                case 66: 
                case 67: 
                case 68: 
                case 69: 
                case 70: 
                case 71: 
                case 72: 
                case 73: 
                case 74: 
                case 75: 
                case 76: 
                case 77: 
                case 78: 
                case 79: 
                case 80: 
                case 81: 
                case 82: 
                case 83: 
                case 84: 
                case 85: 
                case 86: 
                case 87: 
                case 88: 
                case 89: 
                case 90: 
                // JavaLine 102 <== SourceLine 36
                {
                    while(true) {
                        // JavaLine 105 <== SourceLine 37
                        {
                            c=loadChar(inim,impos);
                            ;
                            impos=Math.addExact(impos,1);
                            ;
                            // JavaLine 111 <== SourceLine 38
                            new issue39$$TRACE(((issue39$)(CUR$)),CONC(new TXT$("Pass1.GETSYMB: IDENT: c="),new issue39$$edchar(((issue39$)(CUR$)),c).RESULT$));
                            ;
                            // JavaLine 114 <== SourceLine 39
                            switch(c) { // BEGIN SWITCH STATEMENT
                            case 48: 
                            case 49: 
                            case 50: 
                            case 51: 
                            case 52: 
                            case 53: 
                            case 54: 
                            case 55: 
                            case 56: 
                            case 57: 
                            case 97: 
                            case 98: 
                            case 99: 
                            case 100: 
                            case 101: 
                            case 102: 
                            case 103: 
                            case 104: 
                            case 105: 
                            case 106: 
                            case 107: 
                            case 108: 
                            case 109: 
                            case 110: 
                            case 111: 
                            case 112: 
                            case 113: 
                            case 114: 
                            case 115: 
                            case 116: 
                            case 117: 
                            case 118: 
                            case 119: 
                            case 120: 
                            case 121: 
                            case 122: 
                            case 65: 
                            case 66: 
                            case 67: 
                            case 68: 
                            case 69: 
                            case 70: 
                            case 71: 
                            case 72: 
                            case 73: 
                            case 74: 
                            case 75: 
                            case 76: 
                            case 77: 
                            case 78: 
                            case 79: 
                            case 80: 
                            case 81: 
                            case 82: 
                            case 83: 
                            case 84: 
                            case 85: 
                            case 86: 
                            case 87: 
                            case 88: 
                            case 89: 
                            case 90: 
                            case 95: 
                            ;
                            break;
                            default:
                            // JavaLine 182 <== SourceLine 43
                            {
                                new issue39$$TRACE(((issue39$)(CUR$)),CONC(new TXT$("Pass1.GETSYMB: goto LNID: c="),new issue39$$edchar(((issue39$)(CUR$)),c).RESULT$));
                                ;
                                // JavaLine 186 <== SourceLine 44
                                GOTO$(LNID); // GOTO EVALUATED LABEL
                                ;
                            }
                            break;
                        } // END SWITCH STATEMENT
                        ;
                    }
                    if(CTX$==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
                }
                ;
                // JavaLine 197 <== SourceLine 50
                LABEL$(1,"LNID");
                ;
            }
            break;
        } // END SWITCH STATEMENT
        ;
        break LOOP$;
    }
    catch(LABQNT$ q) {
        CUR$=THIS$;
        if(q.SL$!=CUR$) {
            if(RT.Option.GOTO_TRACING) TRACE_GOTO("issue39$:NON-LOCAL",q);
            CUR$.STATE$=OperationalState.terminated;
            if(RT.Option.GOTO_TRACING) TRACE_GOTO("issue39$:RE-THROW",q);
            throw(q);
        }
        if(RT.Option.GOTO_TRACING) TRACE_GOTO("issue39$:LOCAL",q);
        JTX$=q.index; continue LOOP$; // EG. GOTO Lx
    }
}
EBLK();
return(this);
} // End of SimulaProgram Statements

public static void main(String[] args) {
//System.setProperty("file.encoding","UTF-8");
RT.setRuntimeOptions(args);
new issue39$(CTX$).STM$();
} // End of main
public static PROGINFO$ INFO$=new PROGINFO$("issue39.sim","SimulaProgram issue39$",1,2,9,50,12,2,14,3,17,4,19,5,34,27,37,28,40,30,45,31,48,32,102,36,105,37,111,38,114,39,182,43,186,44,197,50,226,52);
} // End of SubBlock
