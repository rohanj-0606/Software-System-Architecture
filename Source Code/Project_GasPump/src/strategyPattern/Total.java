//Total Function of Strategy Pattern
package strategyPattern;
import datastore.DataStore;

public abstract class Total {
	DataStore ds;
	public abstract void total();
	//getter and setter for datastore
	public DataStore getDs() {
		return ds;
	}
	public void setDs(DataStore ds) {
		this.ds = ds;
	}
	

}
