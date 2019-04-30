package day11_logical_nestedif;
import java.util.*;
public class TollCalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int carType;
		double price = 0.0;
		System.out.println("Enter vehicle Type: 1 or 2"); //1,21
		
		 carType = keyboard.nextInt();
		System.out.println("It is rush hour: yes|no");
		String rushHour = keyboard.next(); // string yes or no
		boolean isRushHour;
				if (rushHour.equalsIgnoreCase("yes")) {
					isRushHour = true;
				}else {
					isRushHour = false;
				}
		if (carType == 1) {
			if(isRushHour) {
				price = 30.0;
			}else {
				price = 5.0;
			}
		}else if(carType ==2 ) {
			if(isRushHour) {
				price = 55.30;
			}else {
				price = 15.99;
			}
			
		}
		System.out.println("Total price: "+price);
	}

}
