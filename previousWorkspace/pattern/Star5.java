package pattern;

import java.util.Scanner;

public class Star5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++){
	         boolean k=true;
	        for(int j=1;j<=2*n-1;j++){
	              if(j>=6-i&&j<=4+i&&k) { 
	            	   
	                  System.out.print("*");
	                  k=false;   
	              }
	              else {
	            	  System.out.print(" ");
	            	  k=true;
	              }
	        }
	        System.out.println();
	    }

	}

}
