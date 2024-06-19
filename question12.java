package assignment;
import java.util.*;

public class question12 {
	public static int reverse2(int n,int res) {
		if(n==0)return res;
		res=res*10+n%10;
		return reverse2(n/10,res);
	}

	public static void main(String[] args) {
		int n,res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		res=reverse2(n,res);
		if(n==res)System.out.println(n+" is a palindrome");
		else System.out.println(n+" is not a palindrome");
		

	}

}
