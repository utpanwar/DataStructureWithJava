
package graph;
import java.util.*;
public class BfgsList {
             // BFS BY ADJECENCY MATRIX
//public static void main(String args[])
//{
//  Scanner s = new Scanner(System.in);
//  int v =  s.nextInt();
//  int e =  s.nextInt();
// 
//  int edge[][] = new int[v][v];
//  for(int i= 0;i< e;i++)
//  {
//	  int sv = s.nextInt();
//	  int ev = s.nextInt();
//	  edge[sv][ev]=1;
//	  edge[ev][sv]=1;
//  }
//  bfs(edge,v);
//}
//static void bfs(int [][]edge , int v)
//{
//  boolean visited[] = new boolean[v];
//  bfsHelper(edge,0,visited);
//}
//static void bfsHelper(int edge[][] , int sv , boolean visited[] )
//{
//  Queue<Integer> q = new LinkedList<Integer>();
//  q.add(sv);
//  while(!q.isEmpty())
//  {
//	 int ele = q.poll();
//	 visited[ele]=true;
//	 System.out.print(ele+" ");
//	 for(int i = sv; i < edge.length;i++)
//	 {
//		 if(edge[ele][i]==1 && !visited[i])
//		 {
//			 q.add(i);
//			 visited[i]=true;
//		 }
//	 }
//  }
//}
           // BFS BY ADJECENY LIST
public static void main(String args [])
{
	Scanner s = new Scanner(System.in);
	int v = s.nextInt();
	int e = s.nextInt();
	
	ArrayList<ArrayList<Integer>> arr = new 
			ArrayList<ArrayList<Integer>>();
	for(int i =0;i < v;i++)
	{
		arr.add(new ArrayList<Integer>());
	}
	for(int i =0 ; i < e; i++)
	{
		int sv = s.nextInt();
		int ev = s.nextInt();
		addEdge(arr,sv,ev);
	}
	bfs(arr);
}
static void bfs(ArrayList<ArrayList<Integer>> arr)
{
	boolean visited[] = new boolean[arr.size()];
	for(int i =0;i<visited.length;i++)
	{
		if(!visited[i])
		{
			bfsH(arr,i,visited);
		}
	}
	
}
 static void addEdge(ArrayList<ArrayList<Integer>> arr ,
		              int sv ,int ev)
 {
	 arr.get(sv).add(ev);
	 arr.get(ev).add(sv);
 }
 static void bfsH(ArrayList<ArrayList<Integer>> arr , int sv,
		          boolean visited[])
 {
//	 this solution is fails beacuse we have to use queue
//	 for(int i =0 ;i < arr.size();i++)
//	 {
//	   Collections.sort(arr.get(i));
//		 if(!visited[i])
//		 {
//			 System.out.print(i+" ");
//			  visited[i]=true;
//		 }
//		 for(int j =0 ; j<arr.get(i).size();j++)
//		 {
//			 if(!visited[arr.get(i).get(j)])
//			 {
//				 System.out.print(arr.get(i).get(j)+" ");
//				 visited[arr.get(i).get(j)]=true;
//			 }
//		 }
	 Queue<Integer> q = new LinkedList<Integer>();
	 q.add(sv);
	 
	 while(!q.isEmpty())
	 {
		 int ele = q.poll();
		 System.out.print(ele+" ");
		 visited[ele] = true;
		 Collections.sort(arr.get(ele));
		 for(int i = ele,j=0;j<arr.get(ele).size();j++)
		 {
			 if(!visited[arr.get(ele).get(j)])
			 {
				 q.add(arr.get(ele).get(j));
				 visited[arr.get(ele).get(j)] = true;
			  }
		 }
	 }
	}
 }

