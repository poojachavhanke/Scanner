package pqr;

import java.util.Scanner;
public class operator1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first integer");
		int n1 = sc.nextInt();
		System.out.println("enter second integer");
		int n2 = sc.nextInt();
		int a = n1+n2;
	    System.out.println("addition is: "+a);
	    int b = n1-n2;
	    System.out.println("sub is: "+b);
	    int c =n1*n2;
	    System.out.println("mul is: "+c);
	    int d =n1/n2;
	    System.out.println("div is: "+d);
	    int f =n1%n2;
	    System.out.println("modulo is: "+f);
		System.out.println("n1==n2 :"+(n1==n2));
		System.out.println("n1>n2 :"+(n1>n2));
		System.out.println("n1<n2 :"+(n1<n2));
		System.out.println("n1!=n2 :"+(n1!=n2));
		
	}

}
