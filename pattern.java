import java.io.*;
import static java.lang.System.*;

public class pattern
{
	public static void main(String a[])
	{
		int n=9;
		for(int i=0;i<n;i++)
		{
			//for(int j=0;j<=i;j++)
				//for(int j=4;j>i;j--)
		    //for(int j=i;j<4;j++)	
            for(int j=0;j<n;j++)				
			{
				if(i==0 || j==0 )
				System.out.print(" S"+"...");
			   else 
				   System.out.print(" ");
			   
			   if(i==n-1 )
			   System.out.print(" S"+"...");
		      else 
				   System.out.print(" ");
			   if(j==n-1)
				System.out.print(" S"+"...");
		      else 
				   System.out.print(" ");
			
			
			}
			System.out.println("\n");
		}
		
		
		
		
		
	}
}