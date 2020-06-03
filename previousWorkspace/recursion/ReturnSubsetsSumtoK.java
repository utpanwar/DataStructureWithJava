package recursion;
import java.util.*;
public class ReturnSubsetsSumtoK {
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
		int k = s.nextInt();
		int output[][] = solutions.subsetsSumK(input, k);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}

  class solutions {

	
	private static int[][] subsetsSumK(int input[], int k, int startI) {
        if(startI==input.length-1)
        {
            int [][] ar=new int[0][0];
            //ar[0][0]=input[startI];
            return ar;
        }
        
        int [][] smallout=subsetsSumK(input,k,startI+1);
        int count;
        int [][] myarr=new int[smallout.length+1][];
        if(input[startI+1]==k)
        {
        	count=1;
        	for(int i=0;i<smallout.length;i++)
        	{	
        		myarr[i] = new int[2];
        	}		
        		
        	myarr[smallout.length] = new int[count];
        }
        else
        {	
        	count=2;
        	for(int i=0;i<=smallout.length;i++)
        	{	
              	myarr[i] = new int[count];
        	}  	
        	//myarr[smallout.length+1] = new int[count];
        }
        
        int j=0;
        for(int i=0;i<smallout.length;i++)
        {
        	for(j=0;j<smallout[i].length;j++)
        	{ 
        		myarr[i][j]=smallout[i][j];
        	}
        }
        for(int i=input.length-1;i>startI;i--)
        {   j=0;
            if(input[startI]+input[i]==k)
            {
            	int  x=input[startI+1] ;
            	int z=input[i-1];
                 myarr[myarr.length-1][j]= input[i];
                		 j++;
                 myarr[myarr.length-1][j]= input[startI];	 
                 break;
            }
            if(input[startI+1]==k)
            {
            	 myarr[myarr.length-1][j]= input[startI+1];
            	 //myarr[myarr.length-1][++j]= Integer.MIN_VALUE;
            	 break;
            }
            if(i==startI+1)
            {
            	myarr=smallout;
            }
        }
//        if(startI==0)
//        { 
//        	if(input[startI]==k)
//        		myarr[myarr.length-1][j]= input[startI];
//        	
//        	myarr=smallout;
//        	
//        	
//        } 	
        return myarr;
	}
    public static int[][] subsetsSumK(int[] input,int k)
    {  
       return subsetsSumK(input,k,0);
    }
}

