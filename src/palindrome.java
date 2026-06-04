import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,n,temp,sum=0,r;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter n value :");
       n= sc.nextInt();
       temp=n;
       while(n>0)
       {
    	   r=n%10;
    	   sum=(sum*10)+r;
    	   n=n/10;
       }
       if(temp==sum)
    	   System.out.println(temp+" is palindrome");
       else
    	   System.out.println(temp+"is not a palindrome");
	}

}
