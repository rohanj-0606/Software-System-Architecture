//Receipt and NoReceipt function is called in S6 class
package states;
import output.Output;
public class S6 extends State {

public void Receipt()
{
	Output.PrintReceipt(); //Receipt function of Output class is called to print the receipt
}
public void NoReceipt(){
	Output.ReturnCash(); //NoReceipt function of Output class is called to return cash of user if left.
	
}
}
