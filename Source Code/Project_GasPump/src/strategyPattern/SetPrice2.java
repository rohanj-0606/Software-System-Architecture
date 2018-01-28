//SetPrice2 function for GasPump2
package strategyPattern;

public class SetPrice2 extends SetPrice {
	public void setPrice(int g) {
		//implementation of SetPrice Function for GasPump2
float reg=ds.getRegPrice(); //getting Regular gas price
float sup=ds.getSupPrice();////getting Super gas price
float prem=ds.getPremPrice();//getting Premium gas price
if(g==1)
{
	System.out.println("Super gas has been selected");
	ds.setprice(sup); //setting value of price to the value of super gas.
	System.out.println("Please proceed toward pumping gas");
	
}
else if(g==2)
{
	System.out.println("Regular gas has been selected");
	ds.setprice(reg); //setting value of price to the value of regular gas.
	System.out.println("Please proceed toward pumping gas");
}
else if(g==3)
{
	System.out.println("Premium gas has been selected");
	ds.setprice(prem); //setting value of price to the value of premium gas.
	System.out.println("Please proceed toward pumping gas");
	
}
		
	}

}
