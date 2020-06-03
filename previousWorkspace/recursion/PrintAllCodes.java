package recursion;
import java.util.Scanner;
public class PrintAllCodes {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		solution3.printAllPossibleCodes(input);
	}
}	
	
 class solution3
	{
	   static char getchar(int n)
	   {
		 return (char) (n+96);
	   }
	  private static void printAllPossibleCodes(String str , String ans)
	    {
		    if (str.length() == 0)
		    {
		        System.out.println(ans);
		        return;
		    }

		    int firstdigi = str.charAt(0)-'0';
		    printAllPossibleCodes(str.substring(1), ans + getchar(firstdigi));

		    if (str.length() >1)
		    {
		        int  firsttwo = (str.charAt(0)-'0')*10 + (str.charAt(1)-'0');
		        

		        if (firsttwo >= 10 && firsttwo<= 26)
		        {
		            printAllPossibleCodes(str.substring(2), ans + getchar(firsttwo));
		        }
	
		    }
	 }

		public static void printAllPossibleCodes(String input)
		{
			printAllPossibleCodes(input , "");
                 
		}
	}




