package day06_operators2;
import java.util.Scanner;

public class CentsToDollars {
	public static void main(String[] args) {
		Scanner tot = new Scanner(System.in);
		System.out.println("How much money do you have?");
		int money = tot.nextInt();
		int dollars = money/100;
		int cents = money%100;
		System.out.println("I have " + dollars+ " dollars and "+ cents + " cents. ");
		
		System.out.println("\n And How much money do you have?");
		int dollars1 = tot.nextInt();
		int cents1 = tot.nextInt();
		System.out.println("I have " + dollars1 + " dollars and " + cents1 + " cents.");
		
		
	}

}