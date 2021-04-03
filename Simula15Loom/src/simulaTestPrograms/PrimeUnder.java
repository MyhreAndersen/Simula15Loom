// JavaLine 1 <== SourceLine 14
package simulaTestPrograms;
// Simula-2.0 Compiled at Tue Feb 02 09:22:59 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class PrimeUnder extends Simulation$ {
    // PrefixedBlockDeclaration: Kind=PrefixedBlock, BlockLevel=1, firstLine=14, lastLine=36, hasLocalClasses=true, System=true, detachUsed=false
    public boolean isQPSystemBlock() { return(true); }
    public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare locals as attributes
    int acc$2=0;
    // Normal Constructor
    public PrimeUnder(RTObject$ staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BPRG("PrimeUnder");
        // Declaration Code
    }
    // Class Statements
    public PrimeUnder STM$() {
        // Class Simset: Code before inner
        // Class Simulation: Code before inner
        // Class PrimeUnder: Code before inner
        // JavaLine 25 <== SourceLine 28
        sysout().outtext(new TXT$("Show all primes less than "));
        ;
        sysout().breakoutimage();
        ;
        // JavaLine 30 <== SourceLine 30
        ((PrimeUnder)(CUR$)).ActivateAt(false,new PrimeUnder$Prime(((PrimeUnder)(CUR$))).START$(),2,false);
        ;
        // JavaLine 33 <== SourceLine 31
        hold(((double)(sysin().inint())));
        ;
        // JavaLine 36 <== SourceLine 33
        sysout().outimage();
        ;
        sysout().outimage();
        ;
        // JavaLine 41 <== SourceLine 34
        sysout().outint(acc$2,7);
        ;
        sysout().outtext(new TXT$(" primes found"));
        ;
        EBLK();
        return(this);
    } // End of Class Statements
    
    public static void main(String[] args) {
        //System.setProperty("file.encoding","UTF-8");
        RT.setRuntimeOptions(args);
        new PrimeUnder(CTX$).STM$();
    } // End of main
    public static PROGINFO$ INFO$=new PROGINFO$("PrimeUnder.sim","PrefixedBlock PrimeUnder",1,14,25,28,30,30,33,31,36,33,41,34,54,36);
} // End of Class
