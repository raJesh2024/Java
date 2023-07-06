package com.two;
// method overriding
//multiple class,mentods must be same,same args

class RBI{
	public int getRate() {
		return 0;
	}

}
class Sbi extends RBI{
	public int getRate() {
		return 1;
	}
}

class Axis extends RBI{
	public int getRate() {
		return 2;
	}
}
public class Eg1 {
	

	public static void main(String[] args) {
		Sbi obj = new Sbi();
		System.out.println(obj.getRate());
		
		Axis obj1= new Axis();
		System.out.println(obj1.getRate());

	}

}
