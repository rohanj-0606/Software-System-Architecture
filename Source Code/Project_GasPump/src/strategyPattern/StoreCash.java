//StoreCash function of Strategy Pattern
package strategyPattern;
import datastore.DataStore;
public abstract class StoreCash//abstract function
{
	DataStore ds;
	public abstract void storecash();
	
	//getter and setter for datastore
	public DataStore getDs() {
		return ds;
	}
	public void setDs(DataStore ds) {
		this.ds = ds;
	}
	

}
