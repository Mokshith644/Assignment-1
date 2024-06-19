package assignment;
import java.util.*;

public class question6 {
	public static int greater(int a, int b, int c) {
		return (a>=b & a>=c) ? a:((b>=a && b>=c)?b:c);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter first number: ");
		a=sc.nextInt();
		System.out.println("Enter second number: ");
		b=sc.nextInt();
		System.out.println("Enter third number: ");
		c=sc.nextInt();
		System.out.println("Greater of "+a+", "+b+" and "+c+" is: "+greater(a,b,c));
	}

}
