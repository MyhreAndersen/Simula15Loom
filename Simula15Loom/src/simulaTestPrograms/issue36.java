// JavaLine 1 <== SourceLine 3
package simulaTestPrograms;
// Simula-2.0 Compiled at Thu Apr 02 10:28:21 CEST 2020
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class issue36 extends Simset$ {
    // PrefixedBlockDeclaration: Kind=PrefixedBlock, BlockLevel=1, firstLine=3, lastLine=10, hasLocalClasses=true, System=true, detachUsed=false
    public boolean isQPSystemBlock() { return(true); }
    // Declare parameters as attributes
    // Declare locals as attributes
    // Normal Constructor
    public issue36(RTObject$ staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BPRG("issue36");
        // Declaration Code
    }
    // Class Statements
    public issue36 STM$() {
        // Class Simset: Code before inner
        // Class issue36: Code before inner
        EBLK();
        return(this);
    } // End of Class Statements
    
    public static void main(String[] args) {
        //System.setProperty("file.encoding","UTF-8");
        RT.setRuntimeOptions(args);
        new issue36(CTX$).STM$();
    } // End of main
    public static PROGINFO$ INFO$=new PROGINFO$("issue36.sim","PrefixedBlock issue36",1,3,30,10);
} // End of Class
