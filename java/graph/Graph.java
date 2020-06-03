package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph {
	//DFS
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int v=s.nextInt();
		int e=s.nextInt();
		int edges[][] =new int[v][v];
		for(int i=0;i<e;i++)
		{
			int sv=s.nextInt();
			int ev=s.nextInt();
			edges[sv][ev]=1;
			edges[ev][sv]=1;
		}
		print(edges,0);
	}
// public static void printHelper(int edges[][] , int sv,boolean visited[])
// {
//	 System.out.println(sv);
//	 visited[sv]=true;
//	 int n = edges.length;
//	 for(int i = 0; i < n;i++)
//	 {
//		 if(edges[sv][i]==1 && !visited[i])
//			 printHelper(edges,i,visited); 
//	 }
// }
// public static void print(int edges[][] , int sv)
// {
//	 boolean visited[]=new boolean[edges.length];
//	 for(int i =0 ; i < edges.length;i++)
//	 {
//         if(!visited[i])		 
//		  printHelper(edges,i,visited);
//	 }
// }
	
 public static void print(int edges[][] , int sv)
 {
	 boolean visited[]=new boolean[edges.length];
	 ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
	 ArrayList<Integer> arr1=new ArrayList<Integer>();
	 for(int i =0 ; i < edges.length;i++)
	 {
         if(!visited[i])		 
		  arr1=printHelper(edges,i,visited,arr1);
         arr.add(arr1);
	 }
	 for(ArrayList<Integer> a : arr)
	 {
		 for(Integer b : arr1)
		 {
			 System.out.println(b);
		 }
	 }
 }
 public static ArrayList<Integer> printHelper(int edges[][] , 
		 Integer sv,boolean visited[],ArrayList<Integer> arr)
 {
//	 System.out.println(sv);
	 visited[sv]=true;
	 int n = edges.length;
	 ArrayList<Integer> arr1 = new ArrayList<Integer>();
	 for(int i = 0; i < n;i++)
	 {
		 if(edges[sv][i]==1 && !visited[i])
		 {
			  arr1 =printHelper(edges,i,visited,arr); 
//			 arr.add(arr1);
		 }
	 }
	 arr1.add(sv);
	 return arr1;
 }
}
//5
//5
//1 2 2 4 4 5 5 3 3 1


//3
//3
//0 1
//0 2
//1 2

//3
//3
//0 1
//1 2
//2 1