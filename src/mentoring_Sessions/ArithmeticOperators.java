package mentoring_Sessions;
import java.util.Scanner;
public class ArithmeticOperators {
public static void main(String[] args) {
	int a = 7;
	int b = 3;
	System.out.println("Addition: "+ a+b);
	System.out.println("Addition: "+ (a+b));
	System.out.println("Addition: "+ (7+3));
	//System.out.println("Subtruction: "+ a-b); does not compile
	System.out.println("Subtruction: "+ (a-b));
	System.out.println("Multiplication: "+ a*b);
	
	System.out.println("Division: "+ a/b);
	System.out.println("Modulus: "+ a%b);
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num = scan.nextInt();
	int digit1, digit2, digit3,digit4,digit5;
	digit1=num/10000;
	System.out.println(digit1);
	digit2=num%10000/1000;
	System.out.println(digit2);
	digit3=num%1000/100;
	System.out.println(digit3);
	digit4=num%100/10;
	System.out.println(digit4);
	digit5=num%10;
	System.out.println(digit5);
}
}
