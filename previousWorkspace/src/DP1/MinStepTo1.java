package DP1;

import java.util.Scanner;

public class MinStepTo1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Solution6.countStepsTo12(n));
	}
}

class Solution6 {
	static int count;
	public static int countStepsTo1(int n){
	    return countStepsTo1(n,0);
       }	
     
	private static int countStepsTo1(int n,int count1){
      	 if(n==1)
      	 {
      		 count=count1;
      		 return count;
      	 }
        if(n%3==0)
        {
        	countStepsTo1(n/3,count1+1);
        }
        else if((n-1)%3==0)
        {
        	countStepsTo1(n-1,count1+1);
        }
        else if(n%2==0)
        {
            countStepsTo1(n/2,count1+1);
        }
        else if((n-1)%2==0)
        {
        	countStepsTo1(n-1,count1+1);
        }
        // THIS SOLN IS NOT PASS SOME TST CASES LIKE 16
        //SO DIFFERENT SOLN
        return count;
    }   
	
	static int countStepsTo12(int n){
		if(n==1)
			return 0;
		int op1=countStepsTo12(n-1);
		int minSteps=op1;	
		if(n%3==0)
		{
			int op2 = countStepsTo12(n/3);
			if(op2<minSteps)
				op2=minSteps;
		}
		if(n%2==0)
		{
			int op3 = countStepsTo12(n/2);
			if(op3<minSteps)
				op3=minSteps;
		}
		return 1 +minSteps;
	}
	
}

