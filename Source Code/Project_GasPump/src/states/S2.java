//Approved and Reject function is used in this S2 Class
package states;
import output.Output;
public class S2 extends State
{
	
public void Approved()
{
	Output.DisplayMenu();  //DisplayMenu of Output class is called to Display Menu.
}
public void Reject()
{
	Output.RejectMsg(); //RejectMsg of Output class is called to reject the payment method.
}
}
