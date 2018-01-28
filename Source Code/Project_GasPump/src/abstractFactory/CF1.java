//Concrete Factory 1 class referring to Gaspump1
package abstractFactory;
import strategyPattern.*;
import datastore.DataStore;
import datastore.DataStore1;


public class CF1 extends AbstractFactory{

	//objects for strategy pattern are created here
	CancelMsg cancelmsg = new CancelMsg1();
	DisplayMenu dispmenu = new DisplayMenu1();
	PayMsg pmsg = new PayMsg1();
	ReadyMsg rm = new ReadyMsg1();
	RejectMsg rrm = new RejectMsg1();
	SetInitValues siv = new SetInitValues1();
	PrintReceipt pr=new PrintReceipt1();
	StopMsg sm =new StopMsg1();
	StoreCash sc = new StoreCash1();
	StoreData sd = new StoreData1();
	Total t = new Total1();
	ReturnCash rc=new ReturnCash2();
	SetPrice sp = new SetPrice1();
	
	
	//object of datastore1 for CF1 and GP1
	DataStore data=new DataStore1();
	
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


	@Override
	public StoreData getStoreData() {
		sd.setDs(data);
		return (this.sd);
	}

	@Override
	public Total getTotal() {
		t.setDs(data);
		return this.t;	
	}



	@Override
	public ReturnCash getReturnCash() {
		return null;
	}



	@Override
	public StoreCash getStoreCash() {
		return null;
	}
		
}
