package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 01 09:53:14 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class simtst62$$X$simtst62$PBLK36$B$SubBlock40$C extends CLASS$ {
    public boolean isDetachUsed() { return(true); }
    public simtst62$$X$simtst62$PBLK36$B$SubBlock40$C(RTObject$ staticLink) {
        super(staticLink);
        BBLK(); // Iff no prefix
    }
    public simtst62$$X$simtst62$PBLK36$B$SubBlock40$C STM$() {
        new simtst62$$trace((CUR$.SL$.SL$.SL$.SL$.SL$),copy(new TXT$("new C")));
        ;
        detach();
        ;
        new simtst62$$trace((CUR$.SL$.SL$.SL$.SL$.SL$),copy(new TXT$("resume C")));
        ;
        ((simtst62$$X$simtst62$PBLK36$B)(CUR$.SL$.SL$)).p$E.CPF();
        ;
        new simtst62$$trace((CUR$.SL$.SL$.SL$.SL$.SL$),copy(new TXT$("terminate C")));
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst62.sim","Class C",1,41,13,42,18,43,23,45,26,42,29,45);
}
