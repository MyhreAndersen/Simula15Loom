package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jan 31 10:26:03 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class simtst106$$simtst106$PBLK76$car extends Process$ {
    public boolean isDetachUsed() { return(true); }
    public simtst106$$simtst106$PBLK76$town p3$start;
    public simtst106$$simtst106$PBLK76$town p3$destin;
    public float p3$dist;
    final LABQNT$ active=new LABQNT$(this,1,"active");
    public Head$ been$3=null;
    public simtst106$$simtst106$PBLK76$car(RTObject$ staticLink,simtst106$$simtst106$PBLK76$town sp3$start,simtst106$$simtst106$PBLK76$town sp3$destin,float sp3$dist) {
        super(staticLink);
        this.p3$start = sp3$start;
        this.p3$destin = sp3$destin;
        this.p3$dist = sp3$dist;
    }
    public simtst106$$simtst106$PBLK76$car STM$() {
        simtst106$$simtst106$PBLK76$car THIS$=(simtst106$$simtst106$PBLK76$car)CUR$;
        LOOP$:while(JTX$>=0) {
            try {
                JUMPTABLE$(JTX$);
                detach();
                LABEL$(1,"active");
                been$3=new Head$((CUR$.SL$)).STM$();
                ;
                ((simtst106$PBLK76)(CUR$.SL$)).wait(p3$start.cars$2);
                ;
                new simtst106$$simtst106$PBLK76$car$send((CUR$),suc());
                ;
                ((simtst106$PBLK76)(CUR$.SL$)).hold(((double)(p3$dist)));
                ;
                if(VALUE$(((simtst106$PBLK76)(CUR$.SL$)).stop$2)) {
                    {
                        if(VALUE$((nextev()==(null)))) {
                            ((simtst106$PBLK76)(CUR$.SL$)).ActivateAfter(false,((simtst106$PBLK76)(CUR$.SL$)).main$1,((simtst106$$simtst106$PBLK76$car)(CUR$)));
                        }
                        ;
                        GOTO$(active);
                        ;
                    }
                }
                ;
                if(VALUE$(p3$destin.gone$2)) {
                    GOTO$(active);
                }
                ;
                new simtst106$$simtst106$PBLK76$townpoint((CUR$.SL$),p3$destin).STM$().into(been$3);
                ;
                if(VALUE$((p3$destin==(((simtst106$PBLK76)(CUR$.SL$)).destination$2)))) {
                    {
                        ((simtst106$PBLK76)(CUR$.SL$)).ActivateAfter(false,((simtst106$PBLK76)(CUR$.SL$)).main$1,((simtst106$$simtst106$PBLK76$car)(CUR$)));
                        ;
                        ((simtst106$PBLK76)(CUR$.SL$)).h$2=been$3;
                        ;
                        GOTO$(active);
                        ;
                    }
                }
                ;
                new simtst106$$simtst106$PBLK76$car$send((CUR$),p3$destin.cars$2.first());
                ;
                p3$destin.gone$2=true;
                ;
                GOTO$(active);
                ;
                terminate();
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
    public static PROGINFO$ INFO$=new PROGINFO$("simtst106.sim","Class car",1,85,11,95,13,89,26,1,28,95,32,96,35,97,38,98,41,99,43,100,49,101,55,103,62,104,64,105,68,106,71,107,77,109,80,110,83,111,86,1,88,95,102,112);
}
