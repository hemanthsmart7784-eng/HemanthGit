import java.util.*;

public class array {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      Integer a[]= {90,60,20,100,30};
      int sum=0;
      for (int i=0;i<a.length;i++)
      {
    	  //for sum of an array
    	  sum=sum+a[i];
      }
      // printing the sum
      System.out.println("the sum of an array is: "+sum);
      //to find out the max value
      int b = Collections.max(Arrays.asList(a));
      System.out.println("The greatest number in an array is: "+b);
      // to sort the given array
      Arrays.sort(a);
      System.out.println("sorted array is :"+ Arrays.toString(a));
      System.out.println("the sorting order is ");
      for (int i=0;i<a.length;i++) 
      {
    	System.out.print(a[i]+"\t");
      }
      
	}

}
