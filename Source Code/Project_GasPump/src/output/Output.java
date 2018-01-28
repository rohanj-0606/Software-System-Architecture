
//output class and required packages for this class
package output;
import strategyPattern.*;
import abstractFactory.AbstractFactory;
import datastore.DataStore;

public class Output {
	//Declaration of strategy pattern objects and assigning respective function of abstract factory pattern.
	static AbstractFactory af;
	DataStore ds;
	
	public AbstractFactory getAf() {
		return af;
	}

	public void setAf(AbstractFactory afs) {
		af = afs;
	}

	public DataStore getDs() {
		return ds;
	}

	public void setDs(DataStore ds) {
		this.ds = ds;
	}

	
	//Calling respective functions of strategy pattern
	
	public static void CancelMsg(){
		CancelMsg cm=af.getCancelMsg();
		cm.cancel_msg();
		
	}
	
	public static void DisplayMenu(){
		DisplayMenu dm=af.getDisplayMenu();
		dm.display_menu();
		
	}
	
	public static void PayMsg(){
		PayMsg pm=af.getPayMsg();
		pm.pay_msg();
		
	}
	
	public static void PrintReceipt(){
		PrintReceipt pr=af.getPrintReceipt();
		pr.printreceipt();
		
	}
	
	
	public static void ReadyMsg(){
		 ReadyMsg rm=af.getReadyMsg();
		rm.readymsg();
		
	}
	public static void RejectMsg(){
		RejectMsg rrm=af.getRejectMsg();
		rrm.reject_msg();
		
	}
	
	public static void SetPrice(int g)
	{
		SetPrice sp=af.getSetPrice();
		sp.setPrice(g);
		
	}
	public static void ReturnCash(){

		 ReturnCash rc=af.getReturnCash();
		rc.returncash();
		
	}
	
	public static void StopMsg(){
		 StopMsg sm=af.getStopMsg();
		sm.stopmsg();
		
	}
	
	public static void StoreCash(){
		StoreCash sc=af.getStoreCash();
		sc.storecash();
		
	}
	
	public static void storeData(){
		 StoreData sd=af.getStoreData();
		 
		sd.storeData();
		
	}
	public static void Total(){
		 Total t=af.getTotal();
		t.total();
	
}
	public static void SetInitValues(){
		SetInitValues siv=af.getSetInitVale();
		siv.setinitvalues();

	}

	
}
