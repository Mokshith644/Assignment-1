package assignment;
import java.util.*;

public class question3 {
	
	public static int SumofNatural1(int n) {
		int res=0;
		for(int i=1;i<=n;i++) {
			res+=i;
		}
		return res;
	}
	public static int SumofNatural2(int n) {
		return (n*(n+1))/2;
	}
	public static int SumofNatural3(int n) {
		if(n==0)return n;
		return n+SumofNatural3(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int res=SumofNatural2(n);
		System.out.println("The sum of first "+n+" natural number is: "+res);
		

	}

}
