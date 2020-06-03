/*The task is to convert decimal numbers(base 10) to the ternary numbers(base 3).

Input:
First line of input contains testcase T. For each testcase there will be a single line containing a decimal number N as input.

Output:
For each testcase, print the ternary(base 3) equivalent of the given decimal number.

Constraints:
1<=T<=120
0<=N<=107

Example:
Input:
5
1
2
3
4
5

Output:
1
2
10
11
12

Explanation:
For testcase 1, we have input 1: The ternary equivalent of 1 is 1.
For testcase 5, we have input 5: The ternary equivalent of 5 is 12.*/

package RandomGeeks;

import java.util.Scanner;

public class ConvertNumToTernary {
      public static void main(String args []) {
    	  Scanner sc=new Scanner(System.in);
    	  int n=sc.nextInt();
    	  int rem=0,sum=0,i=1;
    	    while(n!=0) {
    	    	rem=n%3;
    	    	n=n/3;
    	    	sum=(sum)+rem*i;
    	    	i=i*10;
    	    }
    	    System.out.println(sum);
      }
}
