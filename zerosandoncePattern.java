import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=1;
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=n;j++)
		    {
		        System.out.print(c+" ");
		        c=c==0?1:0;
		    }
		    if(n%2==0)
		    c=c==0?1:0;
		    System.out.println();
		}
	}
}