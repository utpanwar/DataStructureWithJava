package DP1;

import java.util.Arrays;
import java.util.Scanner;


public class CoinChange{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int numDenominations = s.nextInt();
		int denominations[] = new int[numDenominations];
		for(int i = 0; i < numDenominations; i++){
			denominations[i] = s.nextInt();
		}
		
		int value = s.nextInt();
		
//		System.out.println(Solution4.countWaysToMakeChange(denominations, value));
		System.out.println(Solution4.countWaysToMakeChange1(denominations, value));
//		System.out.println(Solution4.countWaysToMakeChange2(denominations, value));
		
	}
}


 class Solution4 {

	
	public static int countWaysToMakeChange(int arr[], int sum){
//		return countWaysToMakeChange(arr,sum,0);
		int tab[]=new int[sum+1];
		for(int i=0;i<=sum;i++)
		{
		   tab[i]=-1;	
		}
		return countWaysToMakeChange(arr,sum,0,tab);

	}
//	private static int countWaysToMakeChange(int arr[], int sum,int i){
////		int c1 = sum-arr[i];  
//		if(sum==0)
//			  return 1;
//		  if(sum<0)
//			  return 0;
//		if(i>=arr.length)
//			return 0;
//		  
//		return countWaysToMakeChange(arr,sum-arr[i],i)
//				+countWaysToMakeChange(arr,sum,i+1);
//	}
	private static int countWaysToMakeChange(int arr[], int sum,int i,int tab[]){
//		int c1 = sum-arr[i];  
		if(i>=arr.length)
		{
			tab[sum]=0;
			return tab[sum];
		}
		if(sum==arr[i])
		{
			tab[sum]=1;
			return tab[sum];
		}
		if(tab[sum]!=-1)
		{
			tab[sum]=tab[sum]+tab[sum];
		}
		  if(sum<arr[i])
		  {
			  tab[sum]=0;
			return tab[sum];
		  }
//	
		tab[sum]=countWaysToMakeChange(arr,sum-arr[i],i,tab)
				+countWaysToMakeChange(arr,sum,i+1,tab);;
		return tab[sum]; 
	}
	public static long countWaysToMakeChange1(int S[], int n){

        int m=S.length;
        long[] table = new long[n+1]; 
  
        // Initialize all table values as 0 
      //  Arrays.fill(table, 0);   //O(n) 
  
        // Base case (If given value is 0) 
        table[0] = 1; 
 
        for (int i=0; i<m; i++) 
        {
        	 for (int j=S[i]; j<=n; j++) 
        	 {
        		 int l=j-S[i];
        		 table[j] += table[j-S[i]]; 
        	 }
        }
           
        return table[n]; 		
  

	}
	public static long countWaysToMakeChange2(int s[], int sum){

        int n=s.length;
        int[] arr = new int[sum+1]; 
         for(int i=0;i<n;i++)
         {
        	 arr[s[i]]++;
         }
         int count =0;int x=sum;
         for(int j=0;j<n;j++) {
        	 x=x-s[j];
        	 if(x>0 && arr[x]>0)
        	 {
        		 count++;
        	 }
         }
               return count; 		
	}
}

//3
//2 3 5
//4


