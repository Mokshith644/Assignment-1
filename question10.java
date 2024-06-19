package assignment;
import java.util.*;

public class question10 {
	public static int countdigits1(int n) {
		int res=0;
		while(n>0) {
			res+=n%10;
			n/=10;
		}
		return res;
	}
	public static int countdigits2(int n) {
		if(n==0)return n;
		return n%10+countdigits2(n/10);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		int res=countdigits2(n);
		System.out.println(res);

	}

}
