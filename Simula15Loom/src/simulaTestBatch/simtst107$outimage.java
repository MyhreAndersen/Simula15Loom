package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jan 31 10:26:39 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst107$outimage extends PROC$ {
    public simtst107$outimage(RTObject$ SL$) {
        super(SL$);
        BBLK();
        STM$();
    }
    public simtst107$outimage STM$() {
        ((simtst107)(CUR$.SL$)).utno$2=Math.addExact(((simtst107)(CUR$.SL$)).utno$2,1);
        ;
        ((simtst107)(CUR$.SL$)).ut.Elt[((simtst107)(CUR$.SL$)).utno$2-((simtst107)(CUR$.SL$)).ut.LB[0]]=copy(copy(TXT$.strip(sysout().image)));
        ;
        ASGTXT$(sysout().image,null);
        ;
        sysout().setpos(1);
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst107.sim","Procedure outimage",1,17,13,18,18,19,21,20,26,21);
}
