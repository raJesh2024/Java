package com.two;

public  abstract class Client {
	static {
		System.out.println("Static block");
	}
	{
		System.out.println("Instance Block");
	}

	public static void main(String[] args) {
		//Client obj= new Client();
		//cannot instaniate the type of client
		

	}

}
