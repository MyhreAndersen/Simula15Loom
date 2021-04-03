// JavaLine 1 <== SourceLine 2
package simulaTestPrograms;
// Simula-2.0 Compiled at Fri Aug 07 10:01:39 CEST 2020
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class adHoc03$ extends BASICIO$ {
    // SubBlock: Kind=SimulaProgram, BlockLevel=1, firstLine=2, lastLine=7, hasLocalClasses=false, System=false
    // Declare locals as attributes
    int i=0;
    int j=0;
    // Normal Constructor
    public adHoc03$(RTObject$ staticLink) {
        super(staticLink);
        BBLK();
        BPRG("adHoc03$");
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
        new adHoc03$(CTX$).STM$();
    } // End of main
    public static PROGINFO$ INFO$=new PROGINFO$("adHoc03.sim","SimulaProgram adHoc03$",1,2,20,3,23,4,26,5,31,6,44,7);
} // End of SubBlock
