package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jan 31 10:26:03 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst106$$simtst106$PBLK76$readReal extends PROC$ {
    public float RESULT$;
    public Object RESULT$() { return(RESULT$); }
    float r=0.0f;
    public simtst106$$simtst106$PBLK76$readReal(RTObject$ SL$) {
        super(SL$);
        BBLK();
        STM$();
    }
    public simtst106$$simtst106$PBLK76$readReal STM$() {
        r=((float)(((simtst106$)(CUR$.SL$.SL$)).inspect$20$0.inint()));
        ;
        sysout().outtext(new TXT$("REAL: "));
        ;
        sysout().outreal(r,4,18);
        ;
        new simtst106$$simtst106$PBLK76$Outimage((CUR$.SL$));
        ;
        RESULT$=r;
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst106.sim","Procedure readReal",1,154,9,155,17,156,20,157,27,158,32,159);
}
