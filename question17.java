package assignment;
import java.util.*;

public class question17 {
	public static int fact(int n) {
		if(n==0)return 1;
		return n*fact(n-1);
	}
	public static int fact1(int n) {
		int res=1;
		for(int i=1;i<=n;i++) {
			res*=i;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		System.out.println("Factorial of "+n+" is "+fact1(n));

	}

}
