package DP1;

import java.util.Scanner;

public class CoinTower {
public static void main(String[] args) {
		
		int x,n,y;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		x = scan.nextInt();
		y = scan.nextInt();
		System.out.println(new solution4().solve(n,x,y));
	}
}

 class solution4 {

	public  String solve(int n,int x,int y){
		
		if(n==0)
            return "";
        if(n<0)
            return -1;
		
	}
	
}