package graph;
import java.lang.reflect.Array;
import java.util.*;
//public class CountPathbetweentwoEdge {
//   static int count;
//	public static void main(String[] args) {
//       Scanner s = new Scanner(System.in);	
//       int V = s.nextInt();
//       int e = s.nextInt();
//       int edge[][] = new int[V][V];
//       for(int i = 0;i<e;i++)
//       {
//    	   int u = s.nextInt();
//    	   int v = s.nextInt();
//    	   edge[u][v]=1;
//       }
//       boolean visited[]= new boolean[V];
//       int source = s.nextInt();
//       int dest = s.nextInt();
////       int count = 0;
//       int a = dfs(edge,visited,source,dest);
//       System.out.print((a-1));
//	}
//   static int dfs(int edge[][],boolean visited[],int u,int d)
//   {  
//	   visited[u]=true;
//	   for(int i = 0;i<edge.length;i++)
//	   {
//		   if(edge[u][i]==1 && !visited[i])
//		   {
//			   dfs(edge,visited,i,d);
//		   }
//		   if(u==d)
//			    count++;
//	   }
//	   int c = count;
//	   return count;
//   }
//}
//5 7
//0 1
//0 2
//0 4
//1 4
//1 3
//2 4
//3 2
//0
//4


public class CountPathbetweentwoEdge {
	 static Scanner S = new Scanner(System.in);
	static int V = S.nextInt();
	static int e = S.nextInt();
	static int k = S.nextInt();
   static	ArrayList<Integer> arr[] = new ArrayList[V];
   static int ar[] = new int[k+1];
  
	 public static void main(String args [] )
	 {
		 for(int  i= 0; i <=k;i++)
		   {
			   ar[i]=-1;
		   }
		 for(int i =0 ; i< V ; i++)
		 {
		   	 arr[i]= new ArrayList<Integer>();
		 }
		 for(int i = 0 ; i < e; i++)
		 {
			 int u = S.nextInt();
			 int v = S.nextInt();
			 arr[u].add(v);
//			 arr[v].add(u);
		 }
		 int s = S.nextInt();
		 int d = S.nextInt();
		 System.out.print(countPath(s,d));
	 }
	 static int countPath(int s,int d ) 
	 {
		 boolean visited[] = new boolean[V];
		 int pathCount = 0;
		 pathCount=countPathH(s,d,visited,pathCount,arr,ar);
		 return pathCount;
	 }
	 static int countPathH(int u,int d,boolean visited[] , int pathCount,
			 ArrayList<Integer> arr[],int ar[])
	 {
		 visited[u] = true;
		 if(ar[k]==-1)
		 {
			 for(int  i= 0; i<= k ;i++)
			 {
				 if(ar[i]==-1)
				 {
					 ar[i]=u;
					 break;
				 }
					
			 }
		 }
		 
		  if(ar[k]==d)
		  {   visited[u] = false;
              ar[k]=-1;			  
			  return ++pathCount;
		  }
		 if(ar[k]!=d && ar[k]!=-1)
		 {   visited[u] = false; 
			 ar[k]=-1;	
			 return pathCount;
		 }
//		 if (u == d)  
//		 { 
//			 pathCount++; 
//		 } 
		 
		 else
		 { 
			 Iterator<Integer> it = arr[u].listIterator(); 
			 while (it.hasNext())  
			 { 
				 int n = it.next(); 
				 if (!visited[n])  
				 { 
					 pathCount = countPathH(n, d, 
							 visited, 
							 pathCount,arr,ar); 
				 } 
			 } 
		 }
		for(int i =k;i>=0;i--)
		{
			if(ar[i]!=-1)
			{
				ar[i]=-1;
				break;
			}
		}
	 visited[u] = false; 
		 return pathCount; 
	 }
}



//4
//6
//2
//0 1
//0 2
//0 3
//2 0
//2 1
//1 3
//2 
//3
