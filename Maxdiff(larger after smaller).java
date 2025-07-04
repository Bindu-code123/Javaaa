import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n-1;i++)
		{
		    if(a[i]<a[i+1])
		    {
		        if(a[i]<min)
		        min=a[i];
		        if(a[i+1]>max)
		        max=a[i+1];
		    }
		}
		if((max-min-1)>0)
		System.out.println(max-min);
		else
		System.out.println("-1");
	}
}