package pattern;

import java.util.Scanner;

public class Star9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int i,j;
	    char k;
	    for(i=1;i<=n;i++){
	        k='A';
	        for( j=1;j<=2*n-1;j++){
	              if(j<=5-i||j>=3+i) { 
	            	   
	                  System.out.print(k);
	                  k=j<=4?++k:--k;
	              }
	              else {
	            	  System.out.print(" ");
	            	   if(j==4)
	            		   k--;
	              }
	        }
	        System.out.println();
	    }

	}
}