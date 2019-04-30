package day09_stringequals_conditionals;
import java.util.Scanner;
public class Canada {
	public static void main(String[] args) {
		
		System.out.println("What is the Capital of the Canada?");
		Scanner scan = new Scanner(System.in); 
		 String capital = scan.next();
		
		// if (capital.equalsIgnoreCase("Ottawa")){    will ignore lower or upper case
		if (capital.equals("Ottawa")) {
			System.out.println("Your answer is correct!");
		}else {
			System.out.println("You are incorrect! "+ capital+" is not capital of Canada");
		}
	}

}
