package day19__Loops;
import java.util.*;
public class Password {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String password ="abc";
        String input;

       do {
         System.out.println("Enter password:");
            input = scan.next();
    }while (!input.equalsIgnoreCase(password));
     System.out.println("Password is correct");
	}

}




