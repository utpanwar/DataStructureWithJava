package recursion;
import java.util.*;
 class MergeSort {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		solution.mergeSort(input);
		printArray(input);
	}
}
 class solution {

	private static void mergeSort(int[] arr,int si,int ei){
		   if(si>=ei)
               return;
		int mid =(si+ei)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,ei);
	}
    
    
    public static void mergeSort(int[] input){
		// Write your code here
		mergeSort(input,0,input.length-1);
	}
    private static void merge(int arr[],int si,int ei)
    {
        int mid=(si+ei)/2;
        int ans[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=ei)
        {
            if(arr[i]<arr[j])
            {
                ans[k]=arr[i];
                i++;
                k++;
            }
            else
            {
                ans[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid)
        {
            ans[k]=arr[i];
            i++;
            k++;
        }
        while(j<=ei)
        {
            ans[k]=arr[j];
            k++;
            j++;
        }
        for(int in=0;in<ans.length;in++)
        {
            arr[si+in]=ans[in];
        }
    }
}
