package homeWork_ripl.it;

public class Ass167 {
	
		  public static void main(String[] args) {
		    //test your code
		    System.out.println( uniqueChars("selenium") ) ;
		  }
		  
		  public static String uniqueChars(String str) {
		    //TODO: write your below
		    String uniqueChars ="";
		    for(int i = 0; i <str.length(); i++) {
		    	
		    	char ch = str.charAt(i);
		    	
		    	String ltr = "" + ch;
		    	
		    if( !uniqueChars.contains(ltr)) {
		     uniqueChars += ltr;
		     }
		
		    }
		    return uniqueChars;
		}
}
