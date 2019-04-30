package homeWork_ripl.it;
import java.util.*;
public class JavaOrPython {
public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
		    String sentence = scan.nextLine();
		    int countjava=0;
		    int countpython=0;
		    boolean defference = false;
		    for ( int i=0; i<=sentence.length()-4; i++){
		        if (sentence.substring(i,i+4).equals("java")){
		          countjava++;
		        }
		    }
		    for ( int i=0; i<=sentence.length()-6; i++){    
		        if (sentence.substring(i,+6).equals("python")){
		          countpython++;
		        }
		    }      
		        if (countjava==countpython){
		          defference = true;
		        }
		         System.out.println(defference);
 }
		
}

