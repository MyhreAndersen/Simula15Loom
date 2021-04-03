// JavaLine 1 <== SourceLine 6
package simulaTestPrograms;
// Simula-2.0 Compiled at Tue Feb 02 09:20:08 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class FittingRoom extends Simulation$ {
    // PrefixedBlockDeclaration: Kind=PrefixedBlock, BlockLevel=1, firstLine=6, lastLine=68, hasLocalClasses=true, System=true, detachUsed=false
    public boolean isQPSystemBlock() { return(true); }
    public boolean isDetachUsed() { return(true); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 55
    int u$2=0;
    // JavaLine 14 <== SourceLine 56
    FittingRoom$FittingRoom fittingRoom1$2=null;
    // Normal Constructor
    public FittingRoom(RTObject$ staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BPRG("FittingRoom");
        // Declaration Code
    }
    // Class Statements
    public FittingRoom STM$() {
        // Class Simset: Code before inner
        // Class Simulation: Code before inner
        // Class FittingRoom: Code before inner
        // JavaLine 28 <== SourceLine 58
        fittingRoom1$2=new FittingRoom$FittingRoom(((FittingRoom)(CUR$))).STM$();
        ;
        // JavaLine 31 <== SourceLine 59
        ((FittingRoom)(CUR$)).ActivateDirect(false,new FittingRoom$Person(((FittingRoom)(CUR$)),new TXT$("Sam")).START$());
        ;
        // JavaLine 34 <== SourceLine 60
        ((FittingRoom)(CUR$)).ActivateDirect(false,new FittingRoom$Person(((FittingRoom)(CUR$)),new TXT$("Sally")).START$());
        ;
        // JavaLine 37 <== SourceLine 61
        ((FittingRoom)(CUR$)).ActivateDirect(false,new FittingRoom$Person(((FittingRoom)(CUR$)),new TXT$("Andy")).START$());
        ;
        // JavaLine 40 <== SourceLine 62
        ((FittingRoom)(CUR$)).ActivateDirect(false,new FittingRoom$Person(((FittingRoom)(CUR$)),new TXT$("Peter")).START$());
        ;
        // JavaLine 43 <== SourceLine 63
        ((FittingRoom)(CUR$)).ActivateDirect(false,new FittingRoom$Person(((FittingRoom)(CUR$)),new TXT$("Elisabeth")).START$());
        ;
        // JavaLine 46 <== SourceLine 64
        ((FittingRoom)(CUR$)).ActivateDirect(false,new FittingRoom$Person(((FittingRoom)(CUR$)),new TXT$("Harry")).START$());
        ;
        // JavaLine 49 <== SourceLine 65
        ((FittingRoom)(CUR$)).ActivateDirect(false,new FittingRoom$Person(((FittingRoom)(CUR$)),new TXT$("Robert")).START$());
        ;
        // JavaLine 52 <== SourceLine 66
        ((FittingRoom)(CUR$)).ActivateDirect(false,new FittingRoom$Person(((FittingRoom)(CUR$)),new TXT$("John")).START$());
        ;
        // JavaLine 55 <== SourceLine 67
        hold(100.0d);
        ;
        EBLK();
        return(this);
    } // End of Class Statements
    
    public static void main(String[] args) {
        //System.setProperty("file.encoding","UTF-8");
        RT.setRuntimeOptions(args);
        new FittingRoom(CTX$).STM$();
    } // End of main
    public static PROGINFO$ INFO$=new PROGINFO$("FittingRoom.sim","PrefixedBlock FittingRoom",1,6,12,55,14,56,28,58,31,59,34,60,37,61,40,62,43,63,46,64,49,65,52,66,55,67,66,68);
} // End of Class
