import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int l=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		int m=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    int s1=0,s2=0;
		    for(int j=0;j<=i;j++)
		    {
		       s1=s1+a[j]; 
		    }
		    for(int j=i+1;j<n;j++)
		    {
		        s2=s2+a[j];
		    }
		    int s3=Math.max(s1,s2);
		    if(s3<l)
		    {
		        l=s3;
		    }
		}
		System.out.println(l);
	}
}