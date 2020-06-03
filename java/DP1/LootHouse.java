package DP1;

import java.util.Scanner;

public class LootHouse {
  public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int arr[] = new int[n];
	for(int i=0; i<n; i++){
		arr[i] = s.nextInt();
	}
//	System.out.println(Solution3.getMaxMoney(arr, n));
	System.out.println(Solution3.getMaxMoney1(arr, n));
}
}
  class Solution3 {
	public static  int getMaxMoney(int arr[], int n){

//        return getMaxMoney(arr,n,0);
		int tab[][]=new int[n+1][n+1];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				tab[i][j]=-1;
			}
		}
        return getMaxMoneyM(arr,n,0,tab);
	}
    private static  int getMaxMoney(int arr[],int n,int i)
    {
        if(i==n-1 || (i+1)==n-1)
        {
            return arr[i];
        }
        int op1 = arr[i] + getMaxMoney(arr,n,i+2);
        int op2 =  getMaxMoney(arr,n,i+1);
        
        return Math.max(op1,op2);
    }
    private static  int getMaxMoneyM(int arr[],int n,int i,int tab[][])
    {
        if(i==arr.length-1 || (i+1)==arr.length-1 )
        {   tab[n][i]=arr[i];
            return tab[n][i];
        }
        if(tab[n][i]!=-1)
        {
        	return tab[n][i];
        }
        int op1 = arr[i] + getMaxMoneyM(arr,n-2,i+2,tab);
        int op2 =  getMaxMoneyM(arr,n-1,i+1,tab);
        tab[n][i]=Math.max(op1,op2);
        return tab[n][i];
    }
    
    
    
    
    
    public static  int getMaxMoney1(int arr[], int n){
      int tab[]=new int[n+1];
			for(int j=0;j<=n;j++)
			{
				tab[j]=-1;
			}
      return getMaxMoneyM2(arr,n,0,tab);
	}
    private static  int getMaxMoneyM2(int arr[],int n,int i,int tab[])
    {
        if(i==arr.length-1 || (i+1)==arr.length-1 )
        {   tab[n-i]=arr[i];
            return tab[n-i];
        }
        if(tab[n-1]!=-1)
        {
        	return tab[n-1];
        }
        int op1 = arr[i] + getMaxMoneyM2(arr,n,i+2,tab);
        int op2 =  getMaxMoneyM2(arr,n,i+1,tab);
        tab[n]=Math.max(op1,op2);
        return tab[n];
    }
 }
 
 
 
