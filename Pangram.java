import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String p=s.nextLine();
		ArrayList<Character> a=new ArrayList<>();
		for(char c='a';c<='z';c++)
		{
		    a.add(c);
		}
		p=p.toLowerCase();
		for(int i=0;i<p.length();i++)
		{
		    char A=p.charAt(i);
		    if(a.contains(A))
		    {
		        a.remove(Character.valueOf(A));
		        i--;
		        p=p.replace(A+"","");
		    }
		}
		if(a.size()==0)
		System.out.println("yes pangram");
		else
		System.out.println("Not pangram");
	}
}