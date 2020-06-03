package recursion;
import java.util.*;
public class ReplaceCharacter {
static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
    	String input = s.next();
    	System.out.println(removeConsecutiveDuplicates(input));
	}
	public static String removeConsecutiveDuplicates(String str) {
		 if(str.length()==1)
      {
          return str;
      }
     
       String small=removeConsecutiveDuplicates(str.substring(1));
         String ans="";
       if(str.charAt(0)==small.charAt(0))
       {
           ans=str.charAt(0)+small.substring(1);
       }
       else
       {
           ans=ans+str.charAt(0)+small;
       }
       return ans;
	}
}
