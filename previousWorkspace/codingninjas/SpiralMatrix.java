package codingninjas;
import java.io.*; 
public class SpiralMatrix {
	// Java program to print a given matrix in spiral form 
	


		// Function print matrix in spiral form 
		static void spiralPrint(int r2, int c2, int a[][]) 
		{ 
			int i, r1 = 0, c1 = 0; 
			/* k - starting row index 
			m - ending row index 
			l - starting column index 
			n - ending column index 
			i - iterator 
			*/

			while (r1 < r2 && c1 < c2) { 
				// Print the first row from the remaining rows 
				for (i = c1; i < c2; ++i) { 
					System.out.print(a[r1][i] + " "); 
				} 
				r1++; 

				// Print the last column from the remaining columns 
				for (i = r1; i < r2; ++i) { 
					System.out.print(a[i][c2 - 1] + " "); 
				} 
				c2--; 

				// Print the last row from the remaining rows */ 
				if (r1 < r2) { 
					for (i = c2 - 1; i >= c1; --i) { 
						System.out.print(a[r2 - 1][i] + " "); 
					} 
					r2--; 
				} 

				// Print the first column from the remaining columns */ 
				if (c1 < c2) { 
					for (i = r1 - 1; i >= r1; --i) { 
						System.out.print(a[i][c1] + " "); 
					} 
					c1++; 
				} 
			} 
		} 

		// driver program 
		public static void main(String[] args) 
		{ 
			int R = 2; 
			int C = 2; 
			int a[][] = { { 1, 1}, 
						{ 1,1 }}; 
			spiralPrint(R, C, a); 
		} 
	} 

	// Contributed by Pramod Kumar 


