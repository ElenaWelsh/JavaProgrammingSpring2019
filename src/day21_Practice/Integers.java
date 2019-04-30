package day21_Practice;
import java.util.*;
public class Integers {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int sum;
	//int sumOfSum;
	do {
	System.out.println("Enter two numbers:");
	int num1 =scan.nextInt();
	int num2 =scan.nextInt();
	sum = num1+num2;
	//sumOfSum +=sum;
	}while (sum<=100);
	System.out.println("Good Numbers");
}
}

