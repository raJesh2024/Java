package com.two;
//multilevel inheritance
class GrandParent {
	public void m1() {
		System.out.println("m1 method");
	}
}
	class Parent extends GrandParent {
		public void m2() {
			System.out.println("m2 method");
		}
	}
		class child extends Parent{
			public void m3() {
				System.out.println("m3 method");
		}
	}
	public class Client{

	public static void main(String[] args) {
		child obj = new child();
		obj.m1();
		obj.m2();
		obj.m3();
		

	}

}
