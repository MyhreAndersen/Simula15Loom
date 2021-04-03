// JavaLine 1 <== SourceLine 2
package simulaTestPrograms;
// Simula-2.0 Compiled at Tue Feb 02 09:27:46 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class adHoc00$ extends BASICIO$ {
    // SubBlock: Kind=SimulaProgram, BlockLevel=1, firstLine=2, lastLine=72, hasLocalClasses=false, System=false
    // Declare locals as attributes
    int i=0;
    final int j=(int)(4);
    final int pos=(int)(2);
    final int neg=(int)(-2);
    int q=0;
    // JavaLine 14 <== SourceLine 3
    char c=0;
    // JavaLine 16 <== SourceLine 4
    TXT$ t=null;
    // JavaLine 18 <== SourceLine 5
    float r=0.0f;
    // JavaLine 20 <== SourceLine 6
    final int k=(int)(6);
    // Normal Constructor
    public adHoc00$(RTObject$ staticLink) {
        super(staticLink);
        BBLK();
        BPRG("adHoc00$");
        // Declaration Code
    }
    // SimulaProgram Statements
    public RTObject$ STM$() {
        // JavaLine 31 <== SourceLine 8
        sysout().outtext(new TXT$("TEST CASE 10"));
        ;
        sysout().outimage();
        ;
        for(i=1;i<=20;i=i+4) {
            // JavaLine 37 <== SourceLine 12
            {
                sysout().outint(i,0);
                ;
                sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 46 <== SourceLine 16
        sysout().outtext(new TXT$("TEST CASE 9"));
        ;
        sysout().outimage();
        ;
        i=q;
        while((i<(12))) {
            // JavaLine 53 <== SourceLine 19
            {
                sysout().outint(i,0);
                ;
                sysout().outimage();
                ;
                // JavaLine 59 <== SourceLine 20
                q=Math.addExact(q,1);
                ;
            }
            i=q;
        }
        ;
        // JavaLine 66 <== SourceLine 23
        sysout().outtext(new TXT$("TEST CASE 1"));
        ;
        sysout().outimage();
        ;
        for(i=1;i<=k;i=i+2) {
            // JavaLine 72 <== SourceLine 26
            {
                sysout().outint(i,0);
                ;
                sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 81 <== SourceLine 29
        sysout().outtext(new TXT$("TEST CASE 2"));
        ;
        sysout().outimage();
        ;
        for(i=k;i>=(-(11));i=i-2) {
            // JavaLine 87 <== SourceLine 32
            {
                sysout().outint(i,0);
                ;
                sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 96 <== SourceLine 35
        sysout().outtext(new TXT$("TEST CASE 3"));
        ;
        sysout().outimage();
        ;
        for(r=1.0f;r<=((float)(k));r++) {
            // JavaLine 102 <== SourceLine 38
            {
                sysout().outint((int)Math.round(r),0);
                ;
                sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 111 <== SourceLine 41
        sysout().outtext(new TXT$("TEST CASE 4"));
        ;
        sysout().outimage();
        ;
        for(r=((float)(k));r>=1.0f;r--) {
            // JavaLine 117 <== SourceLine 44
            {
                sysout().outint((int)Math.round(r),0);
                ;
                sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 126 <== SourceLine 47
        sysout().outtext(new TXT$("TEST CASE 5"));
        ;
        sysout().outimage();
        ;
        for(i=3;i<=6;i++) {
            // JavaLine 132 <== SourceLine 50
            {
                sysout().outint(i,0);
                ;
                sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 141 <== SourceLine 53
        sysout().outtext(new TXT$("TEST CASE 6"));
        ;
        sysout().outimage();
        ;
        i=3; {
            i=(int)3.14f; {
                // JavaLine 148 <== SourceLine 57
                {
                    sysout().outint(i,0);
                    ;
                    sysout().outimage();
                    ;
                }
            }
        }
        ;
        // JavaLine 158 <== SourceLine 60
        sysout().outtext(new TXT$("TEST CASE 7"));
        ;
        sysout().outimage();
        ;
        c='?'; {
            // JavaLine 164 <== SourceLine 63
            {
                sysout().outchar(c);
                ;
                sysout().outimage();
                ;
            }
        }
        ;
        // JavaLine 173 <== SourceLine 66
        sysout().outtext(new TXT$("TEST CASE 8"));
        ;
        sysout().outimage();
        ;
        t=new TXT$("Abra"); {
            // JavaLine 179 <== SourceLine 69
            {
                sysout().outtext(t);
                ;
                sysout().outimage();
                ;
            }
        }
        ;
        EBLK();
        return(this);
    } // End of SimulaProgram Statements
    
    public static void main(String[] args) {
        //System.setProperty("file.encoding","UTF-8");
        RT.setRuntimeOptions(args);
        new adHoc00$(CTX$).STM$();
    } // End of main
    public static PROGINFO$ INFO$=new PROGINFO$("adHoc00.sim","SimulaProgram adHoc00$",1,2,14,3,16,4,18,5,20,6,31,8,37,12,46,16,53,19,59,20,66,23,72,26,81,29,87,32,96,35,102,38,111,41,117,44,126,47,132,50,141,53,148,57,158,60,164,63,173,66,179,69,196,72);
} // End of SubBlock
