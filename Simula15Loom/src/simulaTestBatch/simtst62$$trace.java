package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 01 09:53:14 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst62$$trace extends PROC$ {
    public TXT$ p$t;
    public simtst62$$trace setPar(Object param) {
        try {
            switch($nParLeft--) {
                case 1: p$t=(TXT$)objectValue(param); break;
                default: throw new RuntimeException("Too many parameters");
            }
        }
        catch(ClassCastException e) { throw new RuntimeException("Wrong type of parameter: "+param,e);}
        return(this);
    }
    public simtst62$$trace(RTObject$ SL$) {
        super(SL$,1);
    }
    public simtst62$$trace(RTObject$ SL$,TXT$ sp$t) {
        super(SL$);
        this.p$t = sp$t;
        BBLK();
        STM$();
    }
    public simtst62$$trace STM$() {
        ((simtst62$)(CUR$.SL$)).seqi=Math.addExact(((simtst62$)(CUR$.SL$)).seqi,1);
        ;
        ((simtst62$)(CUR$.SL$)).seq.Elt[((simtst62$)(CUR$.SL$)).seqi-((simtst62$)(CUR$.SL$)).seq.LB[0]]=p$t;
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst62.sim","Procedure trace",1,16,28,17,31,18,36,20);
}
