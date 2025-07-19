package pqr;
import java.util.Scanner;
public class cals {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number:");
		int n1 = sc.nextInt();
		System.out.println("Enter second number:");
		int n2 = sc.nextInt();
		int c = n1+n2;
		System.out.println("sum is: "+c);
		int d = n1-n2;
		System.out.println("sub is: "+d);
		int t = n1*n2;
		System.out.println("mul is: "+t);
		int g = n1/n2;
		System.out.println("div is: "+g);
	}

	}
