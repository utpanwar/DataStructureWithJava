package codingninjas;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	   int s=3*1000000000; //and why this gave negative res 
	   int m=1000000000;
	   int q=3000000000; //why this gave int to large this is sama as s but result different
	   double d = 323.142;
	   byte b = (byte) d; 
	   byte k=(byte)50000000000l;
	   byte h=(byte)50000000000;//why rule number%256 is not applicable here and so that it gave Logger.error
	   
		System.out.println(s);
		System.out.println(m);
		System.out.println(q);
		System.out.println(k);
		System.out.println(h);
		System.out.println(b);
		
		byte qq=100; //as we all know this is integral laterel by deffault int type soprint it
		byte q1=50;
		q1=q1*2;
		byte q2 = (byte)(q1* 2); 
		System.out.println(qq);
		System.out.println(q1);//why it give error while qq and q1 are both same
		System.out.println(q2);//while this wiil run
	}
}