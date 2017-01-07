package Decorator;

import java.io.ObjectInputStream.GetField;

public class Cake {
	private String cakeName;
	private double cakePrice;
	public  Cake(String cakeName,double cakePrice){
		this.cakeName = cakeName;
		this.cakePrice = cakePrice;
	}
	
	public String getCakeName() {
		return cakeName;
	}

	public double getCakePrice() {
		// TODO Auto-generated method stub
		return  cakePrice;
	}
	
}
