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
	    int h=Integer.MIN_VALUE;
	    ArrayList<Integer> p1=new ArrayList<>();
	    for(int i=1;i<(int)Math.pow(2,n);i++)
	    {
	        int t=i;
	        int j=0;
	        ArrayList<Integer> p=new ArrayList<>();
	        while(t>0)
	        {
	            int r=t%2;
	            t=t/2;
	            if(r==1)
	            {
	                p.add(a[j]);
	            }
	            j++;
	        }
	        Collections.sort(p);
	        if((p.get(p.size()-1)-p.get(0))==1)
	        {
	            if(p.size()>h)
	            {
	                h=p.size();
	                p1=p;
	            }
	        }
	    }
	    System.out.println(p1+"  "+h);
	}
}