package assignment;
import java.util.*;

public class question5 {
	public static int SumofInterval(int s, int e) {
		int res=0;
		for(int i=s;i<=e;i++) {
			res+=i;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start,end;
		System.out.println("Enter the starting number: ");
		start=sc.nextInt();
		System.out.println("Enter the ending number: ");
		end=sc.nextInt();
		System.out.println("The sum of numbers between "+start+" and "+end+" is: "+SumofInterval(start,end));

	}

}
