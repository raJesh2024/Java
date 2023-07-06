package com.three;

//Hierarchical
class GrandParent {
	public void m1() {
		System.out.println("m1 method");
	}
	}
class Parent extends GrandParent{
	public void m2() {
		System.out.println("m2 method");
	}
	}
public class Child extends GrandParent{
	public void m3() {
		System.out.println("m3 method");
	}
	

	public static void main(String[] args) {
		
		Parent parent = new Parent();
		parent.m1();
		parent.m2();
		
		Child obj = new Child();
		obj.m1();
		obj.m3();
		
		
	}

}
