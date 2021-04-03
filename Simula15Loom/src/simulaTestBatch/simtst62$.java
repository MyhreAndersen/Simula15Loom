package simulaTestBatch;
// Simula-2.0 Compiled at Mon Feb 01 09:53:14 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst62$ extends BASICIO$ {
    public boolean isQPSystemBlock() { return(true); }
    boolean found_error=false;
    final boolean verbose=(boolean)(false);
    public ARRAY$<TXT$[]>seq=null;
    int seqi=0;
    simtst62$$Y yy=null;
    simtst62$$X xx=null;
    public simtst62$(RTObject$ staticLink) {
        super(staticLink);
        BBLK();
        BPRG("simtst62$");
        int[] seq$LB=new int[1]; int[] seq$UB=new int[1];
        seq$LB[0]=1; seq$UB[0]=30;
        BOUND_CHECK$(seq$LB[0],seq$UB[0]);
        seq=new ARRAY$<TXT$[]>(new TXT$[seq$UB[0]-seq$LB[0]+1],seq$LB,seq$UB);
    }
    public RTObject$ STM$() {
        if(VALUE$(verbose)) {
            {
                sysout().outtext(new TXT$("--- START Simula a.s. TEST 62"));
                ;
                sysout().outimage();
                ;
                sysout().outtext(new TXT$("--- Test complex use of detach and resume."));
                ;
                sysout().outimage();
                ;
                sysout().outimage();
                ;
            }
        }
        ;
        yy=((simtst62$$Y)new simtst62$$Y((CUR$)).START$());
        ;
        xx=((simtst62$$X)new simtst62$$X((CUR$)).START$());
        ;
        new simtst62$$trace((CUR$),copy(new TXT$("resume(xx)")));
        ;
        resume(xx);
        ;
        if(VALUE$(((((((((((((((((((((TXTREL$EQ(seq.Elt[1-seq.LB[0]],new TXT$("new Y"))&(TXTREL$EQ(seq.Elt[2-seq.LB[0]],new TXT$("new X"))))&(TXTREL$EQ(seq.Elt[3-seq.LB[0]],new TXT$("resume(xx)"))))&(TXTREL$EQ(seq.Elt[4-seq.LB[0]],new TXT$("resume X"))))&(TXTREL$EQ(seq.Elt[5-seq.LB[0]],new TXT$("enter A-block"))))&(TXTREL$EQ(seq.Elt[6-seq.LB[0]],new TXT$("enter D-block"))))&(TXTREL$EQ(seq.Elt[7-seq.LB[0]],new TXT$("enter B"))))&(TXTREL$EQ(seq.Elt[8-seq.LB[0]],new TXT$("new C"))))&(TXTREL$EQ(seq.Elt[9-seq.LB[0]],new TXT$("resume C"))))&(TXTREL$EQ(seq.Elt[10-seq.LB[0]],new TXT$("enter E"))))&(TXTREL$EQ(seq.Elt[11-seq.LB[0]],new TXT$("new F"))))&(TXTREL$EQ(seq.Elt[12-seq.LB[0]],new TXT$("resume and exit F"))))&(TXTREL$EQ(seq.Elt[13-seq.LB[0]],new TXT$("exit E"))))&(TXTREL$EQ(seq.Elt[14-seq.LB[0]],new TXT$("terminate C"))))&(TXTREL$EQ(seq.Elt[15-seq.LB[0]],new TXT$("exit B"))))&(TXTREL$EQ(seq.Elt[16-seq.LB[0]],new TXT$("resume Y"))))&(TXTREL$EQ(seq.Elt[17-seq.LB[0]],new TXT$("terminate D-block"))))&(TXTREL$EQ(seq.Elt[18-seq.LB[0]],new TXT$("terminate A-block"))))&(TXTREL$EQ(seq.Elt[19-seq.LB[0]],new TXT$("terminate X"))))&(TRF_EQ(seq.Elt[20-seq.LB[0]],null)))&((seqi==(19)))))) {
            {
                sysout().outtext(new TXT$("--- NO ERRORS FOUND IN TEST 62"));
                ;
            }
        } else
        new simtst62$$SubBlock111((CUR$)).STM$();
        ;
        if(VALUE$(verbose)) {
            {
                sysout().outtext(new TXT$("--- END Simula a.s. TEST 62"));
                ;
                sysout().outimage();
            }
        }
        EBLK();
        return(this);
    }
    
    public static void main(String[] args) {
        RT.setRuntimeOptions(args);
        new simtst62$(CTX$).STM$();
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst62.sim","SimulaProgram simtst62$",1,10,9,11,11,13,13,14,15,23,22,13,29,76,31,77,35,78,38,79,41,80,49,83,54,85,59,87,61,108,67,121,70,123,72,124,76,129,87,129);
}
