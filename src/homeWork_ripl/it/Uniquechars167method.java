package homeWork_ripl.it;

public class Uniquechars167method {
	public static void main(String[] args) {
	    //test your code
	    System.out.println( uniqueChars("wooden-spoon") ) ;
	  }
	  
	   public static String uniqueChars(String str) {
			    //TODO: write your below
			    String uniqueChars ="";
			    for(int i = 0; i <str.length(); i++) {
			    	
			    	char ch = str.charAt(i);
			    	
			    	String letter = "" + ch;
			    	
			    if( !uniqueChars.contains(letter)) {
			     uniqueChars += letter;
			     }
			
			    }
			    return uniqueChars;
			}
	}
