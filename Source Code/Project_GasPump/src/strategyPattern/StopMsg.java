//StopMsg function of strategy pattern
package strategyPattern;
import datastore.DataStore;
public abstract class StopMsg //abstract function
{
	DataStore ds;
	public abstract void stopmsg();
	//getter and setter for datastore
	public DataStore getDs() {
		return ds;
	}
	public void setDs(DataStore ds) {
		this.ds = ds;
	}
	
}
