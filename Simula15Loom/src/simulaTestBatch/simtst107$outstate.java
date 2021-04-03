package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jan 31 10:26:39 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst107$outstate extends PROC$ {
    public int p$c;
    int i=0;
    float r=0.0f;
    public simtst107$outstate setPar(Object param) {
        try {
            switch($nParLeft--) {
                case 1: p$c=intValue(param); break;
                default: throw new RuntimeException("Too many parameters");
            }
        }
        catch(ClassCastException e) { throw new RuntimeException("Wrong type of parameter: "+param,e);}
        return(this);
    }
    public simtst107$outstate(RTObject$ SL$) {
        super(SL$,1);
    }
    public simtst107$outstate(RTObject$ SL$,int sp$c) {
        super(SL$);
        this.p$c = sp$c;
        BBLK();
        STM$();
    }
    public simtst107$outstate STM$() {
        sysout().outtext(new TXT$("State("));
        ;
        sysout().outint(((simtst107)(CUR$.SL$)).testno$2,1);
        ;
        sysout().outchar(',');
        ;
        sysout().outint(p$c,2);
        ;
        sysout().outtext(new TXT$("): "));
        ;
        for(i=1;i<=10;i++) {
            {
                if(VALUE$(((simtst107)(CUR$.SL$)).active.Elt[i-((simtst107)(CUR$.SL$)).active.LB[0]])) {
                    sysout().outtext(new TXT$(" a    "));
                } else
                if(VALUE$(((simtst107)(CUR$.SL$)).terminatd.Elt[i-((simtst107)(CUR$.SL$)).terminatd.LB[0]])) {
                    sysout().outtext(new TXT$(" t    "));
                } else
                sysout().outtext(new TXT$("p/s   "));
                ;
            }
        }
        ;
        new simtst107$outimage((CUR$.SL$));
        ;
        sysout().outtext(new TXT$("SQS:      "));
        ;
        for(i=1;i<=10;i++) {
            {
                if(VALUE$(((simtst107)(CUR$.SL$)).pa.Elt[i-((simtst107)(CUR$.SL$)).pa.LB[0]].idle())) {
                    {
                        if(VALUE$(((simtst107)(CUR$.SL$)).pa.Elt[i-((simtst107)(CUR$.SL$)).pa.LB[0]].terminated())) {
                            sysout().outtext(new TXT$("    t "));
                        } else
                        sysout().outtext(new TXT$("    p "));
                        ;
                    }
                } else
                if(VALUE$((((simtst107)(CUR$.SL$)).current()==(((simtst107)(CUR$.SL$)).pa.Elt[i-((simtst107)(CUR$.SL$)).pa.LB[0]])))) {
                    sysout().outtext(new TXT$("    a "));
                } else
                sysout().outtext(new TXT$("    s "));
                ;
            }
        }
        ;
        new simtst107$outimage((CUR$.SL$));
        ;
        sysout().outfix(((simtst107)(CUR$.SL$)).time(),2,6);
        ;
        sysout().outtext(new TXT$(" :   "));
        ;
        for(i=1;i<=10;i++) {
            {
                if(VALUE$(((simtst107)(CUR$.SL$)).pa.Elt[i-((simtst107)(CUR$.SL$)).pa.LB[0]].idle())) {
                    sysout().outtext(new TXT$("  idle"));
                } else
                if(VALUE$((((simtst107)(CUR$.SL$)).pa.Elt[i-((simtst107)(CUR$.SL$)).pa.LB[0]]!=(((simtst107)(CUR$.SL$)).current())))) {
                    sysout().outfix(((simtst107)(CUR$.SL$)).pa.Elt[i-((simtst107)(CUR$.SL$)).pa.LB[0]].evtime(),2,6);
                } else
                {
                    r=((float)(((simtst107)(CUR$.SL$)).time()));
                    ;
                    if(VALUE$((abs((((simtst107)(CUR$.SL$)).pa.Elt[i-((simtst107)(CUR$.SL$)).pa.LB[0]].evtime()-(((simtst107)(CUR$.SL$)).time())))>(0.0010000000474974513d)))) {
                        {
                            sysout().outfix(((simtst107)(CUR$.SL$)).pa.Elt[i-((simtst107)(CUR$.SL$)).pa.LB[0]].evtime(),2,5);
                            ;
                            sysout().outchar('*');
                        }
                    } else
                    sysout().outfix(((simtst107)(CUR$.SL$)).pa.Elt[i-((simtst107)(CUR$.SL$)).pa.LB[0]].evtime(),2,6);
                    ;
                }
            }
        }
        ;
        new simtst107$outimage((CUR$.SL$));
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst107.sim","Procedure outstate",1,34,8,35,31,37,40,38,44,40,47,41,51,42,59,44,62,45,66,47,69,48,72,49,79,51,81,52,89,54,92,55,98,57,101,58,105,60,111,61,113,62,117,63,127,66,132,67);
}
