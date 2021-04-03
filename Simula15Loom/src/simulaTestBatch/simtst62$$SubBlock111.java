package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 01 09:53:14 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst62$$SubBlock111 extends BASICIO$ {
    int i=0;
    public simtst62$$SubBlock111(RTObject$ staticLink) {
        super(staticLink);
        BBLK();
    }
    public RTObject$ STM$() {
        sysout().outtext(new TXT$("*** error : Program sequence."));
        ;
        sysout().outimage();
        ;
        for(i=1;i<=((simtst62$)(CUR$.SL$)).seqi;i++) {
            {
                sysout().outint(i,15);
                ;
                sysout().outtext(new TXT$(" : "));
                ;
                sysout().outtext(((simtst62$)(CUR$.SL$)).seq.Elt[i-((simtst62$)(CUR$.SL$)).seq.LB[0]]);
                ;
                sysout().outimage();
                ;
            }
        }
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst62.sim","SubBlock SubBlock111",1,111,13,112,16,113,20,116,24,117,27,118,30,119,38,121);
}
