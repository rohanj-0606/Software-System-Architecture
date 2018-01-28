//PrintReceipt2 function for GasPump2.
package strategyPattern;
import output.Output;
public class PrintReceipt2 extends PrintReceipt
{
	public void printreceipt() 
	//implementation of PrintMsg for GasPump2.
	{
		float val1=ds.getL();//getting value of 'L'
		float val2=ds.gettotal();//getting value of 'total'
		System.out.println("Total Amount of gas pumped is" +val1);
	System.out.println("You have to pay total amount is " +val2);
		Output.ReturnCash();// calling ReturnCash Function.
	}

}
