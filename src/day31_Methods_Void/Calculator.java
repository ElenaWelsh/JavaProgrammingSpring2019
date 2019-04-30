package day31_Methods_Void;
import java.util.*;
public class Calculator{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter numbers");
	double n1 = scan.nextDouble();
	double n2 = scan.nextDouble();
	System.out.println("Select operation");
	String operator = scan.next();
	
	switch(operator) {
		case "+":
		addition(n1,n2);
		break;
	
		case "*":
		multiply(n1,n2);
		break;
		
		case "-":
		subtract(n1,n2);
		break;
	
		case "/":
		divide(n1,n2);
		break;
		
		case "%":
		remainder(n1,n2);
		break;
	
	    default:
	     System.out.println("Invalid operator");
	     break;
	     }
	
	
	
	
	
}

public static void addition (double num1,double num2) {
	
	double result=num1+num2;
	System.out.println("Result: "+ result);
}

public static void multiply (double num1,double num2) {
	
	double result=num1*num2;
	System.out.println("Result: "+ result);
}

public static void subtract (double num1,double num2) {
	
	double result=num1-num2;
	System.out.println("Result: "+ result);
}

public static void divide (double num1,double num2) {
	
	double result=num1/num2;
	System.out.println("Result: "+ result);
}

public static void remainder (double num1,double num2) {
	
	double result=num1%num2;
	System.out.println("Result: "+ result);
}















}
