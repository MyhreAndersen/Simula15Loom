// JavaLine 1 <== SourceLine 6
package simulaTestPrograms;
// Simula-2.0 Compiled at Thu Apr 02 10:28:21 CEST 2020
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class issue36$parspec extends CLASS$ {
    // ClassDeclaration: Kind=Class, BlockLevel=2, PrefixLevel=0, firstLine=6, lastLine=10, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 7
    public Head$ import$=null;
    // JavaLine 12 <== SourceLine 8
    public issue36$quant q=null;
    // Normal Constructor
    public issue36$parspec(RTObject$ staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    public issue36$parspec STM$() {
        // JavaLine 23 <== SourceLine 9
        // Class parspec: Code before inner
        // JavaLine 25 <== SourceLine 8
        q=(issue36$quant)import$.first(); {
        }
        // JavaLine 28 <== SourceLine 9
        // Class parspec: Code after inner
        EBLK();
        return(this);
    } // End of Class Statements
    public static PROGINFO$ INFO$=new PROGINFO$("issue36.sim","Class parspec",1,6,10,7,12,8,23,9,25,8,28,9,32,10);
} // End of Class
