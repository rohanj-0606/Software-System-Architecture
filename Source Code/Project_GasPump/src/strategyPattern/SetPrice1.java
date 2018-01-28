//SetPrice1 function for GasPump1
package strategyPattern;

public class SetPrice1 extends SetPrice {
	public void setPrice(int g) 
	//implementation of SetPrice Function for GasPump1
	{
float reg=ds.getRegPrice();//getting value of Regular gas price
float sup=ds.getSupPrice();//getting value of Super gas price
if(g==1)
{
	System.out.println("Reglar gas has been selected");
	ds.setprice(reg); //setting value of price to the value of regular gas.
	System.out.println("Please proceed toward pumping gas");
}
else if(g==2)
{
	System.out.println("Super gas has been selected");
	ds.setprice(sup);//setting value of price to the value of super gas.
	System.out.println("Please proceed toward pumping gas");
}
		
	}

}
