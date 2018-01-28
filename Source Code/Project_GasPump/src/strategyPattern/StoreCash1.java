//StoreCash1 Function for GasPump2
package strategyPattern;
public class StoreCash1 extends StoreCash {

	public void storecash() {
		float c;
		c=ds.getcash(); //getting value of 'cash'
		ds.setcash(c);//setting value of 'cash'
		System.out.println("Cash accepted::$"+c);
	}

}
