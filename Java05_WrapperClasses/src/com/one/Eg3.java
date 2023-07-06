package com.one;

public class Eg3 {

	public static void main(String[] args) {
		//string type to object type
		
		String s1= "NameOne";
		System.out.println(s1);
		
		
		//valueOf()
		String valueOf = s1.valueOf(s1);
		System.out.println(valueOf);
		
		//cons
		String s2= new String(s1);
		System.out.println(s2);
		
		
		//object type to string type
		String s11= new String("10");
		System.out.println(s11);
		
		//toString
		String string=s11.toString();
		System.out.println(string);
		
		//+operator
		s11.toString();
		System.out.println(s1 + " "+ string);
	}

}
