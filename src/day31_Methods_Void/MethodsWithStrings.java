package day31_Methods_Void;

import java.util.Arrays;

public class MethodsWithStrings {
public static void main(String[] args) {
	countWords("I love Java");
	googleSearchResults("About 121,000,000 results (0.75 seconds)");
}



public static void countWords(String sentence ) {
  String[] words= sentence.split(" ");
  int i=words.length;
   System.out.println(Arrays.toString(words));
   System.out.println("Number of words: " + i);
}

public static void googleSearchResults( String result) {//"About 121,000,000 results (0.75 seconds)");
  String[ ]words = result.split(" ");
  String count=words[1].replace(",", "");
  String seconds = words[3].replace("(", "");
  System.out.println("Search:"+ count);
  System.out.println("Time"+ seconds);
}
}