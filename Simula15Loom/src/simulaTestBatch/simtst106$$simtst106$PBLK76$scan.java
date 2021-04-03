package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jan 31 10:26:03 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst106$$simtst106$PBLK76$scan extends PROC$ {
    public simtst106$$simtst106$PBLK76$scan(RTObject$ SL$) {
        super(SL$);
        BBLK();
        STM$();
    }
    public simtst106$$simtst106$PBLK76$scan STM$() {
        ((simtst106$PBLK76)(CUR$.SL$)).ch$2=((simtst106$)(CUR$.SL$.SL$)).inspect$20$0.inchar();
        while((((simtst106$PBLK76)(CUR$.SL$)).ch$2==(((char)32)))) {
            ;
            ((simtst106$PBLK76)(CUR$.SL$)).ch$2=((simtst106$)(CUR$.SL$.SL$)).inspect$20$0.inchar();
        }
        ((simtst106$)(CUR$.SL$.SL$)).inspect$20$0.setpos(Math.subtractExact(((simtst106$)(CUR$.SL$.SL$)).inspect$20$0.pos(),1));
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst106.sim","Procedure scan",1,142,18,144,23,145);
}
