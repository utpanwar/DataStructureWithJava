package graph;

import java.util.Scanner;

public class Primsalgo {
        
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int v=s.nextInt();
		int e=s.nextInt();
		int [][]edges= new int[v][v];
		for(int i=0;i<e;i++)
		{
			int sv=s.nextInt();
			int ev=s.nextInt();
			int weight =s.nextInt();
			edges[sv][ev]=weight;
			edges[ev][sv]=weight;
		}
		prims(edges);
	}
	public static void prims(int [][]edges)
	{
		int v = edges.length;
		boolean visited[]=new boolean[v];
	   	int w []= new int[v];
	   	int parent []= new int[v];
	   	w[0]=0;
	   	parent[0]=-1;
	   	for(int i =1; i < v; i++)
	   	{
	   		w[i]=Integer.MAX_VALUE;
	   	}
	   	for(int i =0;i<v;i++)
	   	{	
	   		
	   		int minvertex = findMinVertex(w,visited);
	   		visited[minvertex] = true;
	   		for(int j=0;j<v;j++)
	   		{
	   			if(edges[minvertex][j]!=0 && !visited[j])
	   			{
	   				if(edges[minvertex][j]<w[j])
	   				{
	   					w[j]=edges[minvertex][j];
                    	parent[j]=minvertex;   					
	   				}
//	   				visited[j]=true;
	   			}
	   				
	   		}
	   	}
	   		for(int i=1;i<v;i++)
	   		{
	   		  if(parent[i] < i)
	   		  {
	   			  System.out.println(parent[i]+ "  "+i+" "+w[i]);
	   		  }
	   		  else
	   		  {
	   			System.out.println(i+" "+parent[i]+ "  "+w[i]);
	   		  }
	   		}
	   	
	}
	private static int findMinVertex(int [] weight,boolean visited[])
	{
		int minvertex =-1;
		for(int i=0; i<weight.length;i++)
		{
			if(!visited[i] && ( minvertex == -1 || weight[i] < weight[minvertex]))
			{
				minvertex=i;
			}
		}
		return minvertex;
	}
}

//5 7
//0 1 7
//0 2 8
//1 2 2
//1 3 6
//2 3 3
//2 4 9
//3 4 6
