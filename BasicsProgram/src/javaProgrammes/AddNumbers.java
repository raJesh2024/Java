package javaProgrammes;
import java.util.*;
public class AddNumbers {
	public void add(int num1 , int num2) {
	   int sum =num1+num2;
		  System.out.println("the value is :"+sum);
	  }
		

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("the value is" );
		int num1 =sc.nextInt();
		System.out.println("yhe second value is :");
		int num2=sc.nextInt();
		
		AddNumbers obj =new AddNumbers();
		obj.add(num1,num2);
		
		
		
		

	}

}
