package recursion;
import java.util.*;
public class Keypad {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		String output[] = keypad(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
	
	public static String[] keypad(int n){
		int z=n;
	int count=0;
		while(z!=0)
		{
			z=z/10;
			count++;
		}
		if(count==1)
		{
			char aar[]=getCharacters(n);
		  String s[]= new String[aar.length];
		  for(int i=0;i<aar.length;i++)
		  {
			  s[i]=aar[i]+"";
		  }
		  return s;
		}
		String SmallAns[]=keypad(n/10);
		char arr[]=getCharacters(n%10);
//		int length=1;
//		if(SmallAns.length!=0)
//		{
//			int j=SmallAns.length;
//			while(n!=0)
//			{
//				length=length*3;
//				n=n/10;
//			}
//		}
		int len=Math.max(SmallAns.length, arr.length);
		int min=Math.min(SmallAns.length, arr.length);
		String ans[]=new String[len*min];
		int j=arr.length;
		int m=0,d=0;
		int count1=0;
		for(int i=0;i<ans.length;i++)
		{  
			if(count1==j)
			{
				m++;
				count1=0;
			}
			
			count1++;
			ans[i]=SmallAns[m]+arr[d];
			d++;
			if(d==arr.length)
			{
				d=0;
			}
		}
//		for(int i=0;i<length;i++)
//		{
//			ans[i]=arr[i]+"";
//		}
		
          return ans;
	}

	 private static  char[] getCharacters(int x)
	 {
	     char[] arr;
	     switch (x)
	     {
	         case 0: arr = new char[1]; 
	         arr[0]= '0';
	             return arr;
	         case 1: arr = new char[1];
	         arr[0]='1';
	            return arr;
	         case 2: arr = new char[3];
	         arr[0]='a';
	         arr[1]='b';
	         arr[2]='c';
	             return arr;
	         case 3: arr = new char[3];
	         arr[0]='d';
	         arr[1]='e';
	         arr[2]='f';
	             return arr;
	         case 4: arr = new char[3];
	         arr[0]='g';
	         arr[1]='h';
	         arr[2]='i';
	             return arr;
	         case 5: arr = new char[3];
	         arr[0]='j';
	         arr[1]='k';
	         arr[2]='l';
	             return arr;
	         case 6: arr = new char[3];
	         arr[0]='m';
	         arr[1]='n';
	         arr[2]='o';
	             return arr;
	         case 7: arr = new char[4];
	         arr[0]='p';
	         arr[1]='q';
	         arr[2]='r';
	         arr[3]='s';
	             return arr;
	         case 8: arr = new char[3];
	         arr[0]='t';
	         arr[1]='u';
	         arr[2]='v';
	             return arr;
	         case 9: arr = new char[4];
	         arr[0]='w';
	         arr[1]='x';
	         arr[2]='y';
	         arr[3]='z';
	             return arr;
	         default: return null;
	     }
	 }

	
}
