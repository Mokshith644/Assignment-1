package assignment;
import java.util.*;

public class question18 {
	public static int pow(int a,int b) {
		if(b==0)return 1;
		return a*pow(a,b-1);
	}
	public static int pow1(int a, int b) {
		int res=1;
		if(b==0)return 1;
		for(int i=1;i<=b;i++) {
			res*=a;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int p;
		System.out.println("Enter the base value:");
		n=sc.nextInt();
		System.out.println("Enter the exponent value: ");
		p=sc.nextInt();
		System.out.println(n+" to the power "+p+" is: "+pow1(n,p));

	}

}
