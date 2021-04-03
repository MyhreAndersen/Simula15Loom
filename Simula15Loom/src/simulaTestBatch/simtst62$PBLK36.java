package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 01 09:53:14 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst62$PBLK36 extends simtst62$$X$A {
    public boolean isQPSystemBlock() { return(true); }
    public simtst62$PBLK36(RTObject$ staticLink) {
        super(staticLink);
    }
    public simtst62$PBLK36 STM$() {
        ;
        new simtst62$$trace((CUR$.SL$.SL$),copy(new TXT$("enter A-block")));
        ;
        new simtst62$PBLK55((CUR$)).STM$();
        ;
        new simtst62$$trace((CUR$.SL$.SL$),copy(new TXT$("terminate A-block")));
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst62.sim","PrefixedBlock simtst62$PBLK36",1,36,12,31,14,53,17,70,20,72,25,72);
}
