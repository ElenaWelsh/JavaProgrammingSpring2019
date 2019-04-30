package day14_string_methods;

public class CharAT {
public static void main(String[] args) {
	
	String word = "computer";
	System.out.println(word.charAt(0));
	System.out.println(word.charAt(1));
	System.out.println(word.charAt(2));
	System.out.println(word.charAt(3));
	System.out.println(word.charAt(4));
	System.out.println(word.charAt(5));
	System.out.println(word.charAt(6));
	System.out.println(word.charAt(7));
	
	
	String word1="Java";
	if (word1.charAt(0) == 'J'){
		System.out.println("J is first char");
		
		String word3 = "civic";
		
		char first = word3.charAt(0);
		char last = word3.charAt(4);
		System.out.println();
		if(first==last) {
			System.out.println("First and last match");
		}else {
			System.out.println("Do not match");
		}
			String word4 = "aaaaaaaaaaaao";
			char lastChar = word4.charAt(word4.length()-1);
			System.out.println(lastChar);
	}
}
}
