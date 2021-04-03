/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.runtime;

/**
* 
* @author SIMULA Standards Group
* @author Øystein Myhre Andersen
*/
public final class EVENT_NOTICE$ extends Ranking {
	public double KEY;
	private double EVTIME$;
	public final Process$ PROC;

	// Constructors
    public EVENT_NOTICE$(final double EVTIME,final Process$ PROC) {
		if(Simulation$.USE_RANKING) {
			this.rnk=EVTIME;
		} else {
    	this.KEY = EVTIME;
    	this.EVTIME$ = EVTIME;
		}
    	this.PROC = PROC;
    }
    
    public void SET_EVTIME(double time) {
		if(Simulation$.USE_RANKING)	rnk=time;
		EVTIME$=time;
    }
    
    public double EVTIME() {
		if(Simulation$.USE_RANKING)	return(rnk);
		return(EVTIME$);
    }
	
    public boolean equals(EVENT_NOTICE$ other) {
    	return(PROC==other.PROC && KEY==other.KEY);
    }
	
	public String toString()
	{ return("EVENT_NOTICE$ EVTIME="+EVTIME()+", PROC="+PROC+", KEY="+KEY); }

}
