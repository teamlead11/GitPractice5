import java.util.Iterator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Enter the value for Reverse a String");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String reverse=" ";
		for (int i = s.length()-1;i>=0; i--) {
			 reverse = reverse+s.charAt(i);

		}
		System.out.println("The Reversed String is :");
		System.out.println(reverse);
	}
}