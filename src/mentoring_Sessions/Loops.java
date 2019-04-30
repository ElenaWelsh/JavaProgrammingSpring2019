package mentoring_Sessions;
import java.util.*;
public class Loops {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	    
	    Scanner input = new Scanner(System.in);

	    
	    // your code 
	    // ------------------------------------------
	    String name = "";
	    
	    System.out.println("Please enter guest name:");
	    name += scan.nextLine();
	    System.out.println("Do you want to enter new guest name:");
	    String newGuest = scan.next();
	    while (newGuest.equalsIgnoreCase("yes")){
	      System.out.println("Please enter guest name:");
	      name += ", " + scan.next();
	      System.out.println("Do you want to enter new guest name:");
	    newGuest = scan.next();
	    }
	    System.out.println("Guest's list: " + name);
	    
   }  
}
	








