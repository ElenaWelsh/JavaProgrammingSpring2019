package reviewVasyl;

import java.util.*;

public class Array_reviw_SuperHero {
	public static void main(String[] args) {
		String[] arr1 = { "word" };
		String[] arr2 = new String[2];
		String[] arr3 = new String[] { "apple", "kiwi" };
		arr2[0] = "word";
		arr2[0] = "new word";
		arr2[1] = "one more new word";
		System.out.println(Arrays.toString(arr2));

		String[] superheroes = { "Spiderman", "Iron man", "Hulk", "Wonder Woman", "Thor", "Batman", "Hellboy",
				"Superman", "Flash", "Captain America", "Ant-Man", "Aquaman" };
		int count = 0;
		for (String s : superheroes) {
			if (s.contains(" ")) {
				count++;
			}

		}
		System.out.println("Count of superheroes with space: "+count);
	}
}