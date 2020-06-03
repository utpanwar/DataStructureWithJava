package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class pathDfs {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
        int edges2[][] = new int[V][V];
        for(int i = 0; i<edges2.length; i++)
        {
            int sv = s.nextInt();
            int ev = s.nextInt();
            edges2[sv][ev] = 1;
            edges2[ev][sv] = 1;
        }
        int sv1 = s.nextInt();
        int ev1 = s.nextInt();
        ArrayList<Integer> ans = dfs(sv1,ev1,edges2);
        if(ans != null)
        {
            for(int ele : ans)
            { 
              System.out.println(ele+" ");
            }
        }
	}    
       
	static ArrayList<Integer> dfs(int sv , int ev , int edges1[][])
        {
            boolean visited[] = new boolean[edges1.length];
            return dfs(sv,ev,edges1,visited);
        }
      static ArrayList<Integer> dfs(int sv,int ev,int edges[][] , boolean visited[])
        {
          if(sv==ev)
          {
              ArrayList<Integer> ans = new ArrayList<>();
              ans.add(sv);
              return ans;
          }
           visited[sv] = true;
            for(int i = 0; i<edges.length; i++)
            {
                if(edges[sv][i] == 1 && !visited[i])
                {
                  ArrayList<Integer> smallAns=dfs(i,ev,edges,visited);
                  if(smallAns!=null)
               
                  {
                     smallAns.add(sv); 
                      return smallAns;
                  }
                }
            }
                
            return null;
        }      
	}    


