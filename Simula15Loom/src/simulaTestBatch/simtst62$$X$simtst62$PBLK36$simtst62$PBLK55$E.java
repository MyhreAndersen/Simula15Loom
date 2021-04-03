package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 01 09:53:14 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst62$$X$simtst62$PBLK36$simtst62$PBLK55$E extends PROC$ {
    int i=0;
    public simtst62$$X$simtst62$PBLK36$simtst62$PBLK55$E(RTObject$ SL$) {
        super(SL$);
        BBLK();
        STM$();
    }
    public simtst62$$X$simtst62$PBLK36$simtst62$PBLK55$E STM$() {
        new simtst62$$trace((CUR$.SL$.SL$.SL$.SL$),copy(new TXT$("enter E")));
        ;
        new simtst62$$X$simtst62$PBLK36$simtst62$PBLK55$E$SubBlock59((CUR$)).STM$();
        ;
        new simtst62$$trace((CUR$.SL$.SL$.SL$.SL$),copy(new TXT$("exit E")));
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst62.sim","Procedure E",6,56,14,57,17,65,20,66,25,66);
}
