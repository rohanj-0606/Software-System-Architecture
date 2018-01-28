//Total Function for Gaspump2
package strategyPattern;

public class Total2 extends Total {
	public void total() {
float l = ds.getL();//getting value of 'L'
l=l+1;
ds.setL(l); //setting new value of  'L'
float price=ds.getprice();//getting value of 'price
float total=ds.gettotal(); //getting value of 'total'
total=price*l; //calculating new value of 'total'
ds.settotal(total); //setting new value of 'total'

System.out.println("Total amount of gas pumped in litres is: "+l);

	}

}
