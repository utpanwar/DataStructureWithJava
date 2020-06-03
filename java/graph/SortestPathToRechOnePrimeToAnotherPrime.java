package graph;
import java.util.*;
public class SortestPathToRechOnePrimeToAnotherPrime {
	static ArrayList<Integer> pset; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1033, num2 = 8179; 
//		ArrayList<Integer> l[] = new ArrayList[V];  
		System.out.print(shortestPath(num1, num2)); 
		
	}

	

	// Finding all 4 digit prime numbers 
	static void SieveOfEratosthenes() 
	{   pset = new ArrayList<Integer>();
		// Create a boolean array "prime[0..n]" and initialize 
		// all entries it as true. A value in prime[i] will 
		// finally be false if i is Not a prime, else true. 
		int n = 9999,count=0; 
		boolean prime[]=new boolean[n+1]; 
//		memset(prime, true, sizeof(prime)); 
        Arrays.fill(prime, true);
		for (int p = 2; p * p <= n; p++) { 

			// If prime[p] is not changed, then it is a prime 
			if(prime[p] == true) { 

				// Update all multiples of p 
				for (int i = p * p; i <= n; i += p) 
					prime[i] = false; 
			} 
		} 

		// Forming a vector of prime numbers 
		for (int p = 1000; p <= n; p++) 
		{
			if (prime[p]) 
				pset.add(p); 
		}
			
		count++;
	} 

	// in1 and in2 are two vertices of graph which are 
	// actually indexes in pset[] 
	static int bfs(int in1, int in2,int V) 
	{ 
		int visited[]=new int[V];
		for(int i =0 ; i<visited.length;i++)
		{
			visited[i]=0;
		}
//		memset(visited, 0, sizeof(visited)); 
		Queue<Integer> que= new  LinkedList<>(); 
		visited[in1] = 1; 
		que.add(in1); 
//		list<int>::iterator i; 
//		Iterator<Integer> i = Li
		while (!que.isEmpty()) { 
     		int p = que.element(); 
			que.poll(); 
			for (i = l[p].size(); i != l[p].end(); i++) { 
				if (!visited[*i]) { 
					visited[*i] = visited[p] + 1; 
					que.push(*i); 
				} 
				if (*i == in2) { 
					return visited[*i] - 1; 
				} 
			} 
		} 
	} 
     
	// Returns true if num1 and num2 differ 
	// by single digit. 
	static boolean compare(int num1, int num2) 
	{ 
		// To compare the digits 
		String sw = Integer.toString(num1);
		char []s1 = sw.toCharArray(); 
		String sm = Integer.toString(num2);
		char []s2 = sm.toCharArray(); 
//		string s2 = to_string(num2); 
		int c = 0; 
		if (s1[0] != s2[0]) 
			c++; 
		if (s1[1] != s2[1]) 
			c++; 
		if (s1[2] != s2[2]) 
			c++; 
		if (s1[3] != s2[3]) 
			c++; 

		// If the numbers differ only by a single 
		// digit return true else false 
		return (c == 1); 
	} 


	static int shortestPath(int num1, int num2) 
	{ 
//		
		SieveOfEratosthenes(); 

		graph1m g=new graph1m(pset.size()); 
		for (int i = 0; i < pset.size(); i++) 
			for (int j = i + 1; j < pset.size(); j++) 
				if (compare(pset.get(i), pset.get(j))) 
					g.addedge(i, j);	 
		

		// Since graph nodes represent indexes of numbers 
		// in pset[], we find indexes of num1 and num2. 
		int in1 = 0, in2=0; 
		for (int j = 0; j < pset.size(); j++) 
			if (pset.get(j) == num1) 
				in1 = j; 
		for (int j = 0; j < pset.size(); j++) 
			if (pset.get(j) == num2) 
				in2 = j; 

		return 0;  
//				bfs(in1, in2,pset.size()); 
	} 
	
}


class graph1m { 
 int V; 
//	list<int>* l; 
	ArrayList<Integer> l[];
public	graph1m(int V) 
	{ 
		this.V = V; 
//		l = new list<int>[V]; 
		l = new ArrayList[V]; 
		
	} 
void addedge(int V1, int V2) 
{   l[V1]= new ArrayList<>();
    l[V2]= new ArrayList<>();
	l[V1].add(V2); 
	l[V2].add(V1); 
} 
//	int bfs(int in1, int in2); 
}