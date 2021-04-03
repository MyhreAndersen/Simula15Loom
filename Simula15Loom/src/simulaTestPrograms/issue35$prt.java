// JavaLine 1 <== SourceLine 11
package simulaTestPrograms;
// Simula-2.0 Compiled at Thu Apr 02 10:27:24 CEST 2020
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class issue35$prt extends PROC$ {
    // ProcedureDeclaration: Kind=Procedure, BlockLevel=2, firstLine=11, lastLine=22, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public Linkage$ p$d;
    public int p$pos;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    public issue35$prt setPar(Object param) {
        //Util.BREAK("CALL issue35$prt.setPar: param="+param+", qual="+param.getClass().getSimpleName()+", npar="+$nParLeft+", staticLink="+SL$);
        try {
            switch($nParLeft--) {
                case 2: p$d=(Linkage$)objectValue(param); break;
                case 1: p$pos=intValue(param); break;
                default: throw new RuntimeException("Too many parameters");
            }
        }
        catch(ClassCastException e) { throw new RuntimeException("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public issue35$prt(RTObject$ SL$) {
        super(SL$,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public issue35$prt(RTObject$ SL$,Linkage$ sp$d,int sp$pos) {
        super(SL$);
        // Parameter assignment to locals
        this.p$d = sp$d;
        this.p$pos = sp$pos;
        BBLK();
        // Declaration Code
        STM$();
    }
    // Procedure Statements
    public issue35$prt STM$() {
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static PROGINFO$ INFO$=new PROGINFO$("issue35.sim","Procedure prt",1,11,43,22);
} // End of Procedure
