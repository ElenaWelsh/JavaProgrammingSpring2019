package homeWork_String_munipulations;

import java.util.Scanner;

public class EndsLy {
	public static void main(String[] args) {
		/*
		 * Given a string, return true if it ends in "ly".
		 * 
		 * 
		 * endsLy("oddly") → true endsLy("y") → false endsLy("oddy") → false
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("type a word:");
		String word = scan.next();
		if (word.endsWith("ly")) {
			System.out.println("word ends With ly: " + word.endsWith("ly"));
		} else {
			System.out.println("word ends With ly: " + word.endsWith("ly"));
		}
	}
}