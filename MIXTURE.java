/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    	while(num!=0)
		{
	    int n = sc.nextInt();
	    int m = sc.nextInt();
		
	
		if(n!=0 && m!=0)
		{
		    System.out.println("Solution");
		}
		else if(n==0 && m!=0 )
		{
		    System.out.println("Liquid");
		}
		else if(m==0 && n!=0) 
		{
		    System.out.println("Solid");
		}
	   num--;
		
		}
	}
}
