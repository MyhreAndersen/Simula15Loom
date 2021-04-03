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
public final class OLDEVENT_NOTICE$ {
	public double KEY;
	public double EVTIME;
	public final OLDProcess$ PROC;

	// Constructors
    public OLDEVENT_NOTICE$(final double EVTIME,final OLDProcess$ PROC) {
    	this.KEY = this.EVTIME = EVTIME;
    	this.PROC = PROC;
    }
	
    public boolean equals(OLDEVENT_NOTICE$ other) {
    	return(PROC==other.PROC && KEY==other.KEY);
    }
	
	public String toString()
	{ return("EVENT_NOTICE$ EVTIME="+EVTIME+", PROC="+PROC+", KEY="+KEY); }

}
