package com.one;
//Operators
//Arithmetic operator
// + ,- , * , / ,%.....
public class Eg1 {
	public void test() {
	int a=10;
	int b=20;
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	}
	public static void put() {
		int x=2;
		int y=4;
		System.out.println(x/y);
		System.out.println(x%y);
		
		
	}
	
	public static void main(String[] args) {
		Eg1 obj = new Eg1();
		obj.test();
		put();
		

	}

}
