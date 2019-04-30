package day24_Arrays;

import java.util.Arrays;

public class CarShop {
	public static void main(String[] args) {
		// BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
		// 1. Step: Create an array of strings, and store these cars inside that array.
		String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla" };
		// 2. Step: Print car names that starts with M
		for (String c : cars) {
			if (!c.startsWith("M")) {
				continue;
			}
			System.out.println(c);
		}
		System.out.println("******************");
		// 3. Step: Print all cars that have letter "r" somewhere in the name.
		// Please make your search case insensitive
		for (String make : cars) {
			if (make.toLowerCase().contains("r")) {
				System.out.println(make);
			}
		}
		for (String c : cars) {
			if (c.toLowerCase().endsWith("a")) {
				System.out.println(c);
			}

		}

		for (String car : cars) {
			if (car.length() > 5) {
				System.out.println(car);
			}
		}
           for(int i = 0;i<cars.length;i++) {
        	   if (cars[i].length()>=6) {
        		   System.out.println(cars[i]);
        	   }
           }
         //  swap first and last value in the array
      //     String carSwap = cars [cars.length-1];
      // 	cars[cars.length-1]=cars[0];
      // 	cars[0]= carSwap;
           
           String temp = cars[0];       // create temp variable
           cars[0]=cars[cars.length-1];
           cars[cars.length-1]=temp;
           System.out.println(Arrays.toString(cars));
           Arrays.sort(cars);   // sort the cars in alphabet order
           
           
	}
}
