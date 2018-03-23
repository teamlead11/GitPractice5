import java.util.Scanner;

public class Test {
	private void apurupa() {
		// TODO Auto-generated method stub
		System.out.println("enter string to reverse");
		Scanner s=new Scanner (System.in);
		String s1=s.nextLine();
		String reverse= "";
		for(int i=s1.length()-1;i>=0;i--)
		{
			reverse=reverse+s1.charAt(i);
			
		}
		System.out.println("the reverse string is");
		System.out.println(reverse);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t=new Test();
t.apurupa();
	}
}
