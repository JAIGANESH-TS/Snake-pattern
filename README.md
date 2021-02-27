//# Snake-pattern
//Printing a snake pattern without using if stmt and arrays 
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Snake
{
    static int spaces=0,start=1;
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try
		{
		    Scanner in=new Scanner(System.in);
		    int n=in.nextInt();
		    start=1;
		    spaces=(n-1)*2;
		    for(int i=0;i<n;i++)
		    {
		        int get=(i%2==0)?even(n):odd(start+n-1,n);
		        spaces-=2;
		    }
		}
		catch(Exception e)
		{
		    //
		}
	}
	public static int even(int n)
	{
	    for(int i=0;i<spaces;i++)
	    System.out.print(" ");
	    for(int i=0;i<n;i++)
	    System.out.print((start++)+" ");
	    System.out.println();
	    return 0;
	}
	public static int odd(int k,int n)
	{
	    for(int i=0;i<spaces;i++)
	    System.out.print(" ");
	    for(int j=0;j<n;j++)
	    {
	    System.out.print(k+" ");start++;k--;
	    }
	    System.out.println();
	    return 0;
	}
}
