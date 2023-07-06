package com.three;

public class Client  extends Eg3{
	public void m4() {
		System.out.println("m4 method");
	}
	public static void main(String[] args) {
		new Client().m3();
		Client obj = new Client();
		obj.m4();
	}

}
