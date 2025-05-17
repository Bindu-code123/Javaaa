import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int p=0;
		String a[]=new String[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=s.next();
		}
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(i==j)
		        continue;
		        else
		        {
		            if(isPalindrome(a[i]+a[j]))
		            {
		                if(p==0)
		                System.out.print("[["+i+","+j+"]");
		                else
		                System.out.print(",["+i+","+j+"]");
		                p++;
		            }
		        }
		    }
		    System.out.print("]");
		}
		
	}
	public static boolean isPalindrome(String a)
	{
	    String b="";
	    for(int i=0;i<a.length();i++)
	    {
	        b=a.charAt(i)+b;
	    }
	    if(b.equals(a))
	    return true;
	    return false;
	}
}