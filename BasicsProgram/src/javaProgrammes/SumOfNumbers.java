package javaProgrammes;
import java.util.*;
public class SumOfNumbers {
	public void add(int number) {
		int sum =0;
		for(int i=0;i<=number;i++) {
			sum=sum+i;
		}
			System.out.println("the value is :" +sum);
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("the value is :");
		int number =sc.nextInt();
		
		SumOfNumbers obj = new SumOfNumbers();
		obj.add(number);
		

	}

}
