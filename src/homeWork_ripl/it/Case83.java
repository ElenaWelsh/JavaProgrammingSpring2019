package homeWork_ripl.it;
import java.util.Scanner;
public class Case83 {
	 public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	         String name;
	         String newguest;
	         String guestlist=""; 
	      do {
	        System.out.println("Please enter guest name:");
	        name = scan.next();
	        guestlist += name;
	        System.out.println("Do you want to enter new guest name:");
	        newguest = scan.next();
	        if (newguest.equalsIgnoreCase("Yes")) {
	        	guestlist+=", ";
	        }
	      }while (newguest.equalsIgnoreCase("Yes"));   
	    
	    System.out.println("Guest's list: " + guestlist);

	    
	 }
	    
 }
	  
	
/*	Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
	Ask for the first guest name.
	Then ask does user want to enter one more guest.
	 If yes - take input from.
	If not - finish the program and print list of the guests.

	Example of the program:
	Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no

Guest's list: Nick, Linda*/
	
	
	
	
	
	
	
	
	
	
	


