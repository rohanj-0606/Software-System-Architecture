//PayCash function is called in S1 sate
package states;
import output.Output;
public class S1 extends State
{
	

	public void PayCash()
	{
		Output.StoreCash(); //StoreCash function of Output class is called to accept cash from user.
		Output.DisplayMenu(); //DisplayMenu function of Output class is called to display menu.
		
	}
	
	public void PayCredit()
	{
		System.out.println("Credit Card option has been selected !!");
	}

}
