package codingninjas;
import java.util.Scanner;



public class Compress{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(compress(input));
	}
	public static String compress(String str)
	{
		String res=str.charAt(0)+"";
		int count=1;
		int n=str.length();
		for(int i=1;i<n;i++)
		{
			if(str.charAt(i)==str.charAt(i-1))
			{
				count++;
				 if(i==n-1)
				 {
					 res +=count;
				 }
			}	 
			else
				 {
					 if(count>1)
					 {
						 res +=""+count+str.charAt(i);
						 
					 }
					 else
					 {
						 res +=str.charAt(i);
					 }
					 count=1;
				 }
			}
		
		return res;
	}
}
