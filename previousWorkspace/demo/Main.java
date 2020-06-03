package demo;

public class Main {
   public static void main(String [] args)
   {
	   String str = "H";
	     String strArray[] = str.split(" ");
	     String out []={"A","B","C"}; 
	     out =strArray;
	     for(int i=0;i<out.length;i++)
	      {
	          System.out.println(out[i]);
	      }
   }
}
