package DP1;

import java.util.Scanner;

public class MinimumCostPath {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int m = s.nextInt();
		int n = s.nextInt();
		int input[][] = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				input[i][j] = s.nextInt();
			}
		}
		System.out.println(Solution.minCostPath(input));
	}
} 

class Solution {
    
	public static int minCostPath(int arr[][]) {
      int len1=arr.length;
      int len2= arr[0].length;
      int arr2[][] = new int[len1-1][len2-1];
		return minCostPath(arr,len1,len2,0,0,arr2);
	}
		
	public static int minCostPath(int arr[][],int len1,int len2,int i ,int j,int arr2[][]) {
	   if(i == len1-1 && j == len2-1)
	   {
		   arr2[i][j]=arr[i][j];
		   return arr2[i][j];
	   }
	   
	   if(i>=len1 || j >= len2)
	   {
		   return Integer.MAX_VALUE;
	   }
	     int sum = 0;
	    sum = sum+arr[i][j];
	    if(arr2[i][j]!=0)
	    {
	    	return arr2[i][j];
	    }
        int op1= minCostPath(arr,len1,len2,i+1,j,arr2);
        int op2= minCostPath(arr,len1,len2,i,j+1,arr2);
//        arr[i][j]=arr[i][j]+arr[i][j+1];
        int op3= minCostPath(arr,len1,len2,i+1,j+1,arr2);
	    
//        int min=Math.min(minCostPath(arr,len1,len2,i+1,j), Math.min(minCostPath(arr,len1,len2,i,j+1), minCostPath(arr,len1,len2,i+1,j+1)));
	   return arr[i][j]+Math.min(op1, Math.min(op2, op3));
//	   return arr[i][j]+min;
	}
}


//3 4
//3 4 1 2
//2 1 8 9
//4 7 8 1