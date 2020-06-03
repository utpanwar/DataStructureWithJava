package graph;

import java.util.Scanner;

public class Disajtra {
    
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
	dijstra(edges);
}
public static void dijstra(int [][]edges)
{
	int v = edges.length;
	boolean visited[]=new boolean[v];
   	int distance []= new int[v];
   	int parent []= new int[v];
   	distance[0]=0;
   	parent[0]=-1;
   	for(int i =1; i < v; i++)
   	{
   		distance[i]=Integer.MAX_VALUE;
   	}
   	for(int i =0;i<v;i++)
   	{	
   		
   		int minvertex = findMinVertex(distance,visited);
   		visited[minvertex] = true;
   		for(int j=0;j<v;j++)
   		{
   			if(edges[minvertex][j]!=0 && !visited[j])
   			{	
   			   int newD=distance[minvertex]+edges[minvertex][j];
   				if(newD<distance[j])
   					distance[j]=newD;
//   				visited[j]=true;
   			}
   				
   		}
   	}
   		for(int i=1;i<v;i++)
   		{
   			  System.out.println(i+" "+distance[i]);
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
