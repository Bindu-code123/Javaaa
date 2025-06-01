import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a[][]=new int[s.nextInt()][s.nextInt()];
		int p=0;
		int m=a.length;
		int n=a[0].length;
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        a[i][j]=s.nextInt();
		    }
		}
		for(int i=0;i<a.length;i++)
		{
		    for(int j=0;j<a[i].length;j++)
		    {
		        if(a[i][j]==1)
		        {
		            if(i+1<m-1 && a[i+1][j]==0)
		            p++;
		            if(i-1>=0 && a[i-1][j]==0)
		            p++;
		            if(j+1<n-1 && a[i][j+1]==0)
		            p++;
		            if(j-1>=0 && a[i][j-1]==0)
		            p++;
		        }
		    }
		}
		System.out.println(p);
	}
}