package ltl2lustre;

/*
 * Fault types to consider: 
 * 		Arithmetic operator faults
 *  	Relational operator faults
 *  	Boolean operator faults
 *  	Negation faults
 *  	Delay faults
 *  	Constant faults (+1 / -1)
 *  	Node call parameter faults (misrouting parameters)
 *  	Variable replacement faults
 *  
 *   
 */
public class LTL2LustreSettings extends Settings {
	public boolean allowGUnderNegation = false;
		
	// If true does not write information to stdout.
	public boolean quiet = false;
	
	public String directory = null;
}
