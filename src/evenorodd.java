import java.util.*;
public class evenorodd{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int a[]=new int[5];
		System.out.println("enter array elements: ");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("your elements are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		System.out.println("your sum is: "+sum);
	}
}