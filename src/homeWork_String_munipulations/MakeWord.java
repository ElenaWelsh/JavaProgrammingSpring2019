package homeWork_String_munipulations;

public class MakeWord {
 public static void main(String[] args) {
	/*Given an "out" string length 4, such as "<<>>", and a word, 
	 * return a new string where the word is in the middle of the out string,
	 *  e.g. "<<word>>". Note: use str.substring(i, j) to extract the String
	 *   starting at index i and going up to but not including index j.


             makeOutWord("<<>>", "Yay") → "<<Yay>>"
             makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
             makeOutWord("[[]]", "word") → "[[word]]"        */
	     
	          String str = "<<>>";
	          String yay ="Yay";
	          String wh= "WooHoo";
	          String str1 = "[[]]";
	          String w = "word";
	        System.out.println(str.substring(0,2).concat(yay)+str.substring(2));
	        System.out.println(str.substring(0,2).concat(wh)+str.substring(2));
	        System.out.println(str1.substring(0,2).concat(w)+str1.substring(2));
	 
	 
	 
}
}
