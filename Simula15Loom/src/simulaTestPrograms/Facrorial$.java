// JavaLine 1 <== SourceLine 1
package simulaTestPrograms;
// Simula-2.0 Compiled at Sun Jul 26 15:01:05 CEST 2020
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class Facrorial$ extends BASICIO$ {
    // SubBlock: Kind=SimulaProgram, BlockLevel=1, firstLine=1, lastLine=51, hasLocalClasses=false, System=false
    // Declare locals as attributes
    int i=0;
    TXT$ t=null;
    // Normal Constructor
    public Facrorial$(RTObject$ staticLink) {
        super(staticLink);
        BBLK();
        BPRG("Facrorial$");
        // Declaration Code
    }
    // SimulaProgram Statements
    public RTObject$ STM$() {
        // JavaLine 20 <== SourceLine 44
        i=3536;
        ;
        // JavaLine 23 <== SourceLine 46
        t=(((i==(0)))?(copy(copy(new TXT$("1")))):(new Facrorial$$fact(((Facrorial$)(CUR$)),i).RESULT$));
        ;
        // JavaLine 26 <== SourceLine 47
        sysout().outtext(new TXT$("Number of digits:"));
        ;
        sysout().outint(TXT$.length(t),7);
        ;
        sysout().outimage();
        ;
        sysout().outimage();
        ;
        // JavaLine 35 <== SourceLine 48
        sysout().outtext(t);
        ;
        sysout().outimage();
        ;
        sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of SimulaProgram Statements
    
    public static void main(String[] args) {
        //System.setProperty("file.encoding","UTF-8");
        RT.setRuntimeOptions(args);
        new Facrorial$(CTX$).STM$();
    } // End of main
    public static PROGINFO$ INFO$=new PROGINFO$("Facrorial.sim","SimulaProgram Facrorial$",1,1,20,44,23,46,26,47,35,48,50,51);
} // End of SubBlock
