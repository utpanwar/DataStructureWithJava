package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class pathBfs {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
        int edges[][] = new int[V][V];
        for(int i =0 ; i< edges.length; i++)
        {
            int sv = s.nextInt();
            int ev = s.nextInt();
            edges[sv][ev]=1;
            edges[ev][sv]=1;
        }
        int sv = s.nextInt();
        int ev = s.nextInt();
        ArrayList<Integer> ans = bfs(sv,ev,edges);
	}
	
	 static ArrayList<Integer> bfs(int sv , int ev , int edges[][] )
	    {
	        boolean visited[] =new boolean[edges.length];
	        ArrayList<Integer> ans=bfs(sv,ev,edges,visited);
			return ans;
	    }
	 
	 
	 static ArrayList<Integer> bfs(int sv,int ev,int edges[][], boolean visited[])
	    {
	        HashMap<Integer,Integer> map = new HashMap<>();
	        Queue<Integer> q = new LinkedList<Integer>();
	        q.add(sv);
	        while(q.poll()!=ev)
	        {
	        	int ele=0;
	            if(!q.isEmpty())
	        	ele = q.remove();
	            visited[ele] = true;
	            // System.out.println(ele);
	            for(int i = 0 ; i<edges.length; i++)
	            {
	                if(edges[ele][i]==1 && !visited[i])
	                {
	                    q.add(i);
	                    map.put(i,ele);
	                    if(q.peek()==ev)
	                        break;
	                }
	            }
	        }
	        ArrayList<Integer> ans1 = new ArrayList<Integer>();
	        return ans1;
	    }
}


//4
//4
//0 1
//0 3
//1 2
//2 3




