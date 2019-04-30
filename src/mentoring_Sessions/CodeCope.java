package mentoring_Sessions;
import java.util.*;
public class CodeCope {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
       String str = scan.nextLine();
       int count=0;
       for(int i =0; i<str.length()-3; i++) {
      // if (str.substring(i,i+2).equals("co") && str.substring(i+3,i+4).equals("e")) {
    	if (str.charAt(i)=='c' && str.charAt(i+1)=='o' && str.charAt(i+3)=='e') {  
    	    count++;
       }
     } 
       System.out.println(count);
		
 }
}