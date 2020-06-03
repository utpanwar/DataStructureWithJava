package RandomGeeks;

public class Demos
{ 
public static void main(String args [ ]) 
{ 
	int numRay[] = {4, 2, 4, 5, 2, 3, 1,4}; 

	for(int i = 0; i < numRay.length; i++) 
		numRay[numRay[i]%10] = numRay[numRay[i]%10] + 10; 
System.out.println("The repeating elements are : "); 
	for(int i = 0; i < numRay.length; i++) 
			if(numRay[i] > 19) 
					System.out.println(i+" ");											 
} 
} 
