package com.five;

abstract class Parent{
	public Parent() {
		System.out.println("default cons");
	}
}
class Child extends Parent{
	public Child() {
		System.out.println("child cons");
	}
	
}
public class Client {

	public static void main(String[] args) {
		new Child();

	}

}
