package abc;
import java.util.Scanner;
public class MyScanner {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student roll Number:");
		 short Roll = sc.nextShort();
		 System.out.println("enter student  Name:");
		 String Name = sc.next();
		 System.out.println("enter student Class Name:");
		 String ClassName = sc.next();
		 System.out.println("enter student marks:");
		 float marks = sc.nextFloat();
		 System.out.println("enter student roll Number:" +Roll);
		 System.out.println("enter student 12 Name:"+Name);
		 System.out.println("enter student Class Name:" +ClassName);
		 System.out.println("enter student marks:" +marks);
		 sc.close();
		 	}
	}
