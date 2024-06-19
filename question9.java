package assignment;
import java.util.*;


public class question9 {
	public static void printPrime(int s, int e) {
		for(int i=s;i<=e;i++) {
			boolean flag=false;
			for(int j=2;j*j<=i;j++) {
				if(i%j==0) {
					flag=true;
					break;
				}
			}
			if(!flag)System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s,e;
		System.out.println("Enter the starting number: ");
		s=sc.nextInt();
		System.out.println("Enter the ending number: ");
		e=sc.nextInt();
		System.out.println("Prime numbers in the given range: ");
		printPrime(s,e);

	}

}
