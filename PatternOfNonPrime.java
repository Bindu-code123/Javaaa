import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n*(n+1)/2];
		int c=2;
		a[0]=1;
		for(int i=1;i<a.length;)
		{
		    if(isPrime(c)==true)
		    {
		        a[i]=c;
		        i++;
		    }
		    c++;
		}
		System.out.println(Arrays.toString(a));
		int p=0;
		for(int i=1;i<=n;i++)
		{
		    int q=i*(i+1)/2-1;
		    int k=q;
		    for(int j=1;j<=i;j++)
		    {
		        if(i%2==1)
		        {
		            System.out.print(a[p]+" ");
		            p++;
		        }
		        if(i%2==0)
		        {
		            System.out.print(a[q]+" ");
		            q--;
		            p=k+1;
		        }
		    }
		    System.out.println();
		}
		
	}
	public static boolean isPrime(int n)
	{
	    int i;
	    for(i=2;i<=Math.sqrt(n);i++)
	    {
	        if(n%i==0)
	        return true;
	    }
	    return false;
	}
}