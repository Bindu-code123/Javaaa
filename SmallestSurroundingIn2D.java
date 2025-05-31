import java.util.*;
class Main
{
    public static void main(String []args)
    {
	    Scanner s=new Scanner(System.in);
	    int a[][]=new int[3][3];
	    for(int i=0;i<3;i++)
	    {
	        for(int j=0;j<3;j++)
	        {
	            a[i][j]=s.nextInt();
	        }
	    }
	    int k=s.nextInt();
	    int x=-1,y=-1;
	    for(int i=0;i<3;i++)
	    {
	        for(int j=0;j<3;j++)
	        {
	            if(a[i][j]==k)
	            {x=i;
	                y=j;
	            }
	        }
	    }
	    System.out.println(x+" "+y);
	    if(x+1<3 && a[x+1][y]<k )
	    k=a[x+1][y];
	    if(y+1<3 && a[x][y+1]<k )
	    k=a[x][y+1];
	    if(x-1>=0 && a[x-1][y]<k )
	    k=a[x-1][y];
	    if(y-1>=0 && a[x][y-1]<k )
	    k=a[x][y-1];
	    System.out.print(k);
    }
}