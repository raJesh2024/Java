package com.one;

public class Eg6 {
	//instance method
	public void m1(int a,int b) {
		System.out.println(a +" and" +b);
	}
	//static method
	public static void m2(int x,int y) {
		System.out.println(x +" and" + y);
	}

	public static void main(String[] args) {
		//local method
		Eg6 obj = new Eg6();
		obj.m1(10, 20);
		obj.m1(20, 30);
		
		m2(100,200);
		m2(200,300);

	}

}
