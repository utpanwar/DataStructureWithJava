package DP1;

import java.util.Scanner;

public class _01_Knapsack {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int weight[] = new int[n];
		for(int i = 0 ; i < n; i++){
			weight[i] = s.nextInt();
		}
		int value[] = new int[n];
		for(int i = 0 ; i < n; i++){
			value[i] = s.nextInt();
		}
		int maxWeight = s.nextInt();
//		System.out.println(Solution2.knapsack(weight, value, maxWeight, n));		
//		System.out.println(Solution2.knapsackR(weight, value, maxWeight, 0));		
		System.out.println(Solution2.knapsackrM(weight, value, maxWeight, 0));		
	}
}

 class Solution2 {
	
	public static int knapsack(int[] w,int v[],int m, int n){
        int count1=0;
		for(int i=0;i<n;i++)
        {   int count2=0;
            int count=0;
             for(int j=0;j<n;j++)
            {   
                if(j!=i && w[j]<m)
                {
                	count2 +=w[j];
                	if(count2<=m)
                	{
                		count += v[j];
                	}
                	else count2 -=w[j];
             } 
            }
          if(count1<count)
             count1=count;
        }//it cant pass all the ts
        return count1;
	}
	
	// recursive soln
	public static int knapsackR(int[] w,int v[],int m, int n){
		return knapsackR1(w,v,m,0);
	}
	private static int knapsackR1(int [] w,int v[],int m, int i)
	{
		if(i==w.length || m==0)
		{
			return 0;
		}
		if(w[i]>m)
		{
			return knapsackR1(w,v,m,i+1);
		}
		else
		{   //include
			int op1 = v[i] + knapsackR1(w,v,m-w[i],i+1);
			int op2 = knapsackR1(w,v,m,i+1);
			return Math.max(op1, op2);
		}
	}
	
	//memo
	public static int knapsackrM(int[] w,int v[],int m, int n){
		int arr[][]=new int [w.length+1][m+1];
		for(int i=0;i<=w.length;i++)
		{
			for(int j=0;j<=m;j++)
			{
				arr[i][j]=-1;
			}
		}
		int l= w.length;
		return knapsackM(w,v,m,0,arr);
	}
	private static int knapsackM(int [] w,int v[],int m, int i,int arr[][])
	{
		if(i==w.length || m==0)
		{   arr[i][m]=0;
			return arr[i][m];
		}
		if(arr[i][m]!=-1)
		{
			return arr[i][m];
		}
			
		if(w[i]>m)
		{   arr[i][m]=knapsackM(w,v,m,i+1,arr);
			return arr[i][m];
		}
		else
		{   //include
			int op1 = v[i] + knapsackM(w,v,m-w[i],i+1,arr);
			int op2 = knapsackM(w,v,m,i+1,arr);
			arr[i][m]=Math.max(op1, op2);
			return arr[i][m];
		}
	}
}

 
 
 
// 4
// 1 2 4 5
// 5 4 8 6
// 5
// 6
// 1 2 3 8 7 4
// 20 5 10 40 15 25
// 10
// 4
// 5 4 6 3
// 10 40 30 50
// 10
 
// 4
// 2 3 4 5
// 1 2 5 6
// 8
 