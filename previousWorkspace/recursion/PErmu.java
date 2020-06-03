package recursion;
import java.util.*;
public class PErmu {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		solution6.permutation(input);
	}
}

 class solution6 {


   public static void permutation(String input){
          permutation("", input);
   }

   private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.out.println(perm + word);

        } else {
            
			for (int i = 0; i< word.length();i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) 
                                        + word.substring(i + 1, word.length()));
            }
        }

    }
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

 import java.util.*;
 public class Solution{	
 	
 	public static int findUnique(int[] arr){
 	/* LOGIC 1->int len = arr.length;
         int ans = 0;
         for(int i=0;i<len;i++){
             ans^=arr[i];
         }*/
         int n=arr.length;
         int i=0;
         while(i<n)
         {   int j=0;
             while(j<n)
             {  if(i!=j)
                 if(arr[i]==arr[j])
                     break;
                 j++;
             }
           if(j==n)
               return arr[i];
            i++;
 	   }
         
//      //there are four ways of doing this we do all 
//          //1.hashing 2.sorting and two mare above
//           return Integer.MAX_VALUE;
         
//       //solution no 2
//          int n=arr.length;
//            Arrays.sort(arr);
//          for(int i=0;i<n;i++)
//          {
//              if(arr[i]!=arr[i+1])
//                  if(arr[i+1]!=arr[i+2])
//                      return arr[i+1];
//          }
//           return Integer.MAX_VALUE;
     }
 }
 
 
 
 public class Solution{	
		
		public static int duplicate(int[] arr){
	        int n=arr.length;
	        int num=0;
			for(int i=0;i<n-2;i++)
	        {
	            for(int j=i+1;j<n-2;j++)
	            {
	                if(arr[i]==arr[j])
	                {
	                    num=arr[i];
	                    return num;
	                }   
	            }
	        }
	        return -1;
		}
	}
	// 1.


     
public class Solution{	
	
	public static void intersections(int[] input1, int[] input2){
		  int l1=input1.length;
          int l2=input2.length;
        for(int i=0;i<l1;i++)
        {
            for(int j=0;j<l2;j++)
            {
                if(input1[i]==input2[j])
                {
                    System.out.println(input1[i]);
                     input2[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
	}
}




public class Solution{	
	
	public static void pairSum(int[] input, int x){
	  int n=input.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(input[i]+input[j]==x)
                {  if(input[i]>input[j])
                    {
                       System.out.println(input[j]+" "+input[i]);
                    }
                 else
                      System.out.println(input[i]+" "+input[j]);
                   
                }
            }
        }
	}
}




import java.util.*;

public class Solution{	
	
	public static void tripletSum(int[] input, int x){
	  int n=input.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
              {
                if(input[i]+input[j]+input[k]==x)
                {
                    int a[] = new int[3];
                    a[0] = input[i];
                    a[1] = input[j];
                    a[2] = input[k];
                    Arrays.sort(a);
                    for(int kk=0;kk<3;kk++) System.out.print(a[kk]+" ");
                    System.out.println();
                 //    if(input[i]<input[j]){
                 //    if(input[j]<input[k])
                 //    {
                 //       System.out.println(input[i]+" "+input[j]+" "+input[k]);
                 //    }
                 // else{
                 //      System.out.println(input[i]+" "+input[k]+" "+input[j]);
                 //     }
                 //  }
                 //   else if(input[j]<input[k]){
                 //    if(input[k]<input[i])
                 //    {
                 //       System.out.println(input[j]+" "+input[k]+" "+input[i]);
                 //    }
                 // else{
                 //      System.out.println(input[j]+" "+input[i]+" "+input[k]);
                 //     }
                 //  }
                 //  else  if(input[k]<input[i]){
                 //    if(input[j]<input[k])
                 //    {
                 //       System.out.println(input[k]+" "+input[i]+" "+input[j]);
                 //    }
                 // else{
                 //      System.out.println(input[k]+" "+input[j]+" "+input[i]);
                 //     }
                 //  }
                }
              }     
            }
        }
	}
}




import java.util.*;
public class SortBinaryArray{	

	public static void sortBinaryArray(int[] a){
		 int n=a.length;
		// int count=0;
		// for(int i=0;i<n;i++)
		// {
		// if(arr[i]==0)
		// count++;
		// }
		// for(int i=0;i<n;i++)
		// {
		// if(i<count)
		// arr[i]=0;
		// else
		// arr[i]=1;
		// } 
        //Arrays.sort(arr);
        int i=0,j=0;
    while(i<n)
    {
         if(a[i]==1)
            j=i+1;
        while(j<n)
        {
                if(a[j]==0)
                {   int temp=0;
                    temp=a[i];
                     a[i]=a[j];
                     a[j]=temp;
                    //a[i],a[j]=a[j],a[i]
                    break;
                    
                } 
            j++;
        }
          i++;
    }         
             
        
	}
}







 
