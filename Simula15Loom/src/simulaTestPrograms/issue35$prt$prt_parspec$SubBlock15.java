// JavaLine 1 <== SourceLine 15
package simulaTestPrograms;
// Simula-2.0 Compiled at Thu Apr 02 10:27:24 CEST 2020
import simula.runtime.*;
@SuppressWarnings("unchecked")
public final class issue35$prt$prt_parspec$SubBlock15 extends BASICIO$ {
    // SubBlock: Kind=SubBlock, BlockLevel=4, firstLine=15, lastLine=21, hasLocalClasses=false, System=false
    // Declare locals as attributes
    issue35$quant q=null;
    // Normal Constructor
    public issue35$prt$prt_parspec$SubBlock15(RTObject$ staticLink) {
        super(staticLink);
        BBLK();
        // Declaration Code
    }
    // SubBlock Statements
    public RTObject$ STM$() {
        // JavaLine 18 <== SourceLine 16
        if(VALUE$((((issue35$prt$prt_parspec)(CUR$.SL$)).inspect$14$0.import$!=(null)))) {
            // JavaLine 20 <== SourceLine 18
            {
                for(boolean CB$18:new ForList(
                    new SingleElt<Link$>(new NAME$<Link$>(){ public Link$ put(Link$ x$){q=(issue35$quant)x$; return(x$);};  public Link$ get(){return((Link$)q); }	},new NAME$<Link$>() { public Link$ get(){return(((issue35$prt$prt_parspec)(CUR$.SL$)).inspect$14$0.import$.first()); }})
                   ,new WhileElt<issue35$quant>(new NAME$<issue35$quant>(){ public issue35$quant put(issue35$quant x$){q=x$; return(x$);};  public issue35$quant get(){return((issue35$quant)q); }	},new NAME$<issue35$quant>() { public issue35$quant get(){return(((issue35$quant)(q.suc()))); }},new NAME$<Boolean>() { public Boolean get(){return((q!=(null))); }})
                   )) { if(!CB$18) continue;
                // JavaLine 26 <== SourceLine 19
                {
                    new issue35$prt(((issue35)(CUR$.SL$.SL$.SL$)),q,Math.addExact(((issue35$prt$prt_parspec)(CUR$.SL$)).p$pos,8));
                    sysout().outimage();
                }
            }
        }
    }
    EBLK();
    return(this);
} // End of SubBlock Statements
public static PROGINFO$ INFO$=new PROGINFO$("issue35.sim","SubBlock SubBlock15",1,15,18,16,20,18,26,19,36,21);
} // End of SubBlock
