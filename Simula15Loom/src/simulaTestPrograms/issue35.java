// JavaLine 1 <== SourceLine 2
package simulaTestPrograms;
// Simula-2.0 Compiled at Thu Apr 02 10:27:24 CEST 2020
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class issue35 extends Simset$ {
    // PrefixedBlockDeclaration: Kind=PrefixedBlock, BlockLevel=1, firstLine=2, lastLine=22, hasLocalClasses=true, System=true, detachUsed=false
    public boolean isQPSystemBlock() { return(true); }
    // Declare parameters as attributes
    // Declare locals as attributes
    int pos$1=0;
    // Normal Constructor
    public issue35(RTObject$ staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BPRG("issue35");
        // Declaration Code
    }
    // Class Statements
    public issue35 STM$() {
        // Class Simset: Code before inner
        // Class issue35: Code before inner
        EBLK();
        return(this);
    } // End of Class Statements
    
    public static void main(String[] args) {
        //System.setProperty("file.encoding","UTF-8");
        RT.setRuntimeOptions(args);
        new issue35(CTX$).STM$();
    } // End of main
    public static PROGINFO$ INFO$=new PROGINFO$("issue35.sim","PrefixedBlock issue35",1,2,31,22);
} // End of Class
