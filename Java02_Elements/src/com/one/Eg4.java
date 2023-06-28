package com.one;

public class Eg4 {
	
	//instance variable/ static variable
	
	String username="rajesh";
	String contact="987654321";
	static String address="Hyd";

	public static void main(String[] args) {
		System.out.println("local method :"+ new Eg4().username);
		System.out.println("local method:"+ new Eg4().contact);
		System.out.println("local method:" +address);
		
		System.out.println("------------------------");
		new Eg4().userDetails();
		System.out.println("----------------------------");
		new Eg4().userDetail();
		

	}


//instance method
  public void userDetails() {
	  System.out.println("instance method :"+ username);
	  System.out.println("instance method :" +contact);
	  System.out.println("static method:" +address);
  }
  
  //static method
  public static void userDetail() {
	  System.out.println("static methos :"+new Eg4().username);
	  System.out.println("static method: "+ new Eg4().contact);
	  System.out.println("static methos :"+address);
  }
  }

