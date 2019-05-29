package homeWork_ripl.it;
import java.util.*;
public class ArrayIntoArrayList181 {
	public static void main(String[] args) {
		String[] r1= {"f","o","o"};
		String[] r2= {" b","a","r"};
	    System.out.println(combineRs(r1,r2));	
	}
	public static String combineRs(String[] r1,String[] r2) {
		/*combine two String arrays into one arraylist and return it as a string.
		 * for example:
           combineRs(["f","o","o"],[" b","a","r"])
           returns "foo bar" */
          ArrayList<String> comb = new ArrayList<>();
          int j=0;
          for (int i=0; i<(r1.length+r2.length); i++) {
        	  if (i<r1.length) {
        		  comb.add(i,r1[i]);
        	  } else {
        		  comb.add(i,r2[j]);
        		  j++;
        	  }
        	  
          }
		     String combineRs="";
		     for(String c: comb) {
		    	 combineRs+=c;
		     }
		
		return combineRs;
		
}
}