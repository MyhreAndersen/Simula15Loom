// JavaLine 1 <== SourceLine 10
package simulaTestPrograms;
// Simula-2.0 Compiled at Thu Apr 02 12:30:37 CEST 2020
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class Issue37a$parspec extends CLASS$ {
    // ClassDeclaration: Kind=Class, BlockLevel=2, PrefixLevel=0, firstLine=10, lastLine=14, hasLocalClasses=false, System=false, detachUsed=false
    // Declare parameters as attributes
    // Declare locals as attributes
    // JavaLine 10 <== SourceLine 11
    public Head$ import$=null;
    // JavaLine 12 <== SourceLine 12
    public Issue37a$quant q=null;
    // Normal Constructor
    public Issue37a$parspec(RTObject$ staticLink) {
        super(staticLink);
        // Parameter assignment to locals
        BBLK(); // Iff no prefix
        // Declaration Code
    }
    // Class Statements
    public Issue37a$parspec STM$() {
        // JavaLine 23 <== SourceLine 13
        // Class parspec: Code before inner
        // JavaLine 25 <== SourceLine 12
        q=(Issue37a$quant)import$.first(); {
        }
        // JavaLine 28 <== SourceLine 13
        // Class parspec: Code after inner
        EBLK();
        return(this);
    } // End of Class Statements
    public static PROGINFO$ INFO$=new PROGINFO$("issue37a.sim","Class parspec",1,10,10,11,12,12,23,13,25,12,28,13,32,14);
} // End of Class
