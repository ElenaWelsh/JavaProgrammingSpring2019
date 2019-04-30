package homeWork_String_munipulations;
import java.util.Scanner;
public class ABCD {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter start: ");
		    String start = scan.next();
		    System.out.println("Enter end: ");
		    String end = scan.next();
		    
		     if (start.equals(end)){
		               System.out.println(end +" found");
		     }else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("B")){
		                System.out.println("right>\n B found");
		     }else if (start.equalsIgnoreCase("A")&& end.equalsIgnoreCase("C")){
		                System.out.println("right>down>\n C found");
		     }else if (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("D")){
		                System.out.println("right>down>left>\n D found");
		     }else if (start.equalsIgnoreCase("B")&& end.equalsIgnoreCase("C")){
		                System.out.println("down>\n C found");
		     }else if (start.equalsIgnoreCase("B")&&end.equalsIgnoreCase("D")){
		                System.out.println("down>left>\n D found");
		     }else if (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("A")){
				        System.out.println("down>left>up>\n A found");
			 }else if (start.equalsIgnoreCase("C")&& end.equalsIgnoreCase("D")){
				        System.out.println("left>\n D found");
		     }else if (start.equalsIgnoreCase("C") && end.equalsIgnoreCase("A")){
				        System.out.println("left>up>\n A found");
		     }else if (start.equalsIgnoreCase("C")&& end.equalsIgnoreCase("B")){
				        System.out.println("left>up>right>\n B found");
			 }else if (start.equalsIgnoreCase("D")&&end.equalsIgnoreCase("A")){
				       System.out.println("up>\n A found");
			 }else if (start.equalsIgnoreCase("D") && end.equalsIgnoreCase("B")){
				    System.out.println("up>right>\n B found");
			 }else if (start.equalsIgnoreCase("D")&& end.equalsIgnoreCase("C")){
				      System.out.println("up>right>down>\n C found");
				     }
				     
	 }				    
				    
}	     
		     
		   
		   
		    
		  
		

