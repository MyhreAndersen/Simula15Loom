package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jan 31 10:26:03 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst106$$simtst106$PBLK76$townpoint$put extends PROC$ {
    public Head$ p$h;
    Link$ inspect$117$1=null;
    public simtst106$$simtst106$PBLK76$townpoint$put setPar(Object param) {
        try {
            switch($nParLeft--) {
                case 1: p$h=(Head$)objectValue(param); break;
                default: throw new RuntimeException("Too many parameters");
            }
        }
        catch(ClassCastException e) { throw new RuntimeException("Wrong type of parameter: "+param,e);}
        return(this);
    }
    public simtst106$$simtst106$PBLK76$townpoint$put(RTObject$ SL$) {
        super(SL$,1);
    }
    public simtst106$$simtst106$PBLK76$townpoint$put(RTObject$ SL$,Head$ sp$h) {
        super(SL$);
        this.p$h = sp$h;
        BBLK();
        STM$();
    }
    public simtst106$$simtst106$PBLK76$townpoint$put STM$() {
        new simtst106$$simtst106$PBLK76$townpoint((CUR$.SL$.SL$),((simtst106$$simtst106$PBLK76$townpoint)(CUR$.SL$)).p2$t).STM$().into(p$h);
        ;
        {
            inspect$117$1=((simtst106$$simtst106$PBLK76$townpoint)(CUR$.SL$)).suc();
            if(inspect$117$1 instanceof simtst106$$simtst106$PBLK76$townpoint)
            new simtst106$$simtst106$PBLK76$townpoint$put(((simtst106$$simtst106$PBLK76$townpoint)(inspect$117$1)),p$h);
        }
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst106.sim","Procedure put",1,115,8,117,30,116,33,117,42,118);
}
