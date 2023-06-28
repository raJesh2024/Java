package com.one;
//02) Assignment Operators
// +=;-=;*=;/=;%=.....
public class Eg2 {
	public void test() {
		int a=10;
		int b=20;
		System.out.println(a+=1);//10+1
		System.out.println(b+=a);//11+20
		System.out.println(a);//31
		System.out.println(a*=b);
	}

	public static void main(String[] args) {
		Eg2 obj = new Eg2();
		obj.test();

	}

}
