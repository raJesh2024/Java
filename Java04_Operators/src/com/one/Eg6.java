package com.one;
//Logical operator
//&&  both conditions must satisfy
//|| any one condition must satisfy
public class Eg6 {

	public static void main(String[] args) {
		System.out.println(true && true);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(false && false);
		
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
		     //Bitwise Exclusive
				System.out.println(true ^ true);
				System.out.println(false ^ true);
				System.out.println(true ^ false);
				System.out.println(false ^ false);
				
				//Bitwise AND
				System.out.println(true & true);
				System.out.println(false & true);
				System.out.println(true & false);
				System.out.println(false & false);
				
				//Bitwise OR
				System.out.println(true | true);
				System.out.println(false | true);
				System.out.println(true | false);
				System.out.println(false | false);

	}

}
