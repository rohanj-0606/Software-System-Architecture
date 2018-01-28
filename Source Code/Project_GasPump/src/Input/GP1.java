//GasPump 1 main class.
package Input;
import abstractFactory.AbstractFactory;
import datastore.DataStore;
import mda.MDA;



public class GP1 {
	//creating objects of MDA, Datastore and Abstract Factory classes.
	MDA mda;
	DataStore ds;
	AbstractFactory af;
	
	//Getter and Setters of Abstract Factory, MDA and Datastore objects.

	public AbstractFactory getAf() {
		return af;
	}

	public void setAf(AbstractFactory af) {
		this.af = af;
	}

	public MDA getMda() {
		return mda;
	}

	public void setMda(MDA mda) {
		this.mda = mda;
	}

	public DataStore getDs() {
		return ds;
	}

	public void setDs(DataStore ds) {
		this.ds = ds;
	}

	//Implementations of functions of GasPump1 using mda.
	public void Activate(float a, float b)
	{
		if((a>0)&&(b>0))
		{
		ds.seta(a);
		ds.setb(b);
		mda.Activate();
		}
	}
	
	public void Start()
	{
		mda.Start();
	}
	
	public void PayCredit()
	{
		 mda.PayCredit();
	}
	public void Aprroved()
	{
		mda.Approved();
	}
	public void Reject(){
		mda.Reject();
		
	}
	public void Cancel()
	{
		mda.Cancel();
		
	}
	
	public void Regular(){
		mda.SelectGas(1);
	}
	public void Super(){
		mda.SelectGas(2);
	}
	
	public void PumpGallon()
	{
		mda.Pump();
	}

	public void StartPump()
	{
		mda.StartPump();
	}
	public void StopPump()
	{
		mda.StopPump();
		mda.Receipt();
	}
	
}
