package DP1;

public class Fibonacci {
  public static void main(String args[]) {
//	  System.out.println(fib(4));
	  System.out.println(fibDP(4));
  }
  
  public static int fib(int n)
  {
	  int storage[] =new int[n+1]; 
     for(int i =0;i<=n;i++)
     {
    	 storage[i]=-1;
     }
     return fibM(n,storage);
  }
  public static int fibM(int n,int storage[])
  {
	  if(n==0||n==1)
	  {
		  storage[n]=n;
	  }
	  if(storage[n]!=-1)
		  return storage[n];
	  return fibM(n-1,storage) + fibM(n-2,storage);
  }
  public static int fibDP(int n)
  {
	  int storage[] = new int[n+1];
	  storage[1] = 1;
	  for(int i = 2;i<=n;i++)
	  {
		  storage[i] = storage[i-1]+storage[i-2];
	  }
	  return storage[n];
  }
}
