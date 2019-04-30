package homeWork_ripl.it;

import java.util.*;

public class WordsWithE {

	public static void main(String[] args) {
		    System.out.println("-----EXAMPLE RUN ---------");
		    String[] numbers = {"zero", "one", "two","three","four"};
		    
		     String fewValues ="";
		     for (String number :numbers){
		    	 if( number.contains("e")) {
		    		 fewValues+=number+" ";
		    		
		    	 }
		     }
		      fewValues=fewValues.trim();
		      String []getWithE=fewValues.split(" ");
		      System.out.println(Arrays.toString(getWithE));
		  }
}
/*
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("-----EXAMPLE RUN ---------");
    String[] numbers = {"zero", "one", "two","three","four"};
    System.out.println(Arrays.toString(getWithE(numbers)));
    
  }
  
  
  
  public static String[] getWithE(String[] arr) {
    
    //TODO : YOUR CODE GOES HERE ----------------------
     String fewValues ="";
		    for (String number :numbers){
		    	  if( number.contains("e")) {
		    	      fewValues+=number+" ";
		    		 }
		     }
		  fewValues=fewValues.trim();
		  String []getWithE=fewValues.split(" ");
		  System.out.println(Arrays.toString(getWithE));
		  
    
    
    
    //YOUR CODE ENDS HERE -----------------------
    
    return fewValues;
  }
  
  
  
}
/*Given a String array arr with the following elements
["zero", "one", "two","three","four"]

Create another array fewValues and copy words that have letter "e" in them

You need to know how many element contain "e" and create array accordingly

Values in fewValues array need to be["zero", "one","three"]

Examples:
arr -> ["aa", "be", "lol", "lel", "oreo"] 
fewValues -> ["be",  "lel", "oreo"] 

arr -> ["e", "hey", "bye", "furey", "spoon"] 
fewValues ->["e", "hey", "bye", "furey"] */