package day12_switch_ternary;
import java.util.*;
public class CalculatorV02 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			//get numbers
			System.out.println("Enter first number:");
			double num1 = scan.nextDouble();
			System.out.println("Enter second number:");
			double num2 = scan.nextDouble();
			
			//get operator
			System.out.println("Select operator: +, -, *, /, %");
			String operator = scan.next();
			
			// perform operator and display result
			double result = 0.0;
			
			switch (operator) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
			    result = num1-num2;
			    break;
			case "*":
		         result = num1*num2;
		         break;
			case "/":
	             result = num1/num2;
	             break;
			case"%":
		         result = num1%num2;
		         break;
	         default:
	        	System.out.println("Invalid operator selected: " + operator);
	            break;
	        }
			    System.out.println("Result :" + result);
		} 
	 
	}

