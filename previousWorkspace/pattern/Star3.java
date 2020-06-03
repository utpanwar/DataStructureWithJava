package pattern;

import java.util.Scanner;

public class Star3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++){
	        
	        for(int j=1;j<=n;j++){
	              if(j>=6-i) //reverse this by j<=6-i
	                  System.out.print("*");
	                  
	              else
	                  System.out.print(" ");
	        }
	        System.out.println();
	    }

	}
}
