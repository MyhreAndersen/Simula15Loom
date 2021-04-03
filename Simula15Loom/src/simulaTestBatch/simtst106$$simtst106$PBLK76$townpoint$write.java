package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jan 31 10:26:03 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst106$$simtst106$PBLK76$townpoint$write extends PROC$ {
    public simtst106$$simtst106$PBLK76$townpoint$write(RTObject$ SL$) {
        super(SL$);
        BBLK();
        STM$();
    }
    public simtst106$$simtst106$PBLK76$townpoint$write STM$() {
        if(VALUE$(IS$(((simtst106$$simtst106$PBLK76$townpoint)(CUR$.SL$)).suc(),simtst106$$simtst106$PBLK76$townpoint.class))) {
            {
                if(VALUE$((sysout().pos()>(Math.subtractExact(100,TXT$.length(((simtst106$$simtst106$PBLK76$townpoint)(CUR$.SL$)).p2$t.p2$nam_)))))) {
                    new simtst106$$simtst106$PBLK76$Outimage((CUR$.SL$.SL$));
                }
                ;
                sysout().outtext(((simtst106$$simtst106$PBLK76$townpoint)(CUR$.SL$)).p2$t.p2$nam_);
                ;
                sysout().outtext(new TXT$(", "));
                ;
                new simtst106$$simtst106$PBLK76$townpoint$write(((simtst106$$simtst106$PBLK76$townpoint)(((simtst106$$simtst106$PBLK76$townpoint)(CUR$.SL$)).suc())));
                ;
            }
        } else
        {
            sysout().setpos(Math.subtractExact(sysout().pos(),2));
            ;
            sysout().outchar('.');
            ;
            new simtst106$$simtst106$PBLK76$Outimage((CUR$.SL$.SL$));
            ;
        }
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst106.sim","Procedure write",1,119,13,120,15,121,21,122,26,123,31,125,35,126,38,127,44,128);
}
