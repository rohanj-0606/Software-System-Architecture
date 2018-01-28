//Concrete Factory 2 class referring to Gaspump2
package abstractFactory;

import datastore.DataStore;
import datastore.DataStore2;
import strategyPattern.CancelMsg;
import strategyPattern.CancelMsg1;
import strategyPattern.DisplayMenu;
import strategyPattern.DisplayMenu2;
import strategyPattern.PayMsg;
import strategyPattern.PayMsg1;
import strategyPattern.PrintReceipt;
import strategyPattern.PrintReceipt2;
import strategyPattern.ReadyMsg;
import strategyPattern.ReadyMsg1;
import strategyPattern.RejectMsg;
import strategyPattern.RejectMsg1;
import strategyPattern.ReturnCash;
import strategyPattern.ReturnCash2;
import strategyPattern.SetInitValues;
import strategyPattern.SetInitValues2;
import strategyPattern.SetPrice;
import strategyPattern.StopMsg;
import strategyPattern.StopMsg1;
import strategyPattern.StoreCash;
import strategyPattern.StoreCash1;
import strategyPattern.StoreData;
import strategyPattern.StoreData2;
import strategyPattern.Total;
import strategyPattern.SetPrice2;

import strategyPattern.Total2;

public class CF2 extends AbstractFactory{
	
	
	
	//objects for strategy pattern are created here

	CancelMsg cancelmsg = new CancelMsg1();
	DisplayMenu dispmenu = new DisplayMenu2();
	PayMsg pmsg = new PayMsg1();
	ReadyMsg rm = new ReadyMsg1();
	RejectMsg rrm = new RejectMsg1();
	SetInitValues siv = new SetInitValues2();
	StopMsg sm =new StopMsg1();
	StoreCash sc = new StoreCash1();
	StoreData sd = new StoreData2();
	Total t = new Total2();
	ReturnCash rc=new ReturnCash2();
	PrintReceipt pr=new PrintReceipt2();
	SetPrice sp = new SetPrice2();

	
	//object of datastore2 for CF2 and GP2
	
	DataStore data=new DataStore2();

	public DataStore getData(){
		
		return data;
	}

	//Getters of strategy pattern functions and setting datastore for each function

	
	@Override
	public CancelMsg getCancelMsg() {
		cancelmsg.setDs(data);
		return (this.cancelmsg);
	}

	@Override
	public DisplayMenu getDisplayMenu() {
		dispmenu.setDs(data);
		return (this.dispmenu);
	}

	@Override
	public PayMsg getPayMsg() {
		pmsg.setDs(data);
		return (this.pmsg);
	}

	@Override
	public PrintReceipt getPrintReceipt() {
		pr.setDs(data);
		return this.pr;
	}



	@Override
	public ReadyMsg getReadyMsg() {
		rm.setDs(data);
		return (this.rm);
	}
	
	@Override
	public ReturnCash getReturnCash() {
		rc.setDs(data);
		return (this.rc);
	}

	@Override
	public RejectMsg getRejectMsg() {
		rrm.setDs(data);
		return (this.rrm);
	}


	@Override
	public SetInitValues getSetInitVale() {
		siv.setDs(data);
		return(this.siv);
	}

	@Override
	public SetPrice getSetPrice() {
		sp.setDs(data);
		return this.sp;
	}

	@Override
	public StopMsg getStopMsg() {
		sm.setDs(data);
		return(this.sm);
	}

	
	public StoreCash getStoreCash() {
		sc.setDs(data);
		return this.sc;
	}

	
	public StoreData getStoreData() {
		sd.setDs(data);
		return (this.sd);
	}

	
	public Total getTotal() {
		t.setDs(data);
		return this.t;	
		}
		
}
