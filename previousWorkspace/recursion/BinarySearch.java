package recursion;
import java.util.*;
public class BinarySearch {
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int element = s.nextInt();
		System.out.println(binarySearch(input, element));
	}
	 private static int binarySearch(int arr[], int low,int high,int x) {
         int mid=0;
         if (high >= low) 
         {
             mid =(high + low) / 2;
            
              
		if(arr[mid]==x)
        
            return mid;
        
        else if(arr[mid]>x)
         
         return binarySearch(arr, low, mid - 1, x); 
  
         
         
         
        else if (arr[mid]<x)
            return binarySearch(arr,mid+1,high,x);
         
         }
	
         return -1;
         
 }

	public static int binarySearch(int input[], int element) {
      //  int low=0;
        int high=input.length-1;
		//int mid=(low+high)/2;
           return binarySearch(input,0,high,element);
	}
}
