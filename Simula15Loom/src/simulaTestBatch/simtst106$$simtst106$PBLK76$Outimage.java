package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jan 31 10:26:03 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst106$$simtst106$PBLK76$Outimage extends PROC$ {
    public simtst106$$simtst106$PBLK76$Outimage(RTObject$ SL$) {
        super(SL$);
        BBLK();
        STM$();
    }
    public simtst106$$simtst106$PBLK76$Outimage STM$() {
        ((simtst106$PBLK76)(CUR$.SL$)).utnr$2=Math.addExact(((simtst106$PBLK76)(CUR$.SL$)).utnr$2,1);
        ;
        ((simtst106$PBLK76)(CUR$.SL$)).ut.Elt[((simtst106$PBLK76)(CUR$.SL$)).utnr$2-((simtst106$PBLK76)(CUR$.SL$)).ut.LB[0]]=copy(copy(TXT$.strip(sysout().image)));
        ;
        ASGTXT$(sysout().image,null);
        ;
        sysout().setpos(1);
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst106.sim","Procedure Outimage",1,78,13,79,16,80,19,81,26,82);
}
