//Return Cash Function of Strategy Function
package strategyPattern;
import datastore.DataStore;
public abstract class ReturnCash {
	DataStore ds;
	public abstract void returncash(); //abstract function
	
	//getter and setter for datastore.
	public DataStore getDs() {
		return ds;
	}
	public void setDs(DataStore ds) {
		this.ds = ds;
	}
	
}
