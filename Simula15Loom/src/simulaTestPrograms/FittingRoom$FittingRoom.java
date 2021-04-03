package simulaTestPrograms;
// Simula-2.0 Compiled at Tue Feb 02 09:20:09 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class FittingRoom$FittingRoom extends CLASS$ {
    // ClassDeclaration: Kind=Class, BlockLevel=2, PrefixLevel=0, firstLine=6, lastLine=37, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 9 <== SourceLine 7
    public Head$ door=null;
    // JavaLine 11 <== SourceLine 8
    public boolean inUse=false;
    // Normal Constructor
    public FittingRoom$FittingRoom(RTObject$ staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    public FittingRoom$FittingRoom STM$() {
        // Class FittingRoom: Code before inner
        door=new Head$(((FittingRoom)(CUR$.SL$))).STM$();
        ;
        // Class FittingRoom: Code after inner
        EBLK();
        return(this);
    } // End of Class Statements
    public static PROGINFO$ INFO$=new PROGINFO$("FittingRoom.sim","Class FittingRoom",9,7,11,8,28,37);
} // End of Class
