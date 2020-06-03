package codingninjas;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		String s = "*";
		for(int i=a-1;i>=1;i--) s+="0";
		s+="*";
		for(int i=a-1;i>=1;i--) s+="0";
		s+="*";
		System.out.println(s);
		int swp = 0;
		int l = s.length();
		StringBuilder string = new StringBuilder(s);
		for(int i=a-1;i>=1;i--) {
			char c = string.charAt(swp);
			string.setCharAt(swp, string.charAt(swp+1));
			string.setCharAt(swp+1, c);
			char aa = string.charAt(l-swp-1);
			string.setCharAt(l-swp-1, string.charAt(l-swp-2));
			string.setCharAt(l-swp-2, aa);
			System.out.println(string);
			swp+=1;
		}
	}
}
