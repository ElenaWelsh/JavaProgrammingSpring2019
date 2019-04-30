package day31_Methods_Void;
import java.util.*;
public class Counter {

	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter number");
     int inputNum=scan.nextInt();
       countUp(inputNum);
		//countUp(5);
		//countDown(10);
	}

	public static void countUp(int num) {
		if (num < 1) {
			System.out.println("Invalid input");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void countDown(int num) {
		if (num < 1) {
			for (int i = num; i >= 0; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
