// JavaLine 1 <== SourceLine 14
package simulaTestPrograms;
// Simula-2.0 Compiled at Thu Apr 09 11:03:31 CEST 2020
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class issue39$$edchar extends PROC$ {
    // ProcedureDeclaration: Kind=Procedure, BlockLevel=2, firstLine=14, lastLine=18, hasLocalClasses=false, System=false
    // Declare return value as attribute
    public TXT$ RESULT$;
    public Object RESULT$() { return(RESULT$); }
    // Declare parameters as attributes
    public char p$c;
    // Declare locals as attributes
    // JavaLine 14 <== SourceLine 15
    TXT$ t=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    public issue39$$edchar setPar(Object param) {
        //Util.BREAK("CALL issue39$$edchar.setPar: param="+param+", qual="+param.getClass().getSimpleName()+", npar="+$nParLeft+", staticLink="+SL$);
        try {
            switch($nParLeft--) {
                case 1: p$c=(char)objectValue(param); break;
                default: throw new RuntimeException("Too many parameters");
            }
        }
        catch(ClassCastException e) { throw new RuntimeException("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public issue39$$edchar(RTObject$ SL$) {
        super(SL$,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public issue39$$edchar(RTObject$ SL$,char sp$c) {
        super(SL$);
        // Parameter assignment to locals
        this.p$c = sp$c;
        BBLK();
        // Declaration Code
        STM$();
    }
    // Procedure Statements
    public issue39$$edchar STM$() {
        // JavaLine 43 <== SourceLine 16
        RESULT$=t=blanks(1);
        ;
        // JavaLine 46 <== SourceLine 17
        TXT$.putchar(t,p$c);
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static PROGINFO$ INFO$=new PROGINFO$("issue39.sim","Procedure edchar",1,14,14,15,43,16,46,17,51,18);
} // End of Procedure
