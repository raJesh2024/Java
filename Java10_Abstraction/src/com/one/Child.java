package com.one;

public class Child extends Parent {

	

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1();
		obj.m2();
		
		
		Parent Parent = new Child();
		Parent.m1();
		Parent.m2();
	}


}
