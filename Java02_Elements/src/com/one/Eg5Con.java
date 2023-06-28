package com.one;

public class Eg5Con {
	public void customerDetails(int cId,String CustomerName,String CustomerMail,long Customermobile,String CustomerAddress ) {
		System.out.println("Customer Id :"+cId);
		System.out.println("Customer Name:"+CustomerName);
		System.out.println("Customer Mail: " + CustomerMail);
		System.out.println("Customer Contact: " + Customermobile);
		System.out.println("Customer Address: " + CustomerAddress);
	}
	public static void bankDetails(String BankName,String BankAddress) {
		System.out.println("Bank Name:" +BankName);
		System.out.println("BankAddress" +BankAddress);
	}

	public static void main(String[] args) {
		Eg5Con customer1 = new Eg5Con();
		customer1.customerDetails(1, "Rajesh", "raj@gmail.com", 987654321l, "Hyd");
		bankDetails("Sbi","Hyd");
		
		Eg5Con customer2 = new Eg5Con();
		customer2.customerDetails(2, "Rakesh", "raj@gmail.com", 987654321l, "Hyd");
		bankDetails("axis","Hyd");
		
		
		Eg5Con customer3 = new Eg5Con();
		customer3.customerDetails(3, "Rajesh", "raj@gmail.com", 987654321l, "Hyd");
		bankDetails("icic","Hyd");
		
		
		
	

	}

}
