// JavaLine 1 <== SourceLine 2
package simulaTestPrograms;
// Simula-2.0 Compiled at Mon Feb 01 15:09:59 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class issue40$ extends BASICIO$ {
    // SubBlock: Kind=SimulaProgram, BlockLevel=1, firstLine=2, lastLine=7, hasLocalClasses=false, System=false
    // Declare locals as attributes
    int i=0;
    int j=0;
    // Normal Constructor
    public issue40$(RTObject$ staticLink) {
        super(staticLink);
        BBLK();
        BPRG("issue40$");
        // Declaration Code
    }
    // SimulaProgram Statements
    public RTObject$ STM$() {
        // JavaLine 20 <== SourceLine 3
        i=123456789;
        ;
        // JavaLine 23 <== SourceLine 4
        j=-1395630315;
        ;
        // JavaLine 26 <== SourceLine 5
        sysout().outint(i,20);
        ;
        sysout().outimage();
        ;
        // JavaLine 31 <== SourceLine 6
        sysout().outint(j,20);
        ;
        sysout().outimage();
        ;
        EBLK();
        return(this);
    } // End of SimulaProgram Statements
    
    public static void main(String[] args) {
        //System.setProperty("file.encoding","UTF-8");
        RT.setRuntimeOptions(args);
        new issue40$(CTX$).STM$();
    } // End of main
    public static PROGINFO$ INFO$=new PROGINFO$("issue40.sim","SimulaProgram issue40$",1,2,20,3,23,4,26,5,31,6,44,7);
} // End of SubBlock
