package Demo;

import java.util.*;

import org.omg.PortableInterceptor.INACTIVE;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();

		int size = scan.nextInt();
		for(int i = 0; i < size; i++)
			arr.add(scan.nextInt());

		System.out.println(solution.lengthOfLongestSubsetWithZeroSum(arr));
		scan.close();
	}
}



class solution 
{
    public static int lengthOfLongestSubsetWithZeroSum(ArrayList<Integer> arr) 
   	{
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		int sum=0;int count=0,count1=0,sum1=0;
		arr1.add(0);
		for(int i=0;i<arr.size();i++)
		{
			sum=sum+arr.get(i);
			
			if(arr1.contains(sum))
			{
//				for(int j=0;j<arr1.indexOf(sum);j++)
//				{
//					arr1.remove(j);
//					
//				}
//				int j=0;
//				while(arr1.contains(sum))
//				{
//					arr1.remove(j);
//					
//				}
				int a=arr1.size();
//				count=a-arr1.indexOf(sum);
				count=Math.max(count,a-arr1.indexOf(sum));
//				arr1.add(sum);
//				arr1.add(0);
			}
//             else if(sum==0){
//				return arr.size();
//		}
			
			
				arr1.add(sum);
			
		}	
//		sum1=sum;
//			count1=count;
//			if(count>count1)
//				return count;
		

		return count;
	}
	
	//gfg sol
//	public static int lengthOfLongestSubsetWithZeroSum(ArrayList<Integer> arr) {
//		// Creates an empty hashMap hM 
//        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>(); 
//  
//        int sum = 0; // Initialize sum of elements 
//        int max_len = 0; // Initialize result 
//  
//        // Traverse through the given array 
//        for (int i = 0; i < arr.size(); i++) { 
//            // Add current element to sum 
//            sum +=arr.get(i);
//  
//            if (arr.get(i) == 0 && max_len == 0) 
//                max_len = 1; 
//  
//            if (sum == 0) 
//                max_len = i + 1; 
//  
//            // Look this sum in hash table 
//            Integer prev_i = hM.get(sum); 
//  
//            // If this sum is seen before, then update max_len 
//            // if required 
//            if (prev_i != null) 
//                max_len = Math.max(max_len, i - prev_i); 
//            else // Else put this sum in hash table 
//                hM.put(sum, i); 
//        } 
//  
//        return max_len; 
//  
//	}
}

//20
//-223 -163 56 -375 352 148 -167 421 -365 189 20 -127 -283 187 218 -435 -123 388 -171 -372 
//5
//1  2  -2  4  -4

// 1 3 -1 2 -4 1
// 8
//1 -2 2 3 -6 -3 -6 9 5



