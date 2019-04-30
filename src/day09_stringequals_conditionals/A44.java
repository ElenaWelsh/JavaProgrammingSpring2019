package day09_stringequals_conditionals;
import java.util.*;
public class A44 {
	  public static void main(String[] args) {
	    //DO NOT CHANGE
	    int num, digit1, digit2, digit3, digit4, digit5;
	    //WRITE YOUR CODE HERE
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your number:");
	    num = scan.nextInt();
	    System.out.println(num);
	    digit1 = num/10000;
	    System.out.println(digit1);
	    digit2 = num/1000%10;
	    System.out.println(digit2);
	    digit3 = num/100%(digit1*10+digit2);// num/100%(num/1000*10)
	    System.out.println(digit3);
	    digit4 = num/10%(num/100*10);
	    System.out.println(digit4);
	    digit5 = num%(num/10*10);
	    System.out.println(digit5);
	  }
	}

