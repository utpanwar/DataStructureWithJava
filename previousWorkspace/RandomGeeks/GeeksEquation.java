/*Given a number N, find the value of below equation for the given number.


 

Input:
First line of input contains testcase T. For each testcase, there will be a single line containing a number N as input.

 

Output:
For each testcase, print the resultant of the equation.

Constraints:
1<=T<=100
1<=N<=105

Example:
Input:
4
1
2
121
99

Output:
1
5
597861
328350

Explanation:
For testcase 2, the resultant of the equation for N = 2 comes out as 5.


 

Input:
First line of input contains testcase T. For each testcase, there will be a single line containing a number N as input.

 

Output:
For each testcase, print the resultant of the equation.

Constraints:
1<=T<=100
1<=N<=105

Example:
Input:
4
1
2
121
99

Output:
1
5
597861
328350

Explanation:
For testcase 2, the resultant of the equation for N = 2 comes out as 5.

*/



package RandomGeeks;

import java.util.Scanner;

public class GeeksEquation {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		  while(t-->0) {
			  double n=sc.nextDouble();
			  int sum=0;int p;
			  for(int i=1;i<=n;i++) {
				   p=(int)Math.pow(i+1,2);
				  sum +=(p-((3*i)+1)+i);
			  }
			  System.out.println(sum);
		  }
	}

}