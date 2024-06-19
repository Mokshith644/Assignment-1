package assignment;
import java.util.*;

public class question14 {
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
	public static void ArmstrongRange(int s, int e) {
		for(int i=s;i<=e;i++) {
			if(isArmstrong(i))System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s,e;
		System.out.println("Enter the starting number: ");
		s=sc.nextInt();
		System.out.println("Enter the ending number: ");
		e=sc.nextInt();
		ArmstrongRange(s,e);

	}

}
