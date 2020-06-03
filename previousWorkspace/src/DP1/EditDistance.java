package DP1;
import java.util.Scanner;
public class EditDistance {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
		
			String str1 = s.next();
			String str2 = s.next();
//			System.out.println(Solution1.editDistance(str1, str2));
//			System.out.println(Solution1.editDistanceM(str1, str2));
			System.out.println(Solution1.editDistanceDP(str1, str2));
		}
	}

//class Solution1 {
//	public static int editDistance(String s1, String s2){		
//	    if(s1.length()==0 )
//	    	return s2.length();
//	    	if(s2.length()==0)
//	    	   return s1.length();
//	    if(s1.charAt(0)==s2.charAt(0))
//	    {
//	       return editDistance(s1.substring(1),s2.substring(1));
//	    }
//	    else
//	    {   //delete
//	       if(s1.length()<s2.length())
//	       {
//   			s2=s2.substring(s1.length());
//
//	       }
//	    	else if(s1.length()>s2.length())
//	    	{   //insert
//	    		s2=s1.charAt(0)+s2;
//	    	}
//	    	else
//	    	{  //substitute
//	    		s2=s1.charAt(0)+s2.substring(1);
//	    	}
//	    }
//	    return 1+Math.min(editDistance(s1,s2), Math.min(editDistance(s1,s2), editDistance(s1,s2)));
//	}  
//}

////copy code Vishwan 
//public class Solution {
//	public static int editDistance(String s, String t){		
// // public static int editDistanceDP(String s, String t){
//		int m = s.length();
//		int n = t.length();
//		int storage[][] = new int[ m + 1][n + 1];
//		for(int j = 0; j <= n; j++){
//			storage[0][j] = j;
//		}
//		for(int i = 0; i <= m; i++){
//			storage[i][0] = i;
//		}
		
//		for(int i = 1; i <= m; i++){
//			for(int j = 1; j <= n; j++){
//				if(s.charAt(m - i) == t.charAt(n - j)){
//              // last m-i character and n-j th character
//					storage[i][j] = storage[i - 1][j - 1];
//				}else{
//					storage[i][j] = 1 + Math.min(storage[i][j - 1], Math.min(storage[i - 1][j], storage[i - 1][j - 1]));
//				}
//			}
//		}
//		return storage[m][n];
//	}
	
//}


//simple solution of mine but it fails some ts

//class Solution{
//	public static int editDistance(String s1, String s2){		
//	    if(s1.length()==0 )
//	    	return s2.length();
//	    	if(s2.length()==0)
//	    	   return s1.length();
//	    if(s1.charAt(0)==s2.charAt(0))
//	    {
//	       return editDistance(s1.substring(1),s2.substring(1));
//	    }
//	    else
//	    {   //delete
//	       if(s1.length()<s2.length())
//	       {
// 			s2=s2.substring(s1.length());

//	       }
//	    	else if(s1.length()>s2.length())
//	    	{   //insert
//	    		s2=s1.charAt(0)+s2;
//	    	}
//	    	else
//	    	{  //substitute
//	    		s2=s1.charAt(0)+s2.substring(1);
//	    	}
//	    }
//	    return 1+Math.min(editDistance(s1,s2), Math.min(editDistance(s1,s2), editDistance(s1,s2)));
//	}  
//}

               // very finne soln of cn
class Solution1 {
	public static int editDistance(String s1, String s2){		
	    if(s1.length()==0 )
	    	return s2.length();
	    	if(s2.length()==0)
	    	   return s1.length();
	    if(s1.charAt(0)==s2.charAt(0))
	    {
	       return editDistance(s1.substring(1),s2.substring(1));
	    }
	    else
	    {   //delete
	       
			int op1 = editDistance(s1,s2.substring(1));

              //insert
	        int op2=editDistance(s1.substring(1),s2);
	    	
	    	  //substitute
	    	int op3=editDistance(s1.substring(1),s2.substring(1));
	    	
	     return 1+Math.min(op1, Math.min(op2,op3));
	    }
	}  
	public static int editDistanceM(String s1,String s2)
	{
		int m =s1.length();
		int n=s2.length();
		int arr[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				arr[i][j]=-1;
			}
		}
		return editDistanceM(s1,s2,arr);
	}
	private static int editDistanceM(String s1 ,String s2,int arr[][] )
	{
		int m =s1.length();
		int n=s2.length();
		if(s1.length()==0)
		{
			arr[m][n]=n;
			return arr[m][n];
		}
		if(s2.length()==0)
		{
			arr[m][n]=m;
			return arr[m][n];
		}
        if(arr[m][n]!=-1)
        	return arr[m][n];
        if(s1.charAt(0)==s2.charAt(0))
	    {
	       arr[m][n]=editDistanceM(s1.substring(1),s2.substring(1),arr);
	    }
	    else
	    {   //delete
	       
			int op1 = editDistanceM(s1,s2.substring(1),arr);

              //insert
	        int op2=editDistanceM(s1.substring(1),s2,arr);
	    	
	    	  //substitute
	    	int op3=editDistanceM(s1.substring(1),s2.substring(1),arr);
	    	
	     arr[m][n]=1+Math.min(op1, Math.min(op2,op3));
	    }
        return arr[m][n];
	}
	public static int editDistanceDP(String s1 ,String s2 )
	{
		int m =s1.length();
		int n =s2.length();
		int arr[][] =new int[m+1][n+1];
		for(int j=0;j<=s2.length();j++)
		{
			arr[0][j]=j;
		}
		for(int i=0;i<=s1.length();i++)
		{
			arr[i][0]=i;
		}
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					arr[i][j]= arr[i-1][j-1];
				}
				else
				{
					arr[i][j] = 1+ Math.min(arr[i][j-1], Math.min(arr[i-1][j], arr[i-1][j-1]));
				}
			}
		}
		return arr[m][n];
	}
}







