package assignment;
import java.util.*;

public class question2 {
	public static void check1(int n) {
		if(n%2==0)System.out.println("Even number");
		else System.out.println("Odd number");
	}
	public static void check2(int n) {
		if((n&1)==1)System.out.println("Odd number");
		else System.out.println("Even number");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		check2(n);

	}

}
