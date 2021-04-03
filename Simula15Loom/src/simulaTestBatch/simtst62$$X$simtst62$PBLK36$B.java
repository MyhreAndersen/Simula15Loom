package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 01 09:53:14 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst62$$X$simtst62$PBLK36$B extends PROC$ {
    public PRCQNT$ p$E;
    float pi=0.0f;
    public simtst62$$X$simtst62$PBLK36$B setPar(Object param) {
        try {
            switch($nParLeft--) {
                case 1: p$E=procValue(param); break;
                default: throw new RuntimeException("Too many parameters");
            }
        }
        catch(ClassCastException e) { throw new RuntimeException("Wrong type of parameter: "+param,e);}
        return(this);
    }
    public simtst62$$X$simtst62$PBLK36$B(RTObject$ SL$) {
        super(SL$,1);
    }
    public simtst62$$X$simtst62$PBLK36$B(RTObject$ SL$,PRCQNT$ sp$E) {
        super(SL$);
        this.p$E = sp$E;
        BBLK();
        STM$();
    }
    public simtst62$$X$simtst62$PBLK36$B STM$() {
        new simtst62$$trace((CUR$.SL$.SL$.SL$),copy(new TXT$("enter B")));
        ;
        new simtst62$$X$simtst62$PBLK36$B$SubBlock40((CUR$)).STM$();
        ;
        new simtst62$$trace((CUR$.SL$.SL$.SL$),copy(new TXT$("exit B")));
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst62.sim","Procedure B",7,37,29,38,32,50,35,51,40,51);
}
