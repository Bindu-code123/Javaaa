import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String p="10 march 2024,5 october 2019,3 march 2024,19 february 2024";
        String a[]=p.split(",");
        Map<String,Integer> mm=new LinkedHashMap<>();
        mm.put("january",1);
        mm.put("february",2);
        mm.put("march",3);
        mm.put("april",4);
        mm.put("may",5);
        mm.put("june",6);
        mm.put("july",7);
        mm.put("august",8);
        mm.put("september",9);
        mm.put("october",10);
        mm.put("november",11);
        mm.put("december",12);
        for(int i=1;i<a.length;i++)
        {
            for(int j=0;j<a.length-i;j++)
            {
                String b=a[j];
                String q=a[j+1];
                int y1=Integer.parseInt(b.substring(b.length()-4));
                int y2=Integer.parseInt(q.substring(q.length()-4));
                int d1=0,d2=0,m1=0,m2=0;
                if(b.charAt(1)==' ')
                {
                    d1=Integer.parseInt(b.substring(0,1));
                    m1=mm.get(b.substring(2,b.length()-5));
                }
                else
                {
                    d1=Integer.parseInt(b.substring(0,2));
                    m1=mm.get(b.substring(3,b.length()-5));
                }
                if(q.charAt(1)==' ')
                {
                    d2=Integer.parseInt(q.substring(0,1));
                    m2=mm.get(q.substring(2,q.length()-5));
                }
                else
                {
                    d2=Integer.parseInt(q.substring(0,2));
                    m2=mm.get(q.substring(3,q.length()-5));
                }
                if(y1>y2)
                {
                    String t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
                else if(y1==y2)
                {
                    if(m1>m2)
                    {
                        String t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    }
                    else if(m1==m2)
                    {
                        if(d1>d2)
                        {
                            String t=a[j];
                            a[j]=a[j+1];
                            a[j+1]=t; 
                        }
                    }
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        
    }
}