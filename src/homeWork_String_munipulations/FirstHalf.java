package homeWork_String_munipulations;

public class FirstHalf {
public static void main(String[] args) {
	/*Given a string of even length, return the first half.
	 *  So the string "WooHoo" yields "Woo".*/


      String firstHalf = "WooHoo";              // → "Woo"
        firstHalf = "HelloThere";        //   → "Hello"
      firstHalf = "abcdef";           // → "abc"    
      
      
      
      
   if (firstHalf.length()%2==0) {
    	  System.out.println(firstHalf.substring(0,firstHalf.length()/2));
      }else {
    	  System.out.println();
      }
}
}
