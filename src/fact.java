import java.util.*;
public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		long fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
			
		{
		   fact=fact*i;
			
		}
		System.out.println("the factorial is :"+ fact);
	}

}
