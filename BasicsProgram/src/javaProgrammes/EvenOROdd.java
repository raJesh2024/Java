package javaProgrammes;
import java.util.*;
public class EvenOROdd {
	public void add(int number) {
		if(number %2==0) {
		System.out.println("its a even");
		}else{
			System.out.println("its a odd");
	
	}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("the value is:");
		int number=sc.nextInt();
		
		
		EvenOROdd obj = new EvenOROdd();
		obj.add(number);

	}

}
