/*Given a number, find if it is Palindromic Prime ore not.  A Palindromic Prime is any number that is both a palindrome and a prime.

Input:
First line of input contains testcase T. For each testcase, there will be a single line containing a number N as input.

Output:
For each testcase, print 1 if N is palindromic prime, else print 0.

Constraints:
1 <= T <= 200
0 <= N <= 107

Example:
Input:
4
1
11
121
99

Output:
0
1
0
0

Explanation:
For testcase 1, we have input 1: We know 1 is not a prime so we print 0.
For testcase 2, we have input 11: 11 is both a prime and palindrome so we print 1.*/
package RandomGeeks;
import java.util.*;

public class PalindromePrime {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		    
		    while(t-->0){
		    	int N=sc.nextInt();
		        boolean flag=true;
		        int i=2;
			    while(i<=N/2||N==0||N==1){
			         if(N==0||N==1) {
			        	  flag=false;
			           break;
			         }
			    else if(N%i==0){
			    		flag=false;
			    		break;
			    	}
			       i++;
			  }
			  if(flag){
			      int temp=N;
			      int r,sum=0;
			      while(N!=0){
			          r=N%10;
			          sum=(sum*10)+r;
			          N=N/10;
			      }
			      if(temp==sum)
			        System.out.println(1);
			        else
			        	System.out.println(0);
			  }
			  else 
				  System.out.println(0);
		    }  
		
	}
}
