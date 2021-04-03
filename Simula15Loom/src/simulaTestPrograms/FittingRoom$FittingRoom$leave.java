// JavaLine 1 <== SourceLine 18
package simulaTestPrograms;
// Simula-2.0 Compiled at Tue Feb 02 09:20:09 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class FittingRoom$FittingRoom$leave extends PROC$ {
    // ProcedureDeclaration: Kind=Procedure, BlockLevel=3, firstLine=18, lastLine=22, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public FittingRoom$FittingRoom$leave(RTObject$ SL$) {
        super(SL$);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        STM$();
    }
    // Procedure Statements
    public FittingRoom$FittingRoom$leave STM$() {
        // JavaLine 20 <== SourceLine 19
        ((FittingRoom$FittingRoom)(CUR$.SL$)).inUse=false;
        ;
        // JavaLine 23 <== SourceLine 20
        new FittingRoom$FittingRoom$reportFittingRoomAvailable(((FittingRoom$FittingRoom)(CUR$.SL$)));
        ;
        // JavaLine 26 <== SourceLine 21
        ((FittingRoom)(CUR$.SL$.SL$)).ActivateDirect(false,((Process$)(((FittingRoom$FittingRoom)(CUR$.SL$)).door.first())));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static PROGINFO$ INFO$=new PROGINFO$("FittingRoom.sim","Procedure leave",1,18,20,19,23,20,26,21,31,22);
} // End of Procedure
