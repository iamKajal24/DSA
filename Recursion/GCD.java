package Recursion;

import java.util.Scanner;

public class GCD {
	static int GCD(int x,int y) {
		if(y==0) return x;
		return GCD(y, x%y);
	}
	static int iGCD(int x,int y) {
		while(x%y!=0) {
			int rem=x%y;
			x=y;
		    y=rem;
		}
		return y;
	}
     
	static int LCM(int x,int y) {
		return (x*y)/GCD(x,y);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int x = sc.nextInt();
		int y = sc.nextInt();
	    System.out.println(" GCD : " + iGCD(x, y));
		System.out.println("GCD : " + GCD(x,y));
         System.out.println("LCM " + LCM(x, y));
	}
}
