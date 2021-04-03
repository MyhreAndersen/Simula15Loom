package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jan 31 10:26:39 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class simtst107$p extends Process$ {
    public boolean isDetachUsed() { return(true); }
    public int p3$i;
    public simtst107$p(RTObject$ staticLink,int sp3$i) {
        super(staticLink);
        this.p3$i = sp3$i;
    }
    public simtst107$p STM$() {
        detach();
        sysout().outtext(new TXT$("p("));
        ;
        sysout().outint(p3$i,2);
        ;
        sysout().outtext(new TXT$(") activated at time = "));
        ;
        sysout().outfix(((simtst107)(CUR$.SL$)).time(),3,8);
        ;
        new simtst107$outimage((CUR$.SL$));
        ;
        ((simtst107)(CUR$.SL$)).passive.Elt[p3$i-((simtst107)(CUR$.SL$)).passive.LB[0]]=false;
        ;
        ((simtst107)(CUR$.SL$)).terminatd.Elt[p3$i-((simtst107)(CUR$.SL$)).terminatd.LB[0]]=false;
        ;
        ((simtst107)(CUR$.SL$)).active.Elt[p3$i-((simtst107)(CUR$.SL$)).active.LB[0]]=true;
        ;
        new simtst107$outstate((CUR$.SL$),p3$i);
        ;
        ((simtst107)(CUR$.SL$)).active.Elt[p3$i-((simtst107)(CUR$.SL$)).active.LB[0]]=false;
        ;
        ((simtst107)(CUR$.SL$)).terminatd.Elt[p3$i-((simtst107)(CUR$.SL$)).terminatd.LB[0]]=true;
        ;
        ((simtst107)(CUR$.SL$)).passive.Elt[p3$i-((simtst107)(CUR$.SL$)).passive.LB[0]]=false;
        ;
        terminate();
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst107.sim","Class p",1,23,14,1,16,24,21,25,28,26,35,27,38,28,45,1,47,24,50,29);
}
