// JavaLine 1 <== SourceLine 24
package simulaTestPrograms;
// Simula-2.0 Compiled at Tue Feb 02 09:20:09 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class FittingRoom$FittingRoom$reportFittingRoomAvailable extends PROC$ {
    // ProcedureDeclaration: Kind=Procedure, BlockLevel=3, firstLine=24, lastLine=34, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 25
    Link$ elt=null;
    // Normal Constructor
    public FittingRoom$FittingRoom$reportFittingRoomAvailable(RTObject$ SL$) {
        super(SL$);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        STM$();
    }
    // Procedure Statements
    public FittingRoom$FittingRoom$reportFittingRoomAvailable STM$() {
        // JavaLine 22 <== SourceLine 26
        sysout().outfix(((FittingRoom)(CUR$.SL$.SL$)).time(),2,6);
        ;
        sysout().outtext(new TXT$(": FittingRoom becomes available, Queue: "));
        ;
        // JavaLine 27 <== SourceLine 27
        elt=((FittingRoom$FittingRoom)(CUR$.SL$)).door.first();
        ;
        // JavaLine 30 <== SourceLine 28
        if(VALUE$((elt==(null)))) {
            sysout().outtext(new TXT$("Empty"));
        }
        ;
        // JavaLine 35 <== SourceLine 29
        while((elt!=(null))) {
            // JavaLine 37 <== SourceLine 30
            {
                sysout().outtext(CONC(new TXT$(" "),((FittingRoom$Person)(elt)).p3$pname));
                ;
                // JavaLine 41 <== SourceLine 31
                elt=elt.suc();
                ;
            }
        }
        ;
        // JavaLine 47 <== SourceLine 33
        sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static PROGINFO$ INFO$=new PROGINFO$("FittingRoom.sim","Procedure reportFittingRoomAvailable",1,24,10,25,22,26,27,27,30,28,35,29,37,30,41,31,47,33,52,34);
} // End of Procedure
