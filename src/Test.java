import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
			
	
				 
					System.out.println("enter the value to reverse");
					Scanner obj =new Scanner (System.in);
					String obj2=obj.nextLine();
					String value= "";
					for(int x=obj2.length()-1;x>=0;x--)
					{
						value=value+obj2.charAt(x);
						
					}
					System.out.println("output");
					System.out.println(value);
				}
					
	}


