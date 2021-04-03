package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jan 31 10:26:39 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst107$createobjects extends PROC$ {
    int i=0;
    public simtst107$createobjects(RTObject$ SL$) {
        super(SL$);
        BBLK();
        STM$();
    }
    public simtst107$createobjects STM$() {
        for(i=1;i<=10;i++) {
            {
                ((simtst107)(CUR$.SL$)).pa.Elt[i-((simtst107)(CUR$.SL$)).pa.LB[0]]=((simtst107$p)new simtst107$p((CUR$.SL$),i).START$());
                ;
                ((simtst107)(CUR$.SL$)).terminatd.Elt[i-((simtst107)(CUR$.SL$)).terminatd.LB[0]]=false;
                ;
                ((simtst107)(CUR$.SL$)).active.Elt[i-((simtst107)(CUR$.SL$)).active.LB[0]]=false;
                ;
                ((simtst107)(CUR$.SL$)).passive.Elt[i-((simtst107)(CUR$.SL$)).passive.LB[0]]=true;
            }
        }
        ;
        ((simtst107)(CUR$.SL$)).testno$2=Math.addExact(((simtst107)(CUR$.SL$)).testno$2,1);
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst107.sim","Procedure createobjects",1,69,7,70,16,72,20,73,29,75,33,76);
}
