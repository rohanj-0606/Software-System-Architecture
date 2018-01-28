//Pump and Total function is used in S5 class
package states;
import output.Output;
public class S5 extends State {

	public void Pump()
{
	
	Output.Total(); //Total function of Output class is called to calculate value of L/G and total.
}
	public void StopPump()
	{
		Output.StopMsg(); //StopMSg function of Output class is called to stop the pump.
	}
}
