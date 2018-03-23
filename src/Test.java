
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
}
