//this is abstract factory main class
//all the functions are defined here which are going to be used in Concrete Factory 1 & 2
package abstractFactory;
import strategyPattern.*;
public abstract class AbstractFactory
{
	//Function declaration
	public abstract CancelMsg getCancelMsg();
	public abstract DisplayMenu getDisplayMenu();
	public abstract PayMsg getPayMsg();
	public abstract PrintReceipt getPrintReceipt();
	public abstract ReadyMsg getReadyMsg();
	public abstract RejectMsg getRejectMsg();
	public abstract ReturnCash getReturnCash();
	public abstract SetInitValues getSetInitVale();
	public abstract SetPrice getSetPrice();
	public abstract StopMsg getStopMsg();
	public abstract StoreCash getStoreCash();
	public abstract StoreData getStoreData();
	public abstract Total getTotal();

}
