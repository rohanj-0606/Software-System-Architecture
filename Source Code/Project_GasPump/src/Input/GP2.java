//GasPump2 main class.

package Input;
import abstractFactory.AbstractFactory;
import datastore.DataStore;
import mda.MDA;

public class GP2 {
	//creating objects of MDA, Datastore and Abstract Factory classes.
	MDA mda;
	DataStore ds;
	AbstractFactory af;
	public MDA getMda() {
		return mda;
	}
	//Getter and Setters of Abstract Factory, MDA and Datastore objects.

	public void setMda(MDA mda) {
		this.mda = mda;
	}

	public DataStore getDs() {
		return ds;
	}

	public void setDs(DataStore ds) {
		this.ds = ds;
	}
	
	public AbstractFactory getAf() {
		return af;
	}

	public void setAf(AbstractFactory af) {
		this.af = af;
	}
	
	//Implementations of functions of GasPump2 using mda.

	public void Activate(float a, float b, float c)
	{
		if((a>0)&&(b>0)&&(c>0))
		{
		ds.seta(a);
		ds.setb(b);
		ds.setc(c);
		mda.Activate();
		}
	}
	
	public void Start()
	{
		mda.Start();
	}
	
	public void PayCash(float c)
	{
		if(c>0)
		{
			ds.setcash(c);
		mda.PayCash();
		}
	}
	
	public void Cancel()
	{
		mda.Cancel();
	}
	
	public void Super()
	{
		mda.SelectGas(1);
	}
	
	public void Regular()
	{
		mda.SelectGas(2);
		
	}
	public void Premium()
	{
		mda.SelectGas(3);
	}
	  public void StartPump()
	    {  
	       mda.StartPump();
	    }
	  
	  public void PumpLitre()
	  {
		  float cash=ds.getcash();
		  float price=ds.getprice();
		  float l=ds.getL();
		  float val=price*(l+1);
		  if(cash>=val)
			  mda.Pump();
		  else
		  {
			  System.out.println("Not enough money to pump more gas" );
			  mda.StopPump();
		  }
	  }
	  
	  
	  public void StopPump()
	    {
	       mda.StopPump();
	    }
	    public void Receipt()
	    {
	    	mda.Receipt();
	    }
	    public void NoReceipt()
	    {
	    	mda.NoReceipt();
	    }

		public void Aprroved() {
			mda.Approved();			
		}

		public void Reject() {
			mda.Reject();
		}

	
	  
	  
}
