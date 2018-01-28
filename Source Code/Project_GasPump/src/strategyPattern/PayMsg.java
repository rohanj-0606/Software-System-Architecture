//PayMsg function part of strategy pattern.
package strategyPattern;

import datastore.DataStore;

public abstract class PayMsg {
	DataStore ds;
	public abstract void pay_msg(); //abstract function
	//Getter and setter of DataStore.
	public DataStore getDs() {
		return ds;
	}
	public void setDs(DataStore ds) {
		this.ds = ds;
	}
	
	
}
