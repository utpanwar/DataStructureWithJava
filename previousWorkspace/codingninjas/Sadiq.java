package codingninjas;
import java.util.*;
public class Sadiq {

	public static void main(String[] args) {
	   String s1="sadmq";
	   String s2="rizvi";
	   int n=s1.length();
	   int m=s2.length();
	   String s3="";
	   int j=0,k=1;
	   for(int i=0;i<n/2;i++)
	   {   
		   s3=s3+s2.charAt(j)+"";
		   j=j+2;
	   }
	   s1=s3+s1.substring(n/2);
       String s4="";
       for(int i=m/2;i<m;i++)
	   {
		   s4=s4+s1.charAt(k)+"";
		   if(i<m-2)
		   k=k+2;
	   }
       s2=s2.substring(0,m/2)+s4;
       System.out.println(s1);
       System.out.println(s2);
	}

}
