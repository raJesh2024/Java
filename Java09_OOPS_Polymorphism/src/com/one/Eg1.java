package com.one;
//polyforms
//Method Overloading(one class,method must be same,args can be different
public class Eg1 {
	public void gasStation(int pPrice,int dPrice) {
		System.out.println("petrol pricw 1:" +pPrice);
		System.out.println("Diesel Price 1: "+dPrice);
	}
	public void gasStation(float pPrice,float dPrice) {
		System.out.println("petrol Price 2 :"+pPrice);
		System.out.println("diesel price 2 :"+dPrice);
	}

	public static void main(String[] args) {
	
		Eg1 obj = new Eg1();
		obj.gasStation(100, 110);
		obj.gasStation(100.5f, 110.0f);
	}

}
