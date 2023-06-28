package javaProgrammes;
import java.util.*;
public class Factorial {
	public void test(int number) {
		int fact=1;
		for(int i =1;i<=number;i++) {
			fact =fact*i;
		}
		System.out.println("the value is :" +fact);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("the value is :");
		int number=sc.nextInt();
		
		Factorial obj =new Factorial();
		obj.test(number);
		

	}

}
