package recursion;
import java.util.Scanner;
public class ReturnAllCode {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String output[]=solution5.printAllPossibleCodes(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}	
	
 class solution5
	{
	   static char getchar(int n)
	   {
		 return (char) (n+96);
	   }
	  public static String[] printAllPossibleCodes(String str)
	    {
		    if (str.length() == 0)
		    {
		        String output[]= {""};
		        return output;
		    }

		    int firstdigi = str.charAt(0)-'0';
		    String [] smalloutput1=printAllPossibleCodes(str.substring(1));
		    String [] smalloutput2=new String[0];
		   
        int firsttwo=0;
		    if (str.length() >=2)
		    {
		    	firsttwo = (str.charAt(0)-'0')*10 + (str.charAt(1)-'0');
		    	  if (firsttwo >= 10 && firsttwo<= 26)
		    	  {
		    		  smalloutput2= printAllPossibleCodes(str.substring(2));	           
		    	  }
		    }
		    
		     String output[]=new String[smalloutput1.length + smalloutput2.length];
		     int k=0;
		    	 for(String s : smalloutput1)
				    {
		    		    char firstdigichar=getchar(firstdigi);
				    	output[k]=firstdigichar+s;
				    	k++;
				    }
		    	 for(String s : smalloutput2)
				    {
		    		    char firsttwodigichar=getchar(firsttwo);
				    	output[k]=firsttwodigichar+s;
				    	k++;
				    }
		   
		    
		    return output;
		    } 
	}
 
 
 
