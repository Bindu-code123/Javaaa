/*Input             :   Frist 9 lines consists the Numbers in lock Pattern (3*3 Matrix)

                          10th line of input consists of one value which represents phone lock pattern.

Output          :   Print valid if the pattern lock matches else print not valid.

Constraints  :   Given Value input must consists of only 5 characters.If not print "Invalid Input".

                          The given Value consists of only numeric characters(1-9).

                          1  2  3
                          4  5  6
                          7  8  9
Input1     :   1

                    2

                    3

                    4

                    5

                    6

                    7

                    8

                    9

                    "74153"

Output1  :   valid 

 

Input 2     :  1

                    2

                    3

                    4

                    5

                    6

                    7

                    8

                    9

                    "12379"

Output 2  :  Not valid


Explanation:
Input1       : 1

                    2

                    3

                    4

                    5

                    6

                    7

                    8

                    9

                    "74153"

Output1        :   Valid 

Explanation   :

   

Hence the given string forms valid pattern lock.

 

Input 2     :  1

                    2

                    3

                    4

                    5

                    6

                    7

                    8

                    9

                    "12376"

Output 2       :  Invalid 3 7

*/



import java.util.*;
class Main
{
    public static void main(String []args)
    {
	    Scanner obj=new Scanner(System.in);
	    int a[][]=new int[3][3];
	    String d="";
	   // Random r=new Random();
	    for(int i=0;i<3;i++)
		    for(int j=0;j<3;j++)
			    a[i][j]=obj.nextInt();
	    String k=obj.next();
        if(k.length()!=5)
        {   
            System.out.print("Invalid Input");  
            return; 
        } 
        boolean b=true;
	    int x=-1,y=-1;
	    for(int i=0;i<3;i++)
	    {
		    for(int j=0;j<3;j++)
		    {
			    if( a[i][j]==(k.charAt(0))-48 )
			    {
			        x=i;
			        y=j;	
			    }
		    }
	    }
	    //System.out.println(x+" "+y);
	    for(int i=1;i<k.length() & b;i++)
	    {
		    if(x+1<3 && y+1<3 && a[x+1][y+1]==k.charAt(i) -48)
		    {	
		        x++;
		        y++;
		        continue;
		    }
		    else if(x+1<3 && y-1>=0 && a[x+1][y-1]==k.charAt(i)-48)
		    {
		        x++;
		        y--;
		        continue;
		    }
		    else if(x-1>=0 && y+1<3 && a[x-1][y+1]==k.charAt(i)-48)
		    {	
		        x--;
		        y++;
		        continue;	
		    }
		    else if(x-1>=0 && y-1>=0 && a[x-1][y-1]==k.charAt(i)-48)
		    {	
		        x--;	
		        y--;	
		        continue;	
		    }
		    else if(y+1<3 && a[x][y+1]==k.charAt(i)-48)
		    {	
		        y++;	
		        continue;
		    }
		    else if(y-1>=0 && a[x][y-1]==k.charAt(i)-48)
		    {	
		        y--;	
		        continue;
		    }
		    else if(x+1<3 && a[x+1][y]==k.charAt(i)-48)
		    {	
		        x++;	
		        continue;
		    }
		    else if(x-1>=0 && a[x-1][y]==k.charAt(i)-48)
		    {	
		        x--;
		        continue;
		    }
		    System.out.print("Invalid "+ k.charAt(i-1) + " " + k.charAt(i));
	    	b=!b;
	    }
	    if(b)
		System.out.println("Valid");
	}
}