package javaProgrammes;
import java.util.*;
public class SwapNumbers {
	public void test(int num1,int num2) {
		int
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("the value is :"+num1);
		System.out.println("the second value is :"+num2);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("the value is :");
		int num1=sc.nextInt();
		System.out.println("the second value is :");
		int num2=sc.nextInt();
		
		
		SwapNumbers obj = new SwapNumbers();
		obj.test(num1, num2);
	}

}
