import java.util.*;
public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Integer a[]= {50,60,10,5,45};
     Arrays.sort(a,Collections.reverseOrder());
     System.out.println("the sorted array is");
     for(int i=0;i<a.length;i++)
     {
         System.out.print(a[i]+",");
     }

	}

}
