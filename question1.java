//1.	Check if a Number is Positive or Negative in Java
package assignment;
import java.util.*;

public class question1 {
	public static boolean checkpos(int n) {
		if(n>=0)return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		if(checkpos(n))System.out.println("Positive Number");
		else System.out.println("Negative number");

	}

}
