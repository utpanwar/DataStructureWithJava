package pattern;
import java.util.*;
public class Star11 {
  public static void main(String args[]) {
	  int i,j,k,r;
	  System.out.println("Enter the number of rows");
	  Scanner s=new Scanner(System.in);
	  r=s.nextInt();
	  for(i=0;i<r;i++)
	  {
		   if(i<=r/2)
		   {
			   for(k=r/2;k>i;k--)
			   {
				   System.out.print(" ");
			   }
			   for(j=0;j<=2*i;j++)
			   {
				   System.out.print("*");
			   }
		   }
		   else
		   {
			   for(k=r/2;k<i;k++)
			   {
				   System.out.print(" ");
			   }
			   for(j=0;j<((r-i)*2)-1;j++)
			   {
				   System.out.print("*");
			   }
		   }
		   
		   System.out.println();
	  }
	  
	  
  }

}


   
       