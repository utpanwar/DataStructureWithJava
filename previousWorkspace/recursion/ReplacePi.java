package recursion;

import java.util.Scanner;

public class ReplacePi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(ut.replace(input));
	}

}
class ut{
	public static String replace(String str)
	{
	   String output;
	    if(str.length()<=1)
	    {
	    	return str;
	    }
	    String small=replace(str.substring(1));
	    if(str.charAt(0)=='p'&&small.charAt(0)=='i')
	    {
	    	output="3.14"+small.substring(1);
	    }
	    else
	    {
	    	output=str.charAt(0)+small;
	    }
	   return output; 
	}
}