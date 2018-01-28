//DataStore for GasPump 2.
package datastore;

public class DataStore2 extends DataStore{
	static float gp2_a,gp2_b,gp2_c,gp2_total,gp2_L,gp2_cash,gp2_price;
	static float regPrice,supPrice,premPrice;
	
	
	//Following are the functions which are used to set and accept values for variables used in GasPump 2.
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
	public void setSupPrice(float sp)//to set the value of super gas price.
	{
		supPrice = sp;
	}

	public float getPremPrice()  //to get premium gas price value.
	{
		return premPrice;
	}
	public void setPremPrice(float premp)//to set the value of premium gas price.
	{
		premPrice = premp;
	}
	
	public float geta()  //returns value of 'a'.
	{
		return gp2_a;
	}
	public void seta(float a) //to accept value of 'a' from the user.
	{
		gp2_a=a;
	}
	public float getb() //returns value of 'b'.
	{
		return gp2_b;
	}
	public void setb(float b)  //to accept value of 'b' from the user.
	{
		gp2_b=b;
	}
	public float getc() //returns value of 'b'.
	{
		return gp2_c;
	}
	public void setc(float c) //to accept value of 'c' from the user.
	{
		gp2_c=c;
	}
	public float getprice() //returns value of 'price'.
	{
		return gp2_price;
	}
	public void setprice(float price) //to set value of variable 'price'.
	{
		gp2_price=price;
	}
	public float getcash() //to return value of 'cash'
	{
		return gp2_cash;
	}
	public void setcash(float cash) //to accept value of 'cash' from the user.
	{
		gp2_cash=cash;
	}
	public float getL() //to return value of 'L' variable.
	{
		return gp2_L;
	}
	public void setL(float L) //to set value of 'L' variable.
	{
		gp2_L=L;
	}
	public float gettotal()//to return value of 'total' variable.
	{
		return gp2_total;
	}
	public void settotal(float total)//to set value of 'total' variable.
	{
		gp2_total=total;
	}
	
}
