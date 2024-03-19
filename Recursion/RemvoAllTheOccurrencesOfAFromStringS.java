package Recursion;

import java.util.*;

public class RemvoAllTheOccurrencesOfAFromStringS {
	static String RemoveOccurrence(String s, int idx) {
		// base case
		if (idx == s.length()) return "";

		// recursive work
		String smallAns = RemoveOccurrence(s, idx + 1);
		char currChar = s.charAt(idx);

		// self Work
		if (currChar != 'a') return currChar + smallAns;
		 else return smallAns;
		
	}

	public static void main(String[] args) {
//		String s ="abcax";
//		int n=s.length();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(RemoveOccurrence(s, 0));
	}
}
