package homeWork_String_munipulations;

public class MiddleThree {
public static void main(String[] args) {
	/*Given a string of odd length, return the string length 3 from its middle,
	 *  so "Candy" yields "and". The string length will be at least 3.
	 */


         //     String str = "Candy";             // → "and"
       //    middleThree("and") → "and";
                 String str = "solving";             // → "lvi  "
	
	    int x = str.length()/2;
          str.substring(x-1,x+2);
	System.out.println(str.substring(x-1,x+2));
	        
	        
	        
	        
	        
	        
	        
	}
}
