//ReadyMsg function of strategy pattern
package strategyPattern;
import datastore.DataStore;
public abstract class ReadyMsg {
	DataStore ds;
	public abstract void readymsg(); //abstract function
	
	//getter and setter for datastore
	
	public DataStore getDs() {
		return ds;
	}
	public void setDs(DataStore ds) {
		this.ds = ds;
	}
	
}
