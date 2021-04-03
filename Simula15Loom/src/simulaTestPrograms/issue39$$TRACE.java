// JavaLine 1 <== SourceLine 22
package simulaTestPrograms;
// Simula-2.0 Compiled at Thu Apr 09 11:03:31 CEST 2020
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class issue39$$TRACE extends PROC$ {
    // ProcedureDeclaration: Kind=Procedure, BlockLevel=2, firstLine=22, lastLine=25, hasLocalClasses=false, System=false
    // Declare parameters as attributes
    public TXT$ p$msg;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    public issue39$$TRACE setPar(Object param) {
        //Util.BREAK("CALL issue39$$TRACE.setPar: param="+param+", qual="+param.getClass().getSimpleName()+", npar="+$nParLeft+", staticLink="+SL$);
        try {
            switch($nParLeft--) {
                case 1: p$msg=(TXT$)objectValue(param); break;
                default: throw new RuntimeException("Too many parameters");
            }
        }
        catch(ClassCastException e) { throw new RuntimeException("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public issue39$$TRACE(RTObject$ SL$) {
        super(SL$,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public issue39$$TRACE(RTObject$ SL$,TXT$ sp$msg) {
        super(SL$);
        // Parameter assignment to locals
        this.p$msg = sp$msg;
        BBLK();
        // Declaration Code
        STM$();
    }
    // Procedure Statements
    public issue39$$TRACE STM$() {
        // JavaLine 38 <== SourceLine 23
        if(VALUE$((((issue39$)(CUR$.SL$)).curline>(0)))) {
            sysout().outtext(CONC(CONC(new TXT$("LINE "),new issue39$$leftint(((issue39$)(CUR$.SL$)),((issue39$)(CUR$.SL$)).curline).RESULT$),new TXT$("  ")));
        }
        ;
        // JavaLine 43 <== SourceLine 24
        sysout().outtext(p$msg);
        ;
        sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static PROGINFO$ INFO$=new PROGINFO$("issue39.sim","Procedure TRACE",1,22,38,23,43,24,50,25);
} // End of Procedure
