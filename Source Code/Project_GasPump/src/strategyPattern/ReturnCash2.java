//ReturnCash2 Function for GasPump2
package strategyPattern;

public class ReturnCash2 extends ReturnCash
//implementation of ReturnCash Function for GasPump2
{
	public void returncash() {
		
	float cash=ds.getcash();//getting value of 'cash'
	float total = ds.gettotal();//getting value of 'total'
	float val;
	val=cash - total; //calculating remaining cash amount
	System.out.println("Remaining Cash amount is - "+val);
		
	}

	
}
