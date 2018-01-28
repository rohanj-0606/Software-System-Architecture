//SetPrice function of strategy pattern
package strategyPattern;
import datastore.DataStore;
public abstract class SetPrice //abstract function
{
	DataStore ds;
	//getter and setter for datastore
	public DataStore getDs() {
		return ds;
	}
	public void setDs(DataStore ds) {
		this.ds = ds;
	}
	public abstract void setPrice(int g);
	
}
