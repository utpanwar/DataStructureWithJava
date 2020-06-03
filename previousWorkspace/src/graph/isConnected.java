package graph;

import java.util.Scanner;

public class isConnected {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
        int edges[][] = new int[V][V];
        for(int i = 0 ; i< edges.length; i++)
        {
            int sv = s.nextInt();
            int ev = s.nextInt();
            edges[sv][ev] = 1;
            edges[ev][sv] = 1;
        }
        boolean ans = dfs(0,edges);
        if(!ans)
            System.out.println("false");
        else System.out.println("true");
	}
	 static boolean dfs(int sv,int edges[][])
	   {
	       boolean visited[] = new boolean[edges.length];
	       boolean arr[]=dfsHelper(0,edges,visited);
	       for(int i =0 ; i<edges.length;i++)
	       {
	           if(!visited[i])
	               return false;
	       }
	       return true;
	   }
	   static boolean [] dfsHelper(int sv,int edges[][],boolean visited[])
	   {   
	       
	       visited[sv]= true;  
	       for(int i =0 ;i<edges.length;i++)
	       {
	           if(edges[sv][i]==1&&!visited[i])
	           {
	             dfsHelper(i,edges,visited);
	           }
	       }
	       return visited;
	   }
	}
