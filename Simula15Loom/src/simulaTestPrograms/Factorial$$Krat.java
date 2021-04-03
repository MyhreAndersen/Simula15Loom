// JavaLine 1 <== SourceLine 3
package simulaTestPrograms;
// Simula-2.0 Compiled at Sun Jul 26 15:31:16 CEST 2020
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class Factorial$$Krat extends PROC$ {
    // ProcedureDeclaration: Kind=Procedure, BlockLevel=2, firstLine=3, lastLine=29, hasLocalClasses=false, System=false
    // Declare return value as attribute
    public TXT$ RESULT$;
    public Object RESULT$() { return(RESULT$); }
    // Declare parameters as attributes
    public TXT$ p$s;
    public TXT$ p$t;
    // Declare locals as attributes
    // JavaLine 15 <== SourceLine 4
    int i=0;
    int j=0;
    int m=0;
    int n=0;
    int k=0;
    int c=0;
    char ch=0;
    TXT$ res=null;
    // Parameter Transmission in case of Formal/Virtual Procedure Call
    public Factorial$$Krat setPar(Object param) {
        //Util.BREAK("CALL Factorial$$Krat.setPar: param="+param+", qual="+param.getClass().getSimpleName()+", npar="+$nParLeft+", staticLink="+SL$);
        try {
            switch($nParLeft--) {
                case 2: p$s=(TXT$)objectValue(param); break;
                case 1: p$t=(TXT$)objectValue(param); break;
                default: throw new RuntimeException("Too many parameters");
            }
        }
        catch(ClassCastException e) { throw new RuntimeException("Wrong type of parameter: "+param,e);}
        return(this);
    }
    // Constructor in case of Formal/Virtual Procedure Call
    public Factorial$$Krat(RTObject$ SL$) {
        super(SL$,2); // Expecting 2 parameters
    }
    // Normal Constructor
    public Factorial$$Krat(RTObject$ SL$,TXT$ sp$s,TXT$ sp$t) {
        super(SL$);
        // Parameter assignment to locals
        this.p$s = sp$s;
        this.p$t = sp$t;
        BBLK();
        // Declaration Code
        STM$();
    }
    // Procedure Statements
    public Factorial$$Krat STM$() {
        // JavaLine 53 <== SourceLine 5
        res=blanks(25000);
        ;
        for(i=TXT$.length(p$t);i>=1;i--) {
            // JavaLine 57 <== SourceLine 7
            {
                TXT$.setpos(p$t,i);
                ;
                // JavaLine 61 <== SourceLine 8
                m=Math.subtractExact(rank(TXT$.getchar(p$t)),rank('0'));
                ;
                // JavaLine 64 <== SourceLine 9
                c=0;
                ;
                // JavaLine 67 <== SourceLine 10
                TXT$.setpos(res,Math.subtractExact(TXT$.length(res),Math.subtractExact(TXT$.length(p$t),i)));
                ;
                for(j=TXT$.length(p$s);j>=1;j--) {
                    // JavaLine 71 <== SourceLine 12
                    {
                        TXT$.setpos(p$s,j);
                        ;
                        // JavaLine 75 <== SourceLine 13
                        n=Math.subtractExact(rank(TXT$.getchar(p$s)),rank('0'));
                        ;
                        // JavaLine 78 <== SourceLine 14
                        ch=TXT$.getchar(res);
                        ;
                        // JavaLine 81 <== SourceLine 15
                        TXT$.setpos(res,Math.subtractExact(TXT$.pos(res),1));
                        ;
                        // JavaLine 84 <== SourceLine 16
                        k=Math.addExact(Math.addExact((((ch==(((char)32))))?(0):(Math.subtractExact(rank(ch),rank('0')))),Math.multiplyExact(m,n)),c);
                        ;
                        // JavaLine 87 <== SourceLine 17
                        c=(k/(10));
                        ;
                        // JavaLine 90 <== SourceLine 18
                        TXT$.putchar(res,char$(Math.addExact(Math.subtractExact(k,Math.multiplyExact(c,10)),rank('0'))));
                        ;
                        // JavaLine 93 <== SourceLine 19
                        TXT$.setpos(res,Math.subtractExact(TXT$.pos(res),2));
                        ;
                    }
                }
                ;
                // JavaLine 99 <== SourceLine 21
                if(VALUE$((c==(0)))) {
                    // JavaLine 101 <== SourceLine 23
                    TXT$.setpos(res,Math.addExact(TXT$.pos(res),1));
                } else
                // JavaLine 104 <== SourceLine 24
                {
                    TXT$.putchar(res,char$(Math.addExact(c,rank('0'))));
                    ;
                    // JavaLine 108 <== SourceLine 25
                    TXT$.setpos(res,Math.subtractExact(TXT$.pos(res),1));
                    ;
                }
                ;
            }
        }
        ;
        // JavaLine 116 <== SourceLine 28
        RESULT$=TXT$.sub(res,TXT$.pos(res),Math.addExact(Math.subtractExact(TXT$.length(res),TXT$.pos(res)),1));
        ;
        EBLK();
        return(this);
    } // End of Procedure BODY
    public static PROGINFO$ INFO$=new PROGINFO$("Factorial.sim","Procedure Krat",1,3,15,4,53,5,57,7,61,8,64,9,67,10,71,12,75,13,78,14,81,15,84,16,87,17,90,18,93,19,99,21,101,23,104,24,108,25,116,28,121,29);
} // End of Procedure
