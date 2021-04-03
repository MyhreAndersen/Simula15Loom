// JavaLine 1 <== SourceLine 39
package simulaTestPrograms;
// Simula-2.0 Compiled at Tue Feb 02 09:20:09 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class FittingRoom$report extends PROC$ {
    // ProcedureDeclaration: Kind=Procedure, BlockLevel=2, firstLine=39, lastLine=41, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public TXT$ p$message;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    public FittingRoom$report setPar(Object param) {
        //Util.BREAK("CALL FittingRoom$report.setPar: param="+param+", qual="+param.getClass().getSimpleName()+", npar="+$nParLeft+", staticLink="+SL$);
        try {
            switch($nParLeft--) {
                case 1: p$message=(TXT$)objectValue(param); break;
                default: throw new RuntimeException("Too many parameters");
            }
        }
        catch(ClassCastException e) { throw new RuntimeException("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public FittingRoom$report(RTObject$ SL$) {
        super(SL$,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public FittingRoom$report(RTObject$ SL$,TXT$ sp$message) {
        super(SL$);
        // Parameter assignment to locals
        this.p$message = sp$message;
        BBLK();
        // Declaration Code
        STM$();
    }
    // Procedure Statements
    public FittingRoom$report STM$() {
        // JavaLine 38 <== SourceLine 40
        sysout().outfix(((FittingRoom)(CUR$.SL$)).time(),2,6);
        ;
        sysout().outtext(CONC(new TXT$(": "),p$message));
        ;
        sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static PROGINFO$ INFO$=new PROGINFO$("FittingRoom.sim","Procedure report",1,39,38,40,47,41);
} // End of Procedure
