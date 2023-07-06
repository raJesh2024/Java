package com.three;

public class Parent {
	
	//static variable
	static int i=10;
	static int j=20;
	//non static varaible
	int a=100;
	int b=200;

	public static void main(String[] args) {
		// local variable
		int x=1;
		int y=2;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(i);
		System.out.println(j);
		
		System.out.println(new Parent().a);
		System.out.println(new Parent().b);

	}

}
