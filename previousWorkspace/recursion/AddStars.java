package recursion;
import java.util.*;
public class AddStars {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(addStars(input));

	}
	public static String addStars(String s) {
		if(s.length()==1)
        {
            return s.charAt(0)+"";
        }
        String small=addStars(s.substring(0,s.length()-1));
         if(s.charAt(s.length()-1)==small.charAt(small.length()-1))
         {
        	 return small.substring(0)+"*"+s.substring(s.length()-1);
         }
         else
         {
        	 return small+s.charAt(s.length()-1);
         }
        
      
	}

}
