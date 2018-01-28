//DataStore main class
package datastore;

public class DataStore {
	
	//It contains all the functions which are used to accept and set values for variables for Gaspump 1 and Gaspump 2
	
	//Variable Declaration which are used in the Getter and Setter
	float regPrice,supPrice,premPrice;
	float a,b,c;
	float price,cash,total;
	float L;
	int G;
	//Getter Setters used for Gaspump1 and Gaspump2
	
	public float getRegPrice() {
		return regPrice;
	}
	public void setRegPrice(float regPrice) {
		this.regPrice = regPrice;
	}
	public float getSupPrice() {
		return supPrice;
	}
	public void setSupPrice(float supPrice) {
		this.supPrice = supPrice;
	}
	public float getPremPrice() {
		return premPrice;
	}
	public void setPremPrice(float premPrice) {
		this.premPrice = premPrice;
	}
	public float geta() {
		return a;
	}
	public void seta(float a) {
		this.a = a;
	}
	public float getb() {
		return b;
	}
	public void setb(float b) {
		this.b = b;
	}
	public float getc() {
		return c;
	}
	public void setc(float c) {
		this.c = c;
	}
	public float getprice() {
		return price;
	}
	public void setprice(float price) {
		this.price = price;
	}
	public float getcash() {
		return cash;
	}
	public void setcash(float cash) {
		this.cash = cash;
	}
	public float gettotal() {
		return total;
	}
	public void settotal(float total) {
		this.total = total;
	}
	public float getL() {
		return L;
	}
	public void setL(float L) {
		this.L = L;
	}
	public int getG() {
		return G;
	}
	public void setG(int g) {
		G = g;
	}	
	
}
