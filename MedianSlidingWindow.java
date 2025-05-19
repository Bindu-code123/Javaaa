import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		ArrayList<Integer> p=new ArrayList<>();
		ArrayList<Float> q=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		int k=s.nextInt();
		for(int i=0;i<=n-k;i++)
		{
		    int b[]=new int[k];
		    for(int j=0;j<k;j++)
		    {
		        b[j]=a[j+i];
		    }
		    Arrays.sort(b);
		    if(k%2==1)
		    p.add(b[(k-1)/2]);
		    else
		    {
		        float m=((float)b[(k-1)/2]+b[k/2])/2;
		        q.add(m);
		    }
		}
		if(k%2==1)
		System.out.println(p);
		else
		System.out.println(q);
	}
}