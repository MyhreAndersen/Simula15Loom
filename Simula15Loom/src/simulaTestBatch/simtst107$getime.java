package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jan 31 10:26:39 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst107$getime extends PROC$ {
    public float RESULT$;
    public Object RESULT$() { return(RESULT$); }
    public simtst107$getime(RTObject$ SL$) {
        super(SL$);
        BBLK();
        STM$();
    }
    public simtst107$getime STM$() {
        RESULT$=((float)(TXT$.getreal(((simtst107)(CUR$.SL$)).actime$2)));
        ;
        ((simtst107)(CUR$.SL$)).actime$2=TXT$.sub(((simtst107)(CUR$.SL$)).actime$2,TXT$.pos(((simtst107)(CUR$.SL$)).actime$2),Math.addExact(Math.subtractExact(TXT$.length(((simtst107)(CUR$.SL$)).actime$2),TXT$.pos(((simtst107)(CUR$.SL$)).actime$2)),1));
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst107.sim","Procedure getime",1,78,15,79,18,80,23,81);
}
