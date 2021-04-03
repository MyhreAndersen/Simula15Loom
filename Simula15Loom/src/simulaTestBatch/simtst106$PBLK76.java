package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jan 31 10:26:03 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst106$PBLK76 extends Simulation$ {
    public boolean isQPSystemBlock() { return(true); }
    public boolean isDetachUsed() { return(true); }
    final LABQNT$ EXIT=new LABQNT$(this,1,"EXIT");
    public ARRAY$<TXT$[]>answer=null;
    public ARRAY$<TXT$[]>ut=null;
    int utnr$2=0;
    int i$2=0;
    Head$ towns$2=null;
    Head$ h$2=null;
    simtst106$$simtst106$PBLK76$town r$2=null;
    simtst106$$simtst106$PBLK76$town destination$2=null;
    float starttime$2=0.0f;
    boolean stop$2=false;
    TXT$ t$2=null;
    char ch$2=0;
    public simtst106$PBLK76(RTObject$ staticLink) {
        super(staticLink);
        int[] answer$LB=new int[1]; int[] answer$UB=new int[1];
        answer$LB[0]=1; answer$UB[0]=500;
        BOUND_CHECK$(answer$LB[0],answer$UB[0]);
        answer=new ARRAY$<TXT$[]>(new TXT$[answer$UB[0]-answer$LB[0]+1],answer$LB,answer$UB);
        int[] ut$LB=new int[1]; int[] ut$UB=new int[1];
        ut$LB[0]=1; ut$UB[0]=500;
        BOUND_CHECK$(ut$LB[0],ut$UB[0]);
        ut=new ARRAY$<TXT$[]>(new TXT$[ut$UB[0]-ut$LB[0]+1],ut$LB,ut$UB);
    }
    public simtst106$PBLK76 STM$() {
        simtst106$PBLK76 THIS$=(simtst106$PBLK76)CUR$;
        LOOP$:while(JTX$>=0) {
            try {
                JUMPTABLE$(JTX$);
                if(VALUE$((!(((simtst106$)(CUR$.SL$)).inspect$20$0.open(blanks(80)))))) {
                    {
                        ((simtst106$)(CUR$.SL$)).found_error=true;
                        ;
                        sysout().outtext(new TXT$("error: Cannot open infile \"data96\" "));
                        ;
                        sysout().outimage();
                        ;
                        GOTO$(EXIT);
                    }
                }
                ;
                answer.Elt[1-answer.LB[0]]=copy(copy(new TXT$("shortest way from SAND to FJELLHAUG goes through VANG.")));
                ;
                answer.Elt[2-answer.LB[0]]=copy(copy(new TXT$("the distance is    120.000.")));
                ;
                answer.Elt[4-answer.LB[0]]=copy(copy(new TXT$("shortest way from VESTBY to DAL goes through BERG, FJELLHAUG.")));
                ;
                answer.Elt[5-answer.LB[0]]=copy(copy(new TXT$("the distance is    145.000.")));
                ;
                answer.Elt[7-answer.LB[0]]=copy(copy(new TXT$("shortest way from VANG to BERG goes through VESTBY.")));
                ;
                answer.Elt[8-answer.LB[0]]=copy(copy(new TXT$("the distance is    110.000.")));
                ;
                answer.Elt[10-answer.LB[0]]=copy(copy(new TXT$("shortest way from SAND to SUNDHOLM goes through VESTBY.")));
                ;
                answer.Elt[11-answer.LB[0]]=copy(copy(new TXT$("the distance is    110.000.")));
                ;
                t$2=blanks(100);
                ;
                towns$2=new Head$((CUR$)).STM$();
                ;
                ch$2=((simtst106$)(CUR$.SL$)).inspect$20$0.inchar();
                while((ch$2!=('*'))) {
                    {
                        ((simtst106$)(CUR$.SL$)).inspect$20$0.setpos(Math.subtractExact(((simtst106$)(CUR$.SL$)).inspect$20$0.pos(),1));
                        ;
                        new simtst106$$simtst106$PBLK76$scan((CUR$));
                        ;
                        new simtst106$$simtst106$PBLK76$load((CUR$));
                        ;
                        r$2=((towns$2.empty())?(new simtst106$$simtst106$PBLK76$town((CUR$),copy(TXT$.strip(t$2))).STM$()):(new simtst106$$simtst106$PBLK76$town$find(((simtst106$$simtst106$PBLK76$town)(towns$2.first())),TXT$.strip(t$2)).RESULT$));
                        ;
                        new simtst106$$simtst106$PBLK76$scan((CUR$));
                        ;
                        ch$2=((simtst106$)(CUR$.SL$)).inspect$20$0.inchar();
                        while((ch$2!=('}'))) {
                            {
                                ((simtst106$)(CUR$.SL$)).inspect$20$0.setpos(Math.subtractExact(((simtst106$)(CUR$.SL$)).inspect$20$0.pos(),1));
                                ;
                                new simtst106$$simtst106$PBLK76$load((CUR$));
                                ;
                                ((simtst106$PBLK76)(CUR$)).ActivateDirect(false,new simtst106$$simtst106$PBLK76$car((CUR$),r$2,new simtst106$$simtst106$PBLK76$town$find(((simtst106$$simtst106$PBLK76$town)(towns$2.first())),TXT$.strip(t$2)).RESULT$,new simtst106$$simtst106$PBLK76$readReal((CUR$)).RESULT$).START$());
                                ;
                                new simtst106$$simtst106$PBLK76$scan((CUR$));
                                ;
                            }
                            ch$2=((simtst106$)(CUR$.SL$)).inspect$20$0.inchar();
                        }
                        ;
                        new simtst106$$simtst106$PBLK76$scan((CUR$));
                        ;
                    }
                    ch$2=((simtst106$)(CUR$.SL$)).inspect$20$0.inchar();
                }
                ;
                ch$2=ch$2;
                while((!(((simtst106$)(CUR$.SL$)).inspect$20$0.lastitem()))) {
                    {
                        new simtst106$$simtst106$PBLK76$scan((CUR$));
                        ;
                        new simtst106$$simtst106$PBLK76$load((CUR$));
                        ;
                        r$2=new simtst106$$simtst106$PBLK76$town$find(((simtst106$$simtst106$PBLK76$town)(towns$2.first())),TXT$.strip(t$2)).RESULT$;
                        ;
                        new simtst106$$simtst106$PBLK76$scan((CUR$));
                        ;
                        new simtst106$$simtst106$PBLK76$load((CUR$));
                        ;
                        destination$2=new simtst106$$simtst106$PBLK76$town$find(((simtst106$$simtst106$PBLK76$town)(towns$2.first())),TXT$.strip(t$2)).RESULT$;
                        ;
                        new simtst106$$simtst106$PBLK76$townpoint((CUR$),r$2).STM$().into(((simtst106$$simtst106$PBLK76$car)(r$2.cars$2.first())).been$3);
                        ;
                        ((simtst106$PBLK76)(CUR$)).ActivateDirect(false,((Process$)(r$2.cars$2.first())));
                        ;
                        starttime$2=((float)(time()));
                        ;
                        passivate();
                        ;
                        sysout().outtext(new TXT$("shortest way from "));
                        ;
                        sysout().outtext(r$2.p2$nam_);
                        ;
                        sysout().outtext(new TXT$(" to "));
                        ;
                        sysout().outtext(destination$2.p2$nam_);
                        ;
                        if(VALUE$((h$2.cardinal()==(2)))) {
                            sysout().outtext(new TXT$(" goes direct  "));
                        } else
                        sysout().outtext(new TXT$(" goes through "));
                        ;
                        new simtst106$$simtst106$PBLK76$townpoint$write(((simtst106$$simtst106$PBLK76$townpoint)(h$2.first().suc())));
                        ;
                        sysout().outtext(new TXT$("the distance is "));
                        ;
                        sysout().outfix((time()-(((double)(starttime$2)))),3,10);
                        ;
                        sysout().outchar('.');
                        ;
                        new simtst106$$simtst106$PBLK76$Outimage((CUR$));
                        ;
                        new simtst106$$simtst106$PBLK76$Outimage((CUR$));
                        ;
                        stop$2=true;
                        ;
                        if(VALUE$((current().nextev()!=(null)))) {
                            passivate();
                        }
                        ;
                        stop$2=false;
                        ;
                        r$2=((simtst106$$simtst106$PBLK76$town)(towns$2.first()));
                        ;
                        r$2.gone$2=false;
                        ;
                        r$2=((simtst106$$simtst106$PBLK76$town)(r$2.suc()));
                        while(IS$(r$2,simtst106$$simtst106$PBLK76$town.class)) {
                            r$2.gone$2=false;
                            r$2=((simtst106$$simtst106$PBLK76$town)(r$2.suc()));
                        }
                        ;
                    }
                    ch$2=ch$2;
                }
                ;
                for(i$2=1;i$2<=utnr$2;i$2++) {
                    if(VALUE$(TXTREL$NE(ut.Elt[i$2-ut.LB[0]],answer.Elt[i$2-answer.LB[0]]))) {
                        ((simtst106$)(CUR$.SL$)).found_error=true;
                    }
                }
                ;
                if(VALUE$(((simtst106$)(CUR$.SL$)).found_error)) {
                    {
                        sysout().outtext(new TXT$("*** error : Simulation program produces erroneus output:"));
                        ;
                        sysout().outimage();
                        ;
                        for(i$2=1;i$2<=utnr$2;i$2++) {
                            {
                                sysout().outtext(ut.Elt[i$2-ut.LB[0]]);
                                ;
                                sysout().outimage();
                                ;
                                sysout().outtext(new TXT$(" - supposed to be:"));
                                ;
                                sysout().outimage();
                                ;
                                sysout().outtext(answer.Elt[i$2-answer.LB[0]]);
                                ;
                                sysout().outimage();
                                ;
                            }
                        }
                        ;
                    }
                }
                ;
                ((simtst106$)(CUR$.SL$)).inspect$20$0.close();
                ;
                LABEL$(1,"EXIT");
                ;
                break LOOP$;
            }
            catch(LABQNT$ q) {
                CUR$=THIS$;
                if(q.SL$!=CUR$) {
                    CUR$.STATE$=OperationalState.terminated;
                    throw(q);
                }
                JTX$=q.index; continue LOOP$;
            }
        }
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst106.sim","PrefixedBlock simtst106$PBLK76",1,76,9,242,11,76,16,161,19,162,22,163,24,164,26,165,28,166,32,76,47,168,52,169,55,170,62,173,65,175,68,177,71,180,74,182,77,184,80,186,83,188,86,191,89,192,94,194,102,195,105,197,110,199,114,200,117,201,120,202,127,204,136,207,142,208,145,209,150,210,153,211,156,212,159,213,164,214,169,215,174,216,176,217,181,218,186,219,191,220,196,221,199,222,204,223,207,224,214,225,224,229,230,231,232,232,234,233,240,235,246,236,251,237,262,240,265,242,281,242);
}
