// JavaLine 1 <== SourceLine 43
package simulaTestPrograms;
// Simula-2.0 Compiled at Tue Feb 02 09:20:09 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class FittingRoom$Person extends Process$ {
    // ClassDeclaration: Kind=Class, BlockLevel=2, PrefixLevel=3, firstLine=43, lastLine=53, hasLocalClasses=false, System=false, detachUsed=false
    public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    public TXT$ p3$pname;
    // Declare locals as attributes
    // Normal Constructor
    public FittingRoom$Person(RTObject$ staticLink,TXT$ sp3$pname) {
        super(staticLink);
        // Parameter assignment to locals
        this.p3$pname = sp3$pname;
        // Declaration Code
    }
    // Class Statements
    public FittingRoom$Person STM$() {
        // Class Linkage: Code before inner
        // Class Link: Code before inner
        // Class Process: Code before inner
        // JavaLine 24 <== SourceLine 1
        detach();
        // JavaLine 26 <== SourceLine 44
        // Class Person: Code before inner
        while(true) {
            // JavaLine 29 <== SourceLine 45
            {
                ((FittingRoom)(CUR$.SL$)).hold(normal(12.0d,4.0d,((FittingRoom)(CUR$.SL$)).u$2));
                ;
                // JavaLine 33 <== SourceLine 46
                new FittingRoom$report(((FittingRoom)(CUR$.SL$)),CONC(p3$pname,new TXT$(" is requesting the fitting room")));
                ;
                // JavaLine 36 <== SourceLine 47
                new FittingRoom$FittingRoom$request(((FittingRoom)(CUR$.SL$)).fittingRoom1$2);
                ;
                // JavaLine 39 <== SourceLine 48
                new FittingRoom$report(((FittingRoom)(CUR$.SL$)),CONC(p3$pname,new TXT$(" has entered the fitting room")));
                ;
                // JavaLine 42 <== SourceLine 49
                ((FittingRoom)(CUR$.SL$)).hold(normal(3.0d,1.0d,((FittingRoom)(CUR$.SL$)).u$2));
                ;
                // JavaLine 45 <== SourceLine 50
                new FittingRoom$FittingRoom$leave(((FittingRoom)(CUR$.SL$)).fittingRoom1$2);
                ;
                // JavaLine 48 <== SourceLine 51
                new FittingRoom$report(((FittingRoom)(CUR$.SL$)),CONC(p3$pname,new TXT$(" has left the fitting room")));
                ;
            }
            if(CTX$==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
        }
        ;
        // JavaLine 55 <== SourceLine 44
        // Class Person: Code after inner
        // Class Process: Code after inner
        // JavaLine 58 <== SourceLine 1
        terminate();
        // JavaLine 60 <== SourceLine 44
        EBLK();
        return(this);
    } // End of Class Statements
    public static PROGINFO$ INFO$=new PROGINFO$("FittingRoom.sim","Class Person",1,43,24,1,26,44,29,45,33,46,36,47,39,48,42,49,45,50,48,51,55,44,58,1,60,44,63,53);
} // End of Class
