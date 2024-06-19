package assignment;
import java.util.*;

public class question15 {
	public static void fib(int n) {
		int i=0;
		int j=1;
		System.out.print(i+" "+j+" ");
		
		for(int k=2;k<n;k++) {
			int temp=i+j;
			System.out.print(temp+" ");
			i=j;
			j=temp;
			
		}
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		fib(n);

	}

}
