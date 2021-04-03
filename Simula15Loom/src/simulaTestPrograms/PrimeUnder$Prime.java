// JavaLine 1 <== SourceLine 16
package simulaTestPrograms;
// Simula-2.0 Compiled at Tue Feb 02 09:22:59 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class PrimeUnder$Prime extends Process$ {
    // ClassDeclaration: Kind=Class, BlockLevel=2, PrefixLevel=3, firstLine=16, lastLine=26, hasLocalClasses=false, System=false, detachUsed=false
    public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 11 <== SourceLine 17
    public int which$3=0;
    // Normal Constructor
    public PrimeUnder$Prime(RTObject$ staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        // Declaration Code
    }
    // Class Statements
    public PrimeUnder$Prime STM$() {
        // Class Linkage: Code before inner
        // Class Link: Code before inner
        // Class Process: Code before inner
        // JavaLine 24 <== SourceLine 1
        detach();
        // JavaLine 26 <== SourceLine 18
        // Class Prime: Code before inner
        ((PrimeUnder)(CUR$.SL$)).acc$2=Math.addExact(((PrimeUnder)(CUR$.SL$)).acc$2,1);
        ;
        // JavaLine 30 <== SourceLine 19
        which$3=(int)Math.round(((PrimeUnder)(CUR$.SL$)).time());
        ;
        // JavaLine 33 <== SourceLine 20
        sysout().outint(which$3,7);
        ;
        // JavaLine 36 <== SourceLine 21
        while(true) {
            // JavaLine 38 <== SourceLine 22
            {
                if(VALUE$((nextev().evtime()>((((PrimeUnder)(CUR$.SL$)).time()+(1.0d)))))) {
                    // JavaLine 41 <== SourceLine 23
                    ((PrimeUnder)(CUR$.SL$)).ActivateDelay(false,new PrimeUnder$Prime(((PrimeUnder)(CUR$.SL$))).START$(),1,false);
                }
                ;
                // JavaLine 45 <== SourceLine 24
                ((PrimeUnder)(CUR$.SL$)).hold(((double)(which$3)));
                ;
            }
            if(CTX$==null) break; // Ad'Hoc to prevent JAVAC error: 'dead code' and terminate
        }
        ;
        // JavaLine 52 <== SourceLine 18
        // Class Prime: Code after inner
        // Class Process: Code after inner
        // JavaLine 55 <== SourceLine 1
        terminate();
        // JavaLine 57 <== SourceLine 18
        EBLK();
        return(this);
    } // End of Class Statements
    public static PROGINFO$ INFO$=new PROGINFO$("PrimeUnder.sim","Class Prime",1,16,11,17,24,1,26,18,30,19,33,20,36,21,38,22,41,23,45,24,52,18,55,1,57,18,60,26);
} // End of Class
