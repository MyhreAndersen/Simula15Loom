// JavaLine 1 <== SourceLine 16
package simulaTestPrograms;
// Simula-2.0 Compiled at Thu Apr 02 12:30:37 CEST 2020
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class Issue37a$TRC extends PROC$ {
    // ProcedureDeclaration: Kind=Procedure, BlockLevel=2, firstLine=16, lastLine=17, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public Issue37a$quant p$q;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    public Issue37a$TRC setPar(Object param) {
        //Util.BREAK("CALL Issue37a$TRC.setPar: param="+param+", qual="+param.getClass().getSimpleName()+", npar="+$nParLeft+", staticLink="+SL$);
        try {
            switch($nParLeft--) {
                case 1: p$q=(Issue37a$quant)objectValue(param); break;
                default: throw new RuntimeException("Too many parameters");
            }
        }
        catch(ClassCastException e) { throw new RuntimeException("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public Issue37a$TRC(RTObject$ SL$) {
        super(SL$,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public Issue37a$TRC(RTObject$ SL$,Issue37a$quant sp$q) {
        super(SL$);
        // Parameter assignment to locals
        this.p$q = sp$q;
        BBLK();
        // Declaration Code
        STM$();
    }
    // Procedure Statements
    public Issue37a$TRC STM$() {
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static PROGINFO$ INFO$=new PROGINFO$("issue37a.sim","Procedure TRC",1,16,40,17);
} // End of Procedure
