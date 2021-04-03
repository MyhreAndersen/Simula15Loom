// JavaLine 1 <== SourceLine 8
package simulaTestPrograms;
// Simula-2.0 Compiled at Thu Apr 09 11:03:31 CEST 2020
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class issue39$$leftint extends PROC$ {
    // ProcedureDeclaration: Kind=Procedure, BlockLevel=2, firstLine=8, lastLine=12, hasLocalClasses=false, System=false
    // Declare return value as attribute
    public TXT$ RESULT$;
    public Object RESULT$() { return(RESULT$); }
    // Declare parameters as attributes
    public int p$i;
    // Declare locals as attributes
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    public issue39$$leftint setPar(Object param) {
        //Util.BREAK("CALL issue39$$leftint.setPar: param="+param+", qual="+param.getClass().getSimpleName()+", npar="+$nParLeft+", staticLink="+SL$);
        try {
            switch($nParLeft--) {
                case 1: p$i=intValue(param); break;
                default: throw new RuntimeException("Too many parameters");
            }
        }
        catch(ClassCastException e) { throw new RuntimeException("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public issue39$$leftint(RTObject$ SL$) {
        super(SL$,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public issue39$$leftint(RTObject$ SL$,int sp$i) {
        super(SL$);
        // Parameter assignment to locals
        this.p$i = sp$i;
        BBLK();
        // Declaration Code
        STM$();
    }
    // Procedure Statements
    public issue39$$leftint STM$() {
        // JavaLine 41 <== SourceLine 9
        TXT$.putint(((issue39$)(CUR$.SL$)).leftintbuf,p$i);
        ;
        p$i=11;
        ;
        // JavaLine 46 <== SourceLine 10
        while((loadChar(((issue39$)(CUR$.SL$)).leftintbuf,p$i)!=(((char)32)))) {
            p$i=Math.subtractExact(p$i,1);
        }
        ;
        // JavaLine 51 <== SourceLine 11
        RESULT$=TXT$.sub(((issue39$)(CUR$.SL$)).leftintbuf,Math.addExact(p$i,2),Math.subtractExact(11,p$i));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static PROGINFO$ INFO$=new PROGINFO$("issue39.sim","Procedure leftint",1,8,41,9,46,10,51,11,56,12);
} // End of Procedure
