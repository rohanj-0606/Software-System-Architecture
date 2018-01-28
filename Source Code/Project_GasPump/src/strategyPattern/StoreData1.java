//StoreData1 function for GasPump1
package strategyPattern;
public class StoreData1 extends StoreData{
	public void storeData(){
		float a,b;
		a=ds.geta();//getting value of 'a'
		b=ds.getb();//getting value of 'b'
		ds.setRegPrice(a); //setting value of 'RegularPrice'
		ds.setSupPrice(b); ///setting value of 'SuperPrice'
	}
}
