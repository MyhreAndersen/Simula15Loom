package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 01 09:53:14 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class simtst62$$Y extends CLASS$ {
    public boolean isDetachUsed() { return(true); }
    public simtst62$$Y(RTObject$ staticLink) {
        super(staticLink);
        BBLK(); // Iff no prefix
    }
    public simtst62$$Y STM$() {
        new simtst62$$trace((CUR$.SL$),copy(new TXT$("new Y")));
        ;
        detach();
        ;
        new simtst62$$trace((CUR$.SL$),copy(new TXT$("resume Y")));
        ;
        resume(((simtst62$)(CUR$.SL$)).xx);
        ;
        new simtst62$$trace((CUR$.SL$),copy(new TXT$("terminate Y")));
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst62.sim","Class Y",1,25,13,26,18,27,23,28,26,26,29,28);
}
