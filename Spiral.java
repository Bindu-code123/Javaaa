import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[][]=new int[n][n];
		int left=0,top=0;
		int right=n-1,bottom=n-1;
		int dir=0;
		int c=1;
		while(left<=right && top<=bottom)
		{
		    if(dir==0)
		    {
		        for(int i=left;i<=right;i++)
		        {
		            a[top][i]=c;
		            c++;
		        }
		        top++;
		    }
		    else if(dir==1)
		    {
		        for(int i=top;i<=bottom;i++)
		        {
		            a[i][right]=c;
		            c++;
		        }
		        right--;
		    }
		    else if(dir==2)
		    {
		        for(int i=right;i>=left;i--)
		        {
		            a[bottom][i]=c;
		            c++;
		        }
		        bottom--;
		    }
		    else if(dir==3)
		    {
		        for(int i=bottom;i>=top;i--)
		        {
		            a[i][left]=c;
		            c++;
		        }
		        left++;
		    }
		    dir=(dir+1)%4;
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(a[i][j]<10)
		        System.out.print(" ");
		        System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}