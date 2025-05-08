import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String date=s.next();
		String a[]=date.split("-");
        int year=Integer.parseInt(a[2]);
		int month=Integer.parseInt(a[1]);
		int day=Integer.parseInt(a[0]);
		int mon[]={3,0,3,2,3,2,3,3,2,3,2,3};
		ArrayList<String> week=new ArrayList<>(Arrays.asList("Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"));
		int b=year%400;
		int p=0;
		if(b>300)
		{
		    b=b-300;
		    p=1;
		    int b1=b/4;
		    p+=b1*2+(b-b1);
		}
		else if(b>200)
		{
		    b=b-200;
		    p=3;
		    int b1=b/4;
		    p+=b1*2+(b-b1);
		}
		else if(b>100)
		{
		    b=b-100;
		    p=5;
		    int b1=b/4;
		    p+=b1*2+(b-b1);
		}
		else
		{
		    int b1=b/4;
		    p+=b1*2+(b-b1);
		}
		for(int i=0;i<month-1;i++)
		{
		    p+=mon[i];
		}
		p+=day;
		if(year%4==0 && year%100!=0 || year%400==0)
		p=p+1;
		p=p-1;
		System.out.println(week.get(p%7-1));
	}
}
		