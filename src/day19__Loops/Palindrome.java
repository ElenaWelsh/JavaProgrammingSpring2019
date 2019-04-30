package day19__Loops;
import java.util.*;
public class Palindrome {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter word:");
	String word = scan.next();
	String reversed = "";
	int idx=word.length()-1;
	while (idx>=0) {
		reversed = reversed +word.charAt(idx);
		idx--;
	}
	System.out.println(reversed);
	if (word.equalsIgnoreCase(reversed)) {
		System.out.println(word + " it  is palindrome");
	} else {
		System.out.println(word + " it  is not palindrome");
	}
	
  }
}

