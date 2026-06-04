import java.util.*;
public class hello{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i;
		System.out.println("enter a num: ");
		n=sc.nextInt();
		int a[]=new int[100];
		System.out.println("enter elements to store: ");
		
		for(i=0;i<=n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]>=60)
			{
				System.out.println("nubers are greater than 60");
			
			}
		}
		for (i=0;i<=20;i++) {
			if(a[i]>=60) {
				a[3]=999;
			System.out.println(a[i]);
			}
		}
			
	}
}
