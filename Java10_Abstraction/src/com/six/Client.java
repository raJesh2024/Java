package com.six;


abstract class Parent{
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
	public abstract void m4();
}
abstract class Child extends Parent{

	@Override
	public void m1() {
		System.out.println("m1 method");
	}

	@Override
	public void m2() {
		System.out.println("m2 method");
		
	}
}
class Children extends Child{
	@Override
	public void m3() {
		System.out.println("m3 method");
		
	}

	@Override
	public void m4() {
		System.out.println("m4 method");
		
	}
	
}

public class Client {
	

	public static void main(String[] args) {
	Children obj = new Children();
	obj.m1();
	obj.m2();
	obj.m3();
	obj.m4();

	}
}

