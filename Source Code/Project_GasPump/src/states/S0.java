//Start Function is used in S0 state.
package states;
import output.Output;
public class S0 extends State
{
	public void Start()
	{
		Output.PayMsg(); //PayMsg of Output class is called to display different payment methods.
		
	}

}
