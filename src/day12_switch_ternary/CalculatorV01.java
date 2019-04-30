package day12_switch_ternary;
import java.util.Scanner;
public class CalculatorV01 {
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
		if(operator.equals("+")){
			result = num1 + num2;
		}else if (operator.equals("-")) {
		    result = num1-num2;
	    }else if  (operator.equals("*")) {
	         result = num1*num2;
        } else if (operator.equals("/")) {
             result = num1/num2;
        } else if (operator.equals("%")){
	         result = num1%num2;
        }else {
        	System.out.println("Invalid operator selected: " +operator);
        	return; // stop running program and exit
        }
		    System.out.println("Result :" + result);
	} 
 
}