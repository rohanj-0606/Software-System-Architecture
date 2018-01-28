//StoreData function of strategy pattern
package strategyPattern;

import datastore.DataStore;

public abstract class StoreData //abstract function
{
	DataStore ds;
	
	public abstract void storeData();
	//getter and setter for datastore
	public DataStore getDs() {
		return ds;
	}

	public void setDs(DataStore ds) {
		this.ds = ds;
	}
	
	
}
