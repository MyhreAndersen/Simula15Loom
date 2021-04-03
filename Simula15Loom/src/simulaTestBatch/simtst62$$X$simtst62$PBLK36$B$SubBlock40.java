package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 01 09:53:14 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst62$$X$simtst62$PBLK36$B$SubBlock40 extends BASICIO$ {
    public boolean isQPSystemBlock() { return(true); }
    simtst62$$X$simtst62$PBLK36$B$SubBlock40$C cc=null;
    public simtst62$$X$simtst62$PBLK36$B$SubBlock40(RTObject$ staticLink) {
        super(staticLink);
        BBLK();
    }
    public RTObject$ STM$() {
        ((simtst62$$X$simtst62$PBLK36$B)(CUR$.SL$)).pi=3.14f;
        ;
        cc=((simtst62$$X$simtst62$PBLK36$B$SubBlock40$C)new simtst62$$X$simtst62$PBLK36$B$SubBlock40$C((CUR$)).START$());
        ;
        resume(cc);
        ;
        ((simtst62$$X$simtst62$PBLK36$B)(CUR$.SL$)).pi=2.71f;
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst62.sim","SubBlock SubBlock40",1,40,14,46,17,47,20,48,23,49,28,50);
}
