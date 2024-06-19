package assignment;
import java.util.*;

public class question24 {
	public static int sum(int n) {
		int res=0;
		for(int i=1;i<n;i++) {
			if(n%i==0)res+=i;
		}
		return res;
	}
	public static boolean isAbundant(int n) {
		int sum=sum(n);
		return sum>n;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		if(isAbundant(n))System.out.println(n+" is a abundant number");
		else System.out.println(n+" is not a abundant number");

	}

}