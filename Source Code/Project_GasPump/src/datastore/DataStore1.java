//DataStore for GasPump 1.
package datastore;

public class DataStore1 extends DataStore{
	static float gp1_a,gp1_b,gp1_total,gp1_price;
	static float regPrice,supPrice;
	static int gp1_G;

	//following are the functions which are used to set and accept values for variables used in GasPump 1.
	public float getRegPrice() //to get regular gas price value.
	{
		return regPrice;
	}
	public void setRegPrice(float rp) //to set the value of regular gas price.
	{
		regPrice = rp;
	}

	public float getSupPrice() //to get super gas price value.
	{
		return supPrice;
	}
	public void setSupPrice(float sp) //to set the value of super gas price.
	{
		supPrice = sp;
	}
	
	public float geta()  //returns value of 'a'.
	{
		return gp1_a;
	}
	public void seta(float a) //to accept value of 'a' from the user.
	{
		gp1_a=a;	
	}
	public float getb()  //returns value of 'b'.
	{
		return gp1_b;
	}
	public void setb(float b) //to accept value of 'b' from the user.
	{
		gp1_b=b;
	}
	public float getprice() //returns value of 'price'.
	{
		return gp1_price;
	}
	public void setprice(float a) //to set value of variable 'price'.
	{
		gp1_price=a;
	}
	public float gettotal() //to return value of 'total' variable.
	{
		return gp1_total;
	}
	public void settotal(float total)  //to set value of 'total' variable.
	{
		gp1_total=total;
	}
	
	public int getG() //to return value of 'G' variable.
	{
		return gp1_G;
	}

	public void setG(int g) //to set value of 'G' variable.
	{
		gp1_G = g;
	}

	
	
}
