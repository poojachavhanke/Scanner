package abc;
import java.util.Scanner;

public class Sub {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter math marks is");
		int marks = sc.nextInt();
		System.out.println("enter science marks is");
		int marks2 = sc.nextInt();
		System.out.println("enter history marks is");
		int marks3 = sc.nextInt();
		int a = marks + marks2 + marks3;
		System.out.println("Total marks is :" +a );
		int avg = (marks+marks2+marks3) /3;
		System.out.println(" total average is :" +avg);
	}			

}

