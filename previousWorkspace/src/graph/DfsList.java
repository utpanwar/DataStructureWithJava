package graph;
import java.lang.reflect.Array;
import java.util.*;

public class DfsList {

	public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int v = s.nextInt();	
       int e = s.nextInt();	
       ArrayList<ArrayList<Integer>> arr = 
    		   new ArrayList<ArrayList<Integer>>();
       for(int i =0 ; i < v; i++)
       {
    	   arr.add(new ArrayList<Integer>());
       }
       for(int i =0 ;i < e; i++)
       {
    	    int sv = s.nextInt();
    	    int ev = s.nextInt();
    	    addEdge(arr,sv,ev);
       }
       bfslist(arr);
	}
    static void addEdge(ArrayList<ArrayList<Integer>> arr,int sv ,int ev)
    {
    	arr.get(sv).add(ev);
    	arr.get(ev).add(sv);
    }
   static void bfslist(ArrayList<ArrayList<Integer>> arr) 
   {
	   boolean visited[] = new boolean[arr.size()];
	   for(int i = 0 ;i < arr.size();i++)
	   {
		   if(!visited[i])
		   {
			   bfslistH(arr,i,visited);
		   }
	   }
   }
  static void bfslistH(ArrayList<ArrayList<Integer>> arr
		,int sv,boolean visited[]) 
  {
	  if(!visited[sv])
	  {
		  System.out.print(sv);
		  visited[sv]=true;
	  }
	  
	  for(int  i= 0; i< arr.get(sv).size();i++)
	  {
		  if(!visited[arr.get(sv).get(i)])
		  {
			  bfslistH(arr,arr.get(sv).get(i),visited); 
		  } 
	  }
  }

}

//4 4
//0 1
//0 3
//1 2
//3 2

	
	