package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 01 09:53:14 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class simtst62$$X extends CLASS$ {
    public boolean isDetachUsed() { return(true); }
    public simtst62$$X(RTObject$ staticLink) {
        super(staticLink);
        BBLK(); // Iff no prefix
    }
    public simtst62$$X STM$() {
        new simtst62$$trace((CUR$.SL$),copy(new TXT$("new X")));
        ;
        detach();
        ;
        new simtst62$$trace((CUR$.SL$),copy(new TXT$("resume X")));
        ;
        new simtst62$PBLK36((CUR$)).STM$();
        ;
        new simtst62$$trace((CUR$.SL$),copy(new TXT$("terminate X")));
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst62.sim","Class X",1,30,13,32,18,33,21,72,24,74,27,32,30,74);
}
