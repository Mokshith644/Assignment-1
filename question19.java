package assignment;
import java.util.*;

public class question19 {
	public static void factors(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0)System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		factors(n);
		

	}

}
