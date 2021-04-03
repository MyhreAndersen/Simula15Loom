package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jan 31 10:26:39 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst107$startup extends PROC$ {
    public simtst107$startup(RTObject$ SL$) {
        super(SL$);
        BBLK();
        STM$();
    }
    public simtst107$startup STM$() {
        new simtst107$outstate((CUR$.SL$),0);
        ;
        ((simtst107)(CUR$.SL$)).ActivateAt(true,((simtst107)(CUR$.SL$)).main$1,((simtst107)(CUR$.SL$)).time()+(20.0d),false);
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst107.sim","Procedure startup",1,31,13,32,20,32);
}
