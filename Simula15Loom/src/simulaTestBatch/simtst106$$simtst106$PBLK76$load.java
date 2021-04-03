package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jan 31 10:26:03 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst106$$simtst106$PBLK76$load extends PROC$ {
    public simtst106$$simtst106$PBLK76$load(RTObject$ SL$) {
        super(SL$);
        BBLK();
        STM$();
    }
    public simtst106$$simtst106$PBLK76$load STM$() {
        ((simtst106$PBLK76)(CUR$.SL$)).t$2=blanks(100);
        ;
        ((simtst106$PBLK76)(CUR$.SL$)).ch$2=((simtst106$)(CUR$.SL$.SL$)).inspect$20$0.inchar();
        while((((simtst106$PBLK76)(CUR$.SL$)).ch$2!=(((char)32)))) {
            TXT$.putchar(((simtst106$PBLK76)(CUR$.SL$)).t$2,((simtst106$PBLK76)(CUR$.SL$)).ch$2);
            ((simtst106$PBLK76)(CUR$.SL$)).ch$2=((simtst106$)(CUR$.SL$.SL$)).inspect$20$0.inchar();
        }
        ;
        TXT$.setpos(((simtst106$PBLK76)(CUR$.SL$)).t$2,1);
        ;
        sysout().outtext(CONC(new TXT$("LOAD: "),copy(copy(((simtst106$PBLK76)(CUR$.SL$)).t$2))));
        ;
        new simtst106$$simtst106$PBLK76$Outimage((CUR$.SL$));
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst106.sim","Procedure load",1,147,13,148,18,149,23,150,26,151,33,152);
}
