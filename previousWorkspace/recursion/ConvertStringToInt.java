package recursion;
import java.util.*;

public class ConvertStringToInt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(convertStringToInt(input));
  }
	
	public static int convertStringToInt(String str)
	{
		if(str.length()==1)
		{
			return str.charAt(0)-'0';
		}
		int small=convertStringToInt(str.substring(0, str.length()-1));
		int lastd=str.charAt(str.length()-1)-'0';
		return small*10+lastd;
				
	}
}