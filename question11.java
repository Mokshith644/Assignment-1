package assignment;
import java.util.*;

public class question11 {
	public static int reverse1(int n,int res) {
		while(n>0) {
			res=res*10+n%10;
			n/=10;
		}
		return res;
	}
	public static int reverse2(int n,int res) {
		if(n==0)return res;
		res=res*10+n%10;
		return reverse2(n/10,res);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,res=0;
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		System.out.println("Reverse of "+n+" is: "+reverse2(n,res));

	}

}
