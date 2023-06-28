package com.one;

//Static Method (Single copy)
public class Eg2 {
	public static void test() {
		System.out.println("testing");
	}
	public static void put() {
		System.out.println("deleting");
	}

	public static void main(String[] args) {
		put();
		test();
		
		Eg2.put();
		Eg2.test();



	}

}
