package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 01 09:53:14 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst62$PBLK55 extends simtst62$$X$simtst62$PBLK36$D {
    public simtst62$PBLK55(RTObject$ staticLink) {
        super(staticLink);
    }
    public simtst62$PBLK55 STM$() {
        ;
        new simtst62$$trace((CUR$.SL$.SL$.SL$),copy(new TXT$("enter D-block")));
        ;
        new simtst62$$X$simtst62$PBLK36$B((CUR$.SL$),new PRCQNT$(((simtst62$PBLK55)(CUR$)),simtst62$$X$simtst62$PBLK36$simtst62$PBLK55$E.class));
        ;
        resume(((simtst62$)(CUR$.SL$.SL$.SL$)).yy);
        ;
        new simtst62$$trace((CUR$.SL$.SL$.SL$),copy(new TXT$("terminate D-block")));
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst62.sim","PrefixedBlock simtst62$PBLK55",1,55,11,52,13,67,16,68,19,69,22,70,27,70);
}
