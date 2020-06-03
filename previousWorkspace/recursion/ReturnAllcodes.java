package recursion;
import java.util.Scanner;
public class ReturnAllcodes {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String output[]=solution4.printAllPossibleCodes(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}	
	
 class solution4
	{
	   static char getchar(int n)
	   {
		 return (char) (n+96);
	   }
	  private static String[] printAllPossibleCodes(String str , String ans)
	    {
		    if (str.length() == 0)
		    {
		        String ut[]=ans.split(" ");
		        return ut;
		    }

		    int firstdigi = str.charAt(0)-'0';
		    String [] output=printAllPossibleCodes(str.substring(1), ans + getchar(firstdigi));
		   
         //   String [] arr=new String[output.length];
        
		
//            for(int i=0;i<arr.length;i++)
//            {
//               arr[i]=output[i];
//            } 
            String am[]= {""};
		    if (str.length() >1)
		    {
		        int  firsttwo = (str.charAt(0)-'0')*10 + (str.charAt(1)-'0');
		        

		        if (firsttwo >= 10 && firsttwo<= 26)
		        {
		           String out[]= printAllPossibleCodes(str.substring(2), ans + getchar(firsttwo));
                   am=out;		           
		        }
	
		    }
		   // 
		    if(str.length()>1)
		    {  String arr1[]=new String[am.length + output.length];
		    	 for(int i=0;i<output.length;i++)
				    {
				    	arr1[i]=output[i];
				    }
		    	   int k=0;
				    for(int j=output.length;j<am.length+output.length;j++)
				    {
				    	//if(str.length()>1)
				    	arr1[j]=am[k];
				    	k++;
				    	//arr1[j]=null;
				    }
				    return arr1;
		    }
		   
		    
		    return output;
		    } 

		public static String[] printAllPossibleCodes(String input)
		{
			 
					return printAllPossibleCodes(input , "");
                 
		}
	}




