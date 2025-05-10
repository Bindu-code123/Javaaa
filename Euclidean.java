import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int p=0;
		for(int i=a;i>=1;i--)
		{
		    if(a%i==0 && b%i==0)
		    {
		        System.out.print(i);
		        p=i;
		        break;
		    }
		}
		int i=1,j=0;
		int i1=0,j1=1;
		while(b!=0)
		{
		    int q=a/b;
		    int r=a%b;
		    int ti=i-q*i1;
		    int tj=j-q*j1;
		    a=b;
		    b=r;
		    i=i1;
		    j=j1;
		    i1=ti;
		    j1=tj;
		    System.out.println(i+" "+j);
		}
	}
}