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
		Arrays.sort(a);
		int x=s.nextInt();
		int k=n-1;
		int i=0;
		while(i<k)
		{
		    if(a[i]+a[k]==x)
		    {
		        System.out.println("yes");
		        return;
		    }
		    else if(a[i]+a[k]>x)
		    k--;
		    else
		    i++;
		}
	}
}