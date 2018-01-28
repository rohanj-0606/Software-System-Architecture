//total function for GasPump1
package strategyPattern;

//import output.Output;

public class Total1 extends Total {
	public void total() {
int g = ds.getG();//getting value of 'G'
g++;
float total;//getting value of 'Total'
float price=ds.getprice();  //getting value of 'price'
total=price*g; //calculating new value of 'total'

ds.setG(g); //setting new value of 'G'
ds.settotal(total); //setting new value of 'Total'
System.out.println("Total amount of gas pumped in gallons is: "+g);

	}

}
