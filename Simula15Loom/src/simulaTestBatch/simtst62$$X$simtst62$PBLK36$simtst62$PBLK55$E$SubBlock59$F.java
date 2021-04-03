package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 01 09:53:14 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class simtst62$$X$simtst62$PBLK36$simtst62$PBLK55$E$SubBlock59$F extends CLASS$ {
    public boolean isDetachUsed() { return(true); }
    public simtst62$$X$simtst62$PBLK36$simtst62$PBLK55$E$SubBlock59$F(RTObject$ staticLink) {
        super(staticLink);
        BBLK(); // Iff no prefix
    }
    public simtst62$$X$simtst62$PBLK36$simtst62$PBLK55$E$SubBlock59$F STM$() {
        new simtst62$$trace((CUR$.SL$.SL$.SL$.SL$.SL$.SL$),copy(new TXT$("new F")));
        ;
        detach();
        ;
        new simtst62$$trace((CUR$.SL$.SL$.SL$.SL$.SL$.SL$),copy(new TXT$("resume and exit F")));
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst62.sim","Class F",1,60,13,61,18,62,21,61,24,62);
}
