//SetInitValues function of strategy function
package strategyPattern;
import datastore.DataStore;
public abstract class SetInitValues {
	DataStore ds;
	public abstract void setinitvalues(); //abstract function
	//getter and setter of datastore
	public DataStore getDs() {
		return ds;
	}
	public void setDs(DataStore ds) {
		this.ds = ds;
	}
	
}
