package graph;
import java.util.*;
import java.lang.*;
import java.io.*;
public class CountPathatgivenKedge {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	
		while(t-->0)
		{
		    int v = sc.nextInt();
		 
		    	int g[][]=new int[v][v];
		    for(int i=0;i<v;i++)
		    {
		        for(int j=0;j<v;j++)
		        {
		            g[i][j]=sc.nextInt();
		        }
		    }
		    int s=sc.nextInt();
		    int d=sc.nextInt();
		    int k=sc.nextInt();
		    
		    System.out.println(countwalks(g,s,d,k,v));
		}
	}
	
	static int countwalks(int g[][],int s,int d,int k,int v)
	{
	    if(k==0 && s==d)
	    return 1;
	    
	    if(k==1 && g[s][d]==1)
	    return 1;
	    
	    if(k<=0)
	    return 0;
	    
	    int count=0;
	    
	    for(int i=0;i<v;i++)
	    {
	        if(g[s][i]==1)
	        count=count+countwalks(g,i,d,k-1,v);
	    }
	    return count;
	    
	}

}

//1
//4
//0 1 1 1 0 0 0 1 0 0 0 1 0 0 0 0
//0 
//3
//2