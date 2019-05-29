package homeWork_ripl.it;

import java.util.*;

public class MethodWithStringAnagram195 {
	public static boolean isAnagram(String word1, String word2) {

		word1 = word1.replaceAll(" ", "");
		word2 = word2.replaceAll(" ", "");

		if (word1.length() != word2.length()) {
			return false;
		} else {
			char[] word1Array = word1.toLowerCase().toCharArray();
			char[] word2Array = word2.toLowerCase().toCharArray();
			Arrays.sort(word1Array);
			Arrays.sort(word2Array);
			
			return Arrays.equals(word1Array, word2Array);
		}
			
	}		
				
			
		
	

	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "Silent"));
		isAnagram("earth", "heart");
		isAnagram("star", "rats");
		isAnagram("hi", "bye");
		isAnagram("java", "cava");
	}

}
