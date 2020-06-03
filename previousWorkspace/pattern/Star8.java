package pattern;

import java.util.Scanner;

public class Star8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int i,j;
	    for(i=1;i<=n;i++){
	    	int k=1;
	        for( j=1;j<=2*n-1;j++){
	        	if(j<4) {
	              if(j>=5-i&&j<=3+i) { 
	            	   
	                  System.out.print(k);
	                    k++;
	              }
	              else {
	            	  System.out.print(" ");
	            	 
	              }
	        }
	        	else {
	        		 if(j>=5-i&&j<=3+i) { 
		            	   
		                  System.out.print(k);
		                    k--;
		              }
		              else {
		            	  System.out.print(" ");
	        	}
	       }
	        }
	        System.out.println();
	    
	    }
	}

}