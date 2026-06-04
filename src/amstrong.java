import java.util.Scanner;

public class amstrong {

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
	    	   sum=sum+(r*r*r);
	    	   n=n/10;
	       }
	       if(temp==sum)
	    	   System.out.println(temp+" is amstrong number");
	       else
	    	   System.out.println(temp+" is not a amstrong number");
	       
	}

}
