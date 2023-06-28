package com.one;
//Unary Operator
//++,--

public class Eg3 {
	public void test() {
		int a=10;
		int b=20;
		System.out.println(a++);//10
		System.out.println(b++);//20
		System.out.println(a);//11
		System.out.println(b);//21
		System.out.println(++a);//12
		System.out.println(++b);//22
		
	}

public static void main(String [] args) {
	Eg3 obj = new Eg3();
	obj.test();
}
}