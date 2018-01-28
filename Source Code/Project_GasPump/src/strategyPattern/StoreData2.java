//StoreData1 function for GasPump2
package strategyPattern;

public class StoreData2 extends StoreData{
	public void storeData(){
		float a,b,c;
		a=ds.geta();//getting value of 'a'
		b=ds.getb();//getting value of 'b'
		c=ds.getc();//getting value of 'c'
		ds.setRegPrice(b);//setting value of 'RegularPrice'
		ds.setSupPrice(a);//setting value of 'SuperPrice'
		ds.setPremPrice(c);//setting value of 'PremiuimPrice'
	}
}
