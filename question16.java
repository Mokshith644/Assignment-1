package assignment;
import java.util.*;
public class question16 {
	public static void nthtermfib(int n) {
		int i=0;
		int j=1;
		int temp=0;
		for(int k=2;k<n;k++) {
			temp=i+j;
			i=j;
			j=temp;	
		}
		System.out.println(n+"th term of the fibonacci series is "+temp);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		nthtermfib(n);
		

	}

}
