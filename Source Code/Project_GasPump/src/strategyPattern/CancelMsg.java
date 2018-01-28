//CancelMsg function part of strategy pattern.
package strategyPattern;
import datastore.DataStore;
public abstract class CancelMsg {
	DataStore ds;
	public abstract void cancel_msg(); //abstract function
	
	//Getter and setter of DataStore.
	public DataStore getDs() {
		return ds;
	}
	public void setDs(DataStore ds) {
		this.ds = ds;
	}
	

}
