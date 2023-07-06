package com.one;

public class Child  extends Parent{
	public void test() {
		System.out.println("child class");
	}

	public static void main(String[] args) {
	 
		Child obj = new Child();
		obj.m1();
		new Child().test();
		m2();

	}

}

