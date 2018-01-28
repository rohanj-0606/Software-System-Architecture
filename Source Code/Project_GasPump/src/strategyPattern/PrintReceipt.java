//PrintReceipt function of strategy pattern
package strategyPattern;
import datastore.DataStore;
public abstract class PrintReceipt {
	DataStore ds;
	public abstract void printreceipt(); //Abstract functions.
	//getter and setter for Datastore
	public DataStore getDs() {
		return ds;
	}
	public void setDs(DataStore ds) {
		this.ds = ds;
	}
	
}
