//short(16 bit) 2byte=   10^4*3times
//int(32 bit) 4byte=     10^9*2times
//long(64 bit)8 byte=    10^18*9times


//Initial Template for Java
//Initial Template for C++
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
class GfG
{
    
    
	public static void main (String[] args)
	{
    	 Scanner sc = new Scanner(System.in);
    	 int t = sc.nextInt();
    	 
    	 boolean flag = false;
    	 while(t-- > 0){
    	   String s1=sc.next();
    	   String s2=sc.next();
    	   Geeks obj=new Geeks();
    	   System.out.println(obj.coutChars(s1,s2));
    	   
    	 }
    }
}
//Position this line where user code will be pasted.


/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*Function to count number of characters 
* to make s1 and s2 equal
* s1 : first string
* s2 : second string
*/

class Geeks{
    
    static int coutChars(String s1, String s2)
    {  String str1,str2;
       int count=0,j=0; 
       int n=s1.length();
       int m=s2.length();
       if(Math.max(n,m)==n)
       {
           str1=s1;str2=s2;
       }
       else
       {
           str1=s2;str2=s1;
       }
        
       int count1=(int)(Math.max(n,m)-Math.min(m,n));
       for(int i=0;i<Math.min(n,m);i++)
       {
           for( j=0;j<Math.max(n,m);j++)
           {
               if(str2.charAt(i)==str1.charAt(j))
               {  String s=str2.charAt(j)+"";
                  String f="\0";
                   str2=str2.replaceFirst(s,f);
                   break;
                 
               }
           }
           if(Math.max(n,m)==j)
            count=count+2;
       }
       count +=count1;
       return count;
    }
}