import java.util.*;
public class array2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string : ");
		String a=sc.nextLine();
		StringBuffer b = new StringBuffer(a);
		b.reverse();
		String data = b.toString();
		if(a.equals(data))
		 {
	         System.out.println("Given String is palindrome");
	     }else
	     {
	         System.out.println("Given String is not palindrome");
	     }	
		 
		}
}
