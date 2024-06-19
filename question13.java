package assignment;
import java.util.*;

public class question13 {
	public static int pow(int n, int m) {
		if(m==1)return n;
		return n*pow(n,m-1);
	}
	public static int count(int n) {
		int res=0;
		while(n>0) {
			res++;
			n/=10;
		}
		return res;
	}
	public static boolean isArmstrong(int n) {
		int count=count(n);
		int res=0;
		int temp=n;
		while(temp>0) {
			res+=pow((temp%10),count);
			temp/=10;
		}
		return res==n;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		if(isArmstrong(n))System.out.println(n+" is an Armstrong number");
		else System.out.println(n+" is not an armstrong number");
		
	}

}
