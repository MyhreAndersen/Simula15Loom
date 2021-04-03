package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jan 31 10:26:03 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst106$$simtst106$PBLK76$car$send extends PROC$ {
    public Link$ p$c;
    public simtst106$$simtst106$PBLK76$car$send setPar(Object param) {
        try {
            switch($nParLeft--) {
                case 1: p$c=(Link$)objectValue(param); break;
                default: throw new RuntimeException("Too many parameters");
            }
        }
        catch(ClassCastException e) { throw new RuntimeException("Wrong type of parameter: "+param,e);}
        return(this);
    }
    public simtst106$$simtst106$PBLK76$car$send(RTObject$ SL$) {
        super(SL$,1);
    }
    public simtst106$$simtst106$PBLK76$car$send(RTObject$ SL$,Link$ sp$c) {
        super(SL$);
        this.p$c = sp$c;
        BBLK();
        STM$();
    }
    public simtst106$$simtst106$PBLK76$car$send STM$() {
        if(VALUE$(IS$(p$c,simtst106$$simtst106$PBLK76$car.class))) {
            {
                new simtst106$$simtst106$PBLK76$townpoint$put(((simtst106$$simtst106$PBLK76$townpoint)(((simtst106$$simtst106$PBLK76$car)(CUR$.SL$)).been$3.first())),((simtst106$$simtst106$PBLK76$car)(p$c)).been$3);
                ;
                ((simtst106$PBLK76)(CUR$.SL$.SL$)).ActivateDirect(false,((Process$)(p$c)));
                ;
            }
        }
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst106.sim","Procedure send",1,90,29,91,33,92,40,93);
}
