package simulaTestBatch;
// Simula-2.0 Compiled at Thu Apr 09 09:39:40 CEST 2020
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst127$$test extends PROC$ {
    public char p$key;
    public TXT$ p$msg;
    final LABQNT$ BREAK$=new LABQNT$(this,1,"BREAK$");
    final char lowKey=(char)(((char)0));
    final char hiKey=(char)('Z');
    final char case1=(char)('A');
    final char case2=(char)('B');
    public simtst127$$test setPar(Object param) {
        try {
            switch($nParLeft--) {
                case 2: p$key=(char)objectValue(param); break;
                case 1: p$msg=(TXT$)objectValue(param); break;
                default: throw new RuntimeException("Too many parameters");
            }
        }
        catch(ClassCastException e) { throw new RuntimeException("Wrong type of parameter: "+param,e);}
        return(this);
    }
    public simtst127$$test(RTObject$ SL$) {
        super(SL$,2);
    }
    public simtst127$$test(RTObject$ SL$,char sp$key,TXT$ sp$msg) {
        super(SL$);
        this.p$key = sp$key;
        this.p$msg = sp$msg;
        BBLK();
        STM$();
    }
    public simtst127$$test STM$() {
        simtst127$$test THIS$=(simtst127$$test)CUR$;
        LOOP$:while(JTX$>=0) {
            try {
                JUMPTABLE$(JTX$);
                switch(p$key) { // BEGIN SWITCH STATEMENT
                case 65: 
                {
                    new simtst127$$trace((CUR$.SL$),CONC(p$msg,new TXT$(" selected case 1")));
                    ;
                    GOTO$(BREAK$);
                    ;
                }
                case 66: 
                {
                    new simtst127$$trace((CUR$.SL$),CONC(p$msg,new TXT$(" selected case 2")));
                    ;
                    GOTO$(BREAK$);
                    ;
                }
                case 67: 
                {
                    new simtst127$$trace((CUR$.SL$),CONC(p$msg,new TXT$(" selected case 3")));
                    ;
                    GOTO$(BREAK$);
                    ;
                }
                default:
                {
                    new simtst127$$trace((CUR$.SL$),CONC(p$msg,new TXT$(" selected case NONE")));
                    ;
                    GOTO$(((simtst127$)(CUR$.SL$)).NOMORE);
                    ;
                }
            } // END SWITCH STATEMENT
            ;
            LABEL$(1,"BREAK$");
            ;
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
public static PROGINFO$ INFO$=new PROGINFO$("simtst127.sim","Procedure test",1,27,9,56,11,29,13,30,15,31,17,32,45,34,48,37,52,38,57,42,61,43,66,47,70,48,75,52,79,53,85,56,101,56);
}
