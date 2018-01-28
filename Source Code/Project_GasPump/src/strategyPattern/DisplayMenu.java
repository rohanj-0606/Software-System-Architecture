//DisplayMenu function part of strategy pattern.
package strategyPattern;
import datastore.DataStore;
public abstract class DisplayMenu {
	DataStore ds;
	public abstract void display_menu(); //abstract function
	//getter and setter for datastore
	public DataStore getDs() {
		return ds;
	}
	public void setDs(DataStore ds) {
		this.ds = ds;
	}
	
}
