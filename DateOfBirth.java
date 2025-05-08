import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String dob=s.next();
		String a[]=dob.split("-");
		Calendar c=Calendar.getInstance();
		int cyear=c.get(Calendar.YEAR);
		int cmonth=c.get(Calendar.MONTH)+1;
		int cdays=c.get(Calendar.DAY_OF_MONTH);
		System.out.println(cyear+" "+cmonth+" "+cdays);
		int year=cyear-Integer.parseInt(a[2]);
		int month=cmonth-Integer.parseInt(a[1]);
		int day=cdays-Integer.parseInt(a[0]);
		if(day<0)
		{
		    month-=1;
		    day+=daysReturn(cmonth==1?12:cmonth-1,cyear);
		}
		if(month<0)
		{
		    year-=1;
		    month+=12;
		}
		System.out.println(year+" "+month+" "+day);
	}
	public static int daysReturn(int month,int year)
	{
	    if(month==2)
	    {
	        if(year%4==0 && year%100!=0 || year%400==0)
	        return 29;
	        return 28;
	    }
	    else if(month==4 || month==6||month==9||month==11)
	    return 30;
	    else 
	    return 31;
	}
}
		