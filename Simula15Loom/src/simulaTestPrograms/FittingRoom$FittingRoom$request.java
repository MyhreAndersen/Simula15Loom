// JavaLine 1 <== SourceLine 10
package simulaTestPrograms;
// Simula-2.0 Compiled at Tue Feb 02 09:20:09 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class FittingRoom$FittingRoom$request extends PROC$ {
    // ProcedureDeclaration: Kind=Procedure, BlockLevel=3, firstLine=10, lastLine=16, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public FittingRoom$FittingRoom$request(RTObject$ SL$) {
        super(SL$);
        // Parameter assignment to locals
        BBLK();
        // Declaration Code
        STM$();
    }
    // Procedure Statements
    public FittingRoom$FittingRoom$request STM$() {
        // JavaLine 20 <== SourceLine 11
        if(VALUE$(((FittingRoom$FittingRoom)(CUR$.SL$)).inUse)) {
            // JavaLine 22 <== SourceLine 12
            {
                ((FittingRoom)(CUR$.SL$.SL$)).wait(((FittingRoom$FittingRoom)(CUR$.SL$)).door);
                ;
                // JavaLine 26 <== SourceLine 13
                ((FittingRoom$FittingRoom)(CUR$.SL$)).door.first().out();
                ;
            }
        }
        ;
        // JavaLine 32 <== SourceLine 15
        ((FittingRoom$FittingRoom)(CUR$.SL$)).inUse=true;
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static PROGINFO$ INFO$=new PROGINFO$("FittingRoom.sim","Procedure request",1,10,20,11,22,12,26,13,32,15,37,16);
} // End of Procedure
