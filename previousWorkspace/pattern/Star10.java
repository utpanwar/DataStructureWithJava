package pattern;

import java.util.Scanner;

public class Star10 {
 public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i, k=0;
    for(i=1;i<=n;i++)
      {   k=i<=(n/2+1)?++k:--k;
         for(int j=1;j<=n;j++)
         {
        	 if(j>=n-2-k&&j<=n/2+k)
        	 {
        		 System.out.print("*");
        	 } 
        	 else
        	 {
        		 System.out.print(" ");
        	 }
         }
        System.out.println(); 
      }
 }      

}