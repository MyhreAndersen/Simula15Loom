package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jan 31 10:26:03 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class simtst106$ extends BASICIO$ {
    boolean found_error=false;
    final TXT$ fileName=(TXT$)(new TXT$("C:/GitHub/SimulaCompiler/Simula/src/testing/batch/files/data96"));
    InFile$ inspect$20$0=null;
    public simtst106$(RTObject$ staticLink) {
        super(staticLink);
        BBLK();
        BPRG("simtst106$");
    }
    public RTObject$ STM$() {
        sysout().outtext(new TXT$("--- START Simula a.s. TEST 96"));
        ;
        sysout().outimage();
        ;
        sysout().outtext(new TXT$("    Test of Simulation - reads from infile \"data96\"."));
        ;
        sysout().outimage();
        ;
        sysout().outimage();
        ;
        {
            inspect$20$0=new InFile$(CTX$,fileName).STM$();
            if(inspect$20$0!=null)
            new simtst106$PBLK76((CUR$)).START$();
        }
        ;
        sysout().outtext(new TXT$("--- END Simula a.s. TEST 96"));
        ;
        if(VALUE$((!(found_error)))) {
            sysout().outtext(new TXT$(" (NO ERRORS FOUND)"));
        }
        ;
        sysout().outimage();
        ;
        EBLK();
        return(this);
    }
    
    public static void main(String[] args) {
        RT.setRuntimeOptions(args);
        new simtst106$(CTX$).STM$();
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst106.sim","SimulaProgram simtst106$",1,12,8,14,10,21,18,16,23,17,26,18,31,20,35,242,39,243,42,244,47,245,57,247);
}
