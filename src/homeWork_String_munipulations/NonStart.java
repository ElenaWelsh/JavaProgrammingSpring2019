package homeWork_String_munipulations;

public class NonStart {
public static void main(String[] args) {
	
	/*Given 2 strings, return their concatenation, except omit the first char of each. 
	 * The strings will be at least length 1.
	 */


          String h="Hello",t= "There";   // "ellohere"
                h = "java";      t = "code";     // "avaode"
                h = "shotl";     t = "java"; //  "hotlava"
           if (h.length()>=1 && t.length()>=1) {
	     System.out.println(h.substring(1)+(t.substring(1)));
         }else {
        	 System.out.println("Invald entry");
         }
}
}