package graph;
import java.util.*;

public class runner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N,M,i;
		
		N = scan.nextInt();
		M = scan.nextInt();
		
		String[] Graph = new String[N];
		
		for(i = 0; i < N; i++){
			
			Graph[i] = scan.next();
			
		}
		System.out.println(new solution().solve(Graph,N,M));

	}

}


 class solution {
	
	int solve(String[] Graph , int N, int M)
	{
		String [] m = {"CODINGNINJA"};
		return 1; 
		
	}	
}
