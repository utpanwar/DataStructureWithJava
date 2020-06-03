package graph;
//kosaraju algorithm
import java.util.*;
public class MotherVertex {
	public static void main(String args[])
	{
		Scanner s  =new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
			int v = s.nextInt();
			int e = s.nextInt();
			LinkedList<Integer> adj[] = new LinkedList[v];
			for(int i =0 ;i < v; i++)
			{
				adj[i] = new LinkedList<Integer>();
			}
			for(int i = 0; i< e; i++ )
			{
				int sv = s.nextInt();
				int ev = s.nextInt();
				addEdge(adj , sv,ev);
			}
			Stack<Integer> st = new Stack<Integer>();
			motherV(adj,st,v);
		}
//		System.out.print(st.pop());
	}
	static void addEdge(LinkedList<Integer> adj[],int sv , int ev)
	{
	  	adj[sv].add(ev);
//	  	adj[sv].isEmpty();
	}
	static void motherV(LinkedList<Integer> adj[],Stack<Integer> st , int  v)
	{
		boolean[] visited = new boolean[v];
		for(int i =0 ; i < v ; i++)
		{
			Iterator<Integer> it = adj[i].listIterator();
			if(it.hasNext())
			{
				motherVH(adj,st,i,visited);
			}
			if(!(st.size()==v))
			{
				st.clear();
				visited = new boolean[v];
				continue;
			}
			else
			{
			System.out.println(st.peek());
				break;
			}
		}
		if(!(st.size()==v))
		{
			System.out.print("-1");
		}
	}
	static void motherVH(LinkedList<Integer> adj[],Stack<Integer> st,
			            int sv,boolean visited[])
	{
		Iterator<Integer> it1 = adj[sv].listIterator();
		int n1=0;
		if(it1.hasNext())
		{
			 n1 = it1.next();
		}
		if(adj[sv].isEmpty() || visited[n1] == true )
		{
			st.add(sv);
			visited[sv] =true;
			return ;
		}
		visited[sv]=true;
		Iterator<Integer> it = adj[sv].listIterator();
		while(it.hasNext())
		{
			int n = it.next(); 
            if (!visited[n]) 
            {
            	motherVH(adj,st,n,visited); 
//            	st.add(sv);            	
            }
		}
//		if(!visited[sv])
//		{
//			visited[sv] =true;
			st.add(sv);  
//		}
		
	}
}	


//7 8
//0 1
//0 2
//1 3
//4 1
//6 4
//5 6
//5 2
//6 0
//2
//5 5
//1 0 
//0 2
//2 1
//0 3
//3 4
//3 2
//0 1
//2 1
