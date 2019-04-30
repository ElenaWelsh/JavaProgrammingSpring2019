package day23_Loop_Control_Nested_Arrays;
import java.util.*;
public class PrimeNumbers {
public static void main(String[] args) {
	//A Prime Number is: a whole number that cannot be made by multiplying other whole numbers. 
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number:");
//	int num = scan.nextInt();
//	       for (int i = 2; i <num ; i++) {
//		       if (num%i ==0) {
//			      System.out.println("this is not a prime number");
//			      return;
//		       }
//         }
//	              System.out.println("this is a prime number");
	int number = 0;
	for(number = 2; number<=100; number++) {
		for(int i = 2; i< number; i++) {
		if(number%i==0) {
			System.out.println(number + "not a prime number");
			return;
		}
	}
}
}
}