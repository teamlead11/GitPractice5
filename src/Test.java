
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
	t.balanew();
	}
}
