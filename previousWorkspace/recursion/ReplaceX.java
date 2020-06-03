package recursion;

import java.util.Scanner;

public class ReplaceX {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(ut1.replace(input));
	}

}
class ut1{
	public static String replace(String str)
	{
	   String output;
	    if(str.length()<=1)
	    {  
	    	if(str.charAt(0)=='x')
	    	{
	    		return str.substring(1);
	    	}
	    	return str;
	    }
	    String small=replace(str.substring(1));
	    if(str.charAt(0)=='x')//pehle yaha m smaa pr iterate kr rha tha so x at 0 remove nhi
	    	// ho rha tha isliye str pr iterate kiya ha
	    {
//	    	output=str.substring(1);
	    	output=small;
	    }
		/*
		 * else if(small.charAt(0)=='x') { output=small.substring(1); }
		 */
	    else
	    {
	    	output=str.charAt(0)+small;
	    }
	   return output; 
	}
}