//RejectMsg function of strategy pattern
package strategyPattern;
import datastore.DataStore;
public abstract class RejectMsg {
	DataStore ds;
	public abstract void reject_msg(); //abstract function
	//Getter and setter for datastore
	
	public DataStore getDs() {
		return ds;
	}
	public void setDs(DataStore ds) {
		this.ds = ds;
	}
	
}
