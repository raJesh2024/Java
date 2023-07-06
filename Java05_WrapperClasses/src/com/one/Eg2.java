package com.one;

public class Eg2 {

	public static void main(String[] args) {
		// object type to primitive type
		
		//parameterized cons
		Integer i = new Integer(10);
		System.out.println("object type:"+i);
		int intvalue = i.intValue();
		System.out.println("primitive value:"+intvalue);
		
		//Auto un-boxing
		
		Integer ii= new Integer(20);
		System.out.println("object type :"+ii);
		Integer iii=i;
		System.out.println("primitive value:"+iii);
		

	}

}
