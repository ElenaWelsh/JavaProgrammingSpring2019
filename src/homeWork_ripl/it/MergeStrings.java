package homeWork_ripl.it;

public class MergeStrings {
public static void main(String[] args) {
	
	String one ="jjjjjjjjjjjjjj",  two ="ooooooooooo" ;
	int shorter=0;
	if(one.length()>two.length()) {
		shorter=two.length();
	}else { 
		shorter=one.length();
	 }
	    String mergeStrings="";
	    
	    for(int i =0; i < shorter; i++){
	    	
	     
	  mergeStrings+=one.charAt(i)+""+ two.charAt(i);
	       
	      }
	    
	    if(one.length()>two.length()) {
	    	 mergeStrings+=one.substring(shorter);
	    }else {
	    	mergeStrings+=two.substring(shorter);
	    }
	      
	    
	    System.out.println(mergeStrings);
	    
	   
}
}
