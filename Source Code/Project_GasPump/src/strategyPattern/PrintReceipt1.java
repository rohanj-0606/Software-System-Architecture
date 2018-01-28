//PrintReceipt1 function for GasPump 1
package strategyPattern;

public class PrintReceipt1 extends PrintReceipt{
	public void printreceipt() 
	//implementation of PrintMsg for GasPump1.
	{
		float val=ds.gettotal(); //accepting value of total variable
	System.out.println("You have to pay total amount: $" +val);
		
	}

}
