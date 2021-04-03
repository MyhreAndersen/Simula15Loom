// JavaLine 1 <== SourceLine 31
package simulaTestPrograms;
// Simula-2.0 Compiled at Sun Jul 26 15:01:05 CEST 2020
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class Facrorial$$fact extends PROC$ {
    // ProcedureDeclaration: Kind=Procedure, BlockLevel=2, firstLine=31, lastLine=36, hasLocalClasses=false, System=false
    // Declare return value as attribute
    public TXT$ RESULT$;
    public Object RESULT$() { return(RESULT$); }
    // Declare parameters as attributes
    public int p$i;
    // Declare locals as attributes
    // JavaLine 14 <== SourceLine 32
    TXT$ t=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    public Facrorial$$fact setPar(Object param) {
        //Util.BREAK("CALL Facrorial$$fact.setPar: param="+param+", qual="+param.getClass().getSimpleName()+", npar="+$nParLeft+", staticLink="+SL$);
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
    public Facrorial$$fact(RTObject$ SL$) {
        super(SL$,1); // Expecting 1 parameters
    }
    // Normal Constructor
    public Facrorial$$fact(RTObject$ SL$,int sp$i) {
        super(SL$);
        // Parameter assignment to locals
        this.p$i = sp$i;
        BBLK();
        // Declaration Code
        STM$();
    }
    // Procedure Statements
    public Facrorial$$fact STM$() {
        // JavaLine 43 <== SourceLine 33
        t=blanks(Math.addExact(entier(log10(((double)(p$i)))),1));
        ;
        // JavaLine 46 <== SourceLine 34
        TXT$.putint(t,p$i);
        ;
        // JavaLine 49 <== SourceLine 35
        RESULT$=(((p$i>(1)))?(new Facrorial$$Krat(((Facrorial$)(CUR$.SL$)),copy(new Facrorial$$fact(((Facrorial$)(CUR$.SL$)),Math.subtractExact(p$i,1)).RESULT$),copy(t)).RESULT$):(copy(copy(new TXT$("1")))));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static PROGINFO$ INFO$=new PROGINFO$("Facrorial.sim","Procedure fact",1,31,14,32,43,33,46,34,49,35,54,36);
} // End of Procedure
