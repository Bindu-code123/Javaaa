import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[][]=new int[n][n];
		int c=1;
		int t=0;
		int r=3;
		for(int i=0;i<n;i++)
		{
		    if(i%2==0)
		    {
		        while(t<4)
		        {
		            a[i][t]=c;
		            c++;
		            t++;
		        }
		        t=0;
		    }
		    else
		    {
		        while(r>=0)
		        {
		            a[i][r]=c;
		            c++;
		            r--;
		        }
		        r=3;
		    }
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(a[i][j]+" ");
		        if(a[i][j]<10)
		        System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}
