package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jan 31 10:26:03 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst106$$simtst106$PBLK76$town$find extends PROC$ {
    public simtst106$$simtst106$PBLK76$town RESULT$;
    public Object RESULT$() { return(RESULT$); }
    public TXT$ p$code;
    public simtst106$$simtst106$PBLK76$town$find setPar(Object param) {
        try {
            switch($nParLeft--) {
                case 1: p$code=(TXT$)objectValue(param); break;
                default: throw new RuntimeException("Too many parameters");
            }
        }
        catch(ClassCastException e) { throw new RuntimeException("Wrong type of parameter: "+param,e);}
        return(this);
    }
    public simtst106$$simtst106$PBLK76$town$find(RTObject$ SL$) {
        super(SL$,1);
    }
    public simtst106$$simtst106$PBLK76$town$find(RTObject$ SL$,TXT$ sp$code) {
        super(SL$);
        this.p$code = sp$code;
        BBLK();
        STM$();
    }
    public simtst106$$simtst106$PBLK76$town$find STM$() {
        if(VALUE$(TXTREL$EQ(p$code,((simtst106$$simtst106$PBLK76$town)(CUR$.SL$)).p2$nam_))) {
            RESULT$=((simtst106$$simtst106$PBLK76$town)(CUR$.SL$));
        } else
        if(VALUE$((((simtst106$$simtst106$PBLK76$town)(CUR$.SL$)).suc()==(null)))) {
            RESULT$=new simtst106$$simtst106$PBLK76$town((CUR$.SL$.SL$),copy(p$code)).STM$();
        } else
        RESULT$=new simtst106$$simtst106$PBLK76$town$find(((simtst106$$simtst106$PBLK76$town)(((simtst106$$simtst106$PBLK76$town)(CUR$.SL$)).suc())),p$code).RESULT$;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst106.sim","Procedure find",1,133,30,134,34,135,38,136,42,136);
}
