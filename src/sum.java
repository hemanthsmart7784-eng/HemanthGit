import java.util.*;
public class sum {

	public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("enter a number: ");
       int n =sc.nextInt();
       int r,sum=0;
       if(n<0) {
    	   System.out.println("enter positive number");
       }
       
       while(n>0)
       {
    	   r=n%10;
    	   sum=sum+r;
    	   n=n/10;
       }
       System.out.println("the sum is :"+ sum);
       }
	}


