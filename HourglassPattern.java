import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int p=1;
        int k=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=2*n-p+i-1;j++)
            {
                if(j<i)
                System.out.print(" ");
                else
                System.out.print(k+" ");
            }
            p=p+2;
            k--;
            System.out.println();
        }
        p=n+1;
        k=0;
        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<=p+k;j++)
            {
                if(j<n-i+1)
                System.out.print(" ");
                else
                System.out.print(i+" ");
            }
            k++;
            System.out.println();
        }
    }
}
