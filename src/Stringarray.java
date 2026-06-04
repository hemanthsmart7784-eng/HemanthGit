import java.util.*;
public class Stringarray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	int n=1;
      String a[] = new String[2];
     
      for (int i=0;i<a.length;i++)
      {
    	  System.out.println("enter string to store");
    	 a[i]=sc.nextLine();
    	
      }
      for (int i=0;i<a.length;i++)
      {
    	  System.out.println(a[i]); 
      }
      
      StringBuffer str = new StringBuffer(a[1]);
      str.reverse();
     String hem =str.toString();
       if(a.equals(hem))
       {
    	   System.out.println("palindeome");
       } 
       else {
     System.out.println("not palindrome");
       }
    	
    }
     
}

	
