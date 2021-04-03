package simulaTestBatch;
// Simula-2.0 Compiled at Sun Jan 31 10:26:03 CET 2021
import simula.runtime.*;
@SuppressWarnings("unchecked")
public class simtst106$$simtst106$PBLK76$town extends Link$ {
    public TXT$ p2$nam_;
    public Head$ cars$2=null;
    public boolean gone$2=false;
    public simtst106$$simtst106$PBLK76$town(RTObject$ staticLink,TXT$ sp2$nam_) {
        super(staticLink);
        this.p2$nam_ = sp2$nam_;
    }
    public simtst106$$simtst106$PBLK76$town STM$() {
        cars$2=new Head$((CUR$.SL$)).STM$();
        ;
        into(((simtst106$PBLK76)(CUR$.SL$)).towns$2);
        ;
        EBLK();
        return(this);
    }
    public static PROGINFO$ INFO$=new PROGINFO$("simtst106.sim","Class town",1,131,8,132,10,137,17,138,20,139,23,138,26,140);
}
