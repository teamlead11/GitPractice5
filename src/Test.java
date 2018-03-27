import java.util.Scanner;

public class Test {
	public void balanew() {
		// TODO Auto-generated method stub
		 String input = "Geeks For Geeks";
	        char[] temparray = input.toCharArray();
	        int left, right=0;
	        right = temparray.length-1;
	 
	        for (left=0; left < right ; left++ ,right--)
	        {
	            // Swap values of left and right
	            char temp = temparray[left];
	            temparray[left] = temparray[right];
	            temparray[right]=temp;
	        }
	 
	        for (char c : temparray)
	            System.out.print(c);
	        System.out.println();
	    
	
	}
 public static void main(String[] args) {

		// TODO Auto-generated method stub

	Test t=new Test();
	t.vijayReverse();
	t.premReverse();
	t.balanew();
	System.out.println("test case");

	}

	public void premReverse() {
		String s = "Hello";
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println("the reverse string is");
		System.out.println(reverse);
	}

	public void vijayReverse() {
			
		String original, reverse = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		original = s.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
		reverse = reverse + original.charAt(i);
		System.out.println("Reverse of entered string is: " + reverse);
	
	}
}
