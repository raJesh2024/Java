package com.one;

public class Eg1 {

	public static void main(String[] args) {
		
		// Primitive to object
		int i=10;
		System.out.println("primitive type :" +i);
		
		//parameterized cons
		
		Integer integer = new Integer(i);
		System.out.println("object type :" + integer);
		
		//valueOf()

		Integer valueOf= Integer.valueOf(i);
		System.out.println("Object type :"+ valueOf);
		
		
		//auto boxing 
		Integer ii=i;
		System.out.println("Object type: "+ii);

	}

}
