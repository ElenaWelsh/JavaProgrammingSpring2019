package day29_ArraysAndMethods;

import java.util.Arrays;

public class Countries {
	public static void main(String[] args) {
		String[][] countries = { { "USA", "Washington DC" }, // String[9][2]
				{ "Canada", "Ottawa" }, { "Mexico", "Mexico city" }, { "Brasil", "Brasilia" }, { "Peru", "Lima" },
				{ "Argentina", "Boanes Aeros" }, { "Bolivia", "La Paz" }, { "Macedonia", "Scopia" },
				{ "Kazakhstann", "Nursultan" } };

		// Print
		System.out.println(countries[0][0] + "|" + countries[0][1]);
		System.out.println(countries[8][0] + "|" + countries[8][1]);
		System.out.println(Arrays.deepToString(countries));
		// print all the countries separated by |
		for (int i = 0; i < countries.length; i++) { // print with for loop
			System.out.print(countries[i][0] + "|");
		}

		System.out.println();

		for (String[] country : countries) { // print with for each loop
			System.out.println(country[0]);
		}
		for (String[] country : countries) { // print with for each loop
			System.out.println(country[1]); // for capital
		}
		// get all the cities and add to cities Array
		String[] cities = new String[countries.length];
		// System.out.println(Arrays.toString(cities));///null,null- no objects
		for (int i = 0; i < countries.length; i++) {
			cities[i] = countries[i][1];
		}
		System.out.print(Arrays.toString(cities));

		for (int row = 0; row < countries.length; row++) {
            if(countries[row][0].equals("Bolivia")) {
            	if (countries[row][1].equals("La Paz")) {
            		System.out.println("test passed");
            	}else {
            		System.out.println("test failed");
            	}
            	break;//exit the loop
            	
            	
            	
            }
		}

	}
}
