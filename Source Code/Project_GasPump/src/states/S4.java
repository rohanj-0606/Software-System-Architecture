//StartPump function is called in S4 class
package states;

import output.Output;
public class S4 extends State {


public void StartPump()
{
	Output.SetInitValues();  //SetInitValues function of Output Class is called to initialize values.
	Output.ReadyMsg(); //ReadyMsg function of Output class is called to display "pump is ready message" to the user.
}
}
