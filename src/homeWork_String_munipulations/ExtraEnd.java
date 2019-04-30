package homeWork_String_munipulations;

public class ExtraEnd {
	public static void main(String[] args) {
		
	
/*Given a string, return a new string made of 3 copies of the last 2 chars
 *  of the original string. The string length will be at least 2.
 */


               String word = "Hello";// → "lololo"
                word ="ab";   //) → "ababab"
               word = "Hi";   // → "HiHiHi"
	           if (word.length()>=2) {
              
              System.out.println(word.substring(word.length()-2)+word.substring(word.length()-2)
              +word.substring(word.length()-2));
              }    
}
}