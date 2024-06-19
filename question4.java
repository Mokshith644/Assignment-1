package assignment;
import java.util.*;

public class question4 {
	public static int greater(int a, int b) {
		return a>=b?a:b;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=sc.nextInt();
		System.out.println("Enter second number: ");
		int b=sc.nextInt();
		System.out.println("Greater of given two numbers is: "+greater(a,b));
		sc.close();

	}

}
