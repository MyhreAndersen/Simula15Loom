// JavaLine 1 <== SourceLine 13
package simulaTestPrograms;
// Simula-2.0 Compiled at Thu Apr 02 10:27:24 CEST 2020
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class issue35$prt$prt_parspec extends PROC$ {
    // ProcedureDeclaration: Kind=Procedure, BlockLevel=3, firstLine=13, lastLine=21, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public issue35$parspec p$p;
    public int p$pos;
    // Declare locals as attributes
    // JavaLine 12 <== SourceLine 14
    issue35$parspec inspect$14$0=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    public issue35$prt$prt_parspec setPar(Object param) {
        //Util.BREAK("CALL issue35$prt$prt_parspec.setPar: param="+param+", qual="+param.getClass().getSimpleName()+", npar="+$nParLeft+", staticLink="+SL$);
        try {
            switch($nParLeft--) {
                case 2: p$p=(issue35$parspec)objectValue(param); break;
                case 1: p$pos=intValue(param); break;
                default: throw new RuntimeException("Too many parameters");
            }
        }
        catch(ClassCastException e) { throw new RuntimeException("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public issue35$prt$prt_parspec(RTObject$ SL$) {
        super(SL$,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public issue35$prt$prt_parspec(RTObject$ SL$,issue35$parspec sp$p,int sp$pos) {
        super(SL$);
        // Parameter assignment to locals
        this.p$p = sp$p;
        this.p$pos = sp$pos;
        BBLK();
        // Declaration Code
        STM$();
    }
    // Procedure Statements
    public issue35$prt$prt_parspec STM$() {
        {
            // BEGIN INSPECTION 
            inspect$14$0=p$p;
            if(inspect$14$0!=null) // INSPECT inspect$14$0
            // JavaLine 47 <== SourceLine 21
            new issue35$prt$prt_parspec$SubBlock15((CUR$)).STM$();
        }
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static PROGINFO$ INFO$=new PROGINFO$("issue35.sim","Procedure prt_parspec",1,13,12,14,47,21,52,21);
} // End of Procedure
