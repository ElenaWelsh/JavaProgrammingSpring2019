package day20_forLoop;
import java.util.*;
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number (1 - 10): ");
		int num = scan.nextInt();
		// check if it is valid
        if (num<1 || num>10) {
        	System.out.println("ERROR: Invalid number");
        	return; 
        }//System.exit(0); stop execution
        for (int i = 1; i<=10; i++) {
        	//int result = num*i;
        	System.out.println(num+" x "+ i+ " = "+(num*i)); // result	
        	}
        }
}
