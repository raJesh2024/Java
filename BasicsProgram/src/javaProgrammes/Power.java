package javaProgrammes;
import java.util.*;
public class Power {
	public void test(int base,int exponent) {
		long result=1;
		for(int i=1;i<=exponent;i++) {
			result =result *base;
		}
		System.out.println("the value is :" +result);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("the value is:");
		int base = sc.nextInt();
		System.out.println("the value is :");
		int exponent=sc.nextInt();
		
		Power obj = new Power();
		obj.test(base, exponent);
		

	}

}
