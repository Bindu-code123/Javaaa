import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int t=0;
		for(int i=2;i<=n;i++)
		{
		    t=(t+m)%i;
		}
		System.out.println(t+1);
	}
}
