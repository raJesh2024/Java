package com.one;
// methods: Instance method and Static method

//Instance Method(multiple ways)
public class Eg1 {
	public void add() {
		System.out.println("adding");
	}
	public void update() {
		System.out.println("updateing");
	}

	public static void main(String[] args) {
		
		Eg1 obj = new Eg1();
		obj.add();
		obj.update();
		
		Eg1 obj1=new Eg1();
		obj1.add();
		obj1.update();
		
		
		new Eg1().add();
		new Eg1().update();
		
		

	}

}
