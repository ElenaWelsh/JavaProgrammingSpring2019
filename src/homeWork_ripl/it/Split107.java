package homeWork_ripl.it;
import java.util.*;
public class Split107 {
public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	   String email = input.nextLine();
	      
	    //Write your code below
	      
	 
	        String[] words = email.split("@");
	        if (words.length!=2) {
	        	System.out.println("Invalid email");
	        }else {
	   	   
	   	   System.out.println("Email id:" + words[0]);
	   	   System.out.println("Email domain:" + words[1]);
	     }
	   }
}

