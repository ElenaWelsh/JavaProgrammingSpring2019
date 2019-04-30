package homeWork_String_munipulations;

public class Left2 {
   public static void main(String[] args) {
	/*Given a string, return a "rotated left 2" version 
	 * where the first 2 chars are moved to the end. The string length will be at least 2.
	 */


                       String str ="Hello";     //) → "lloHe"
                              str="java";         // → "vaja"
                              str="Hi";           //) → "Hi"
                       
             System.out.println(str.substring(2,str.length()).concat(str.substring(0,2)));
                       
                       

}
}
