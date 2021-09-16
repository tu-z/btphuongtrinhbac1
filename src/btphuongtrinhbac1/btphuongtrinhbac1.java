package btphuongtrinhbac1;
import java.util.Scanner;


public class btphuongtrinhbac1 {
	private static Scanner input = new Scanner(System.in);
	 public static void main(String[] args) {
		 System.out.println("nhap a");
		 double a = input.nextDouble();
		 System.out.println("nhap b");
		 double b = input.nextDouble();
		 System.out.println(a+"x" + " + "+b+" = 0 => x = " +(-b/a) );
	 }
	
}
