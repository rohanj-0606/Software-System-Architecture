//SelectGas and Cancel Function is called in S3 Class
package states;
import output.Output;
public class S3 extends State {

	public void SelectGas(int g)
	{
		Output.SetPrice(g); //SetPrice of Output class is called to set the price of selected gas by the user.
	}
	public void Cancel()
	{
		Output.CancelMsg(); //CancelMsg of Output class is called to cancel the operation.
	}
}
