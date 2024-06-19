package assignment;
import java.util.*;

public class question7 {
	public static boolean leap(int n) {
		if(n%4==0 && (n%100!=0 || n%400==0)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the year: ");
		n=sc.nextInt();
		if(leap(n))System.out.println(n+" is a leap year");
		else
			System.out.println(n+" is not a leap year");
	}

}
