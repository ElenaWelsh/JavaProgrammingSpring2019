package officeHoursMurodil;

import java.util.*;

public class MaskArrayList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> inputs = new ArrayList<String>();
		List<String> masked = new ArrayList<>();
		List<Integer> lengthList = new ArrayList<>();
		String answer = "";

		do {

			System.out.println("Enter word");
			String word = scan.next();
			inputs.add(word);// hello
			masked.add(maskWord(word));

			lengthList.add(word.length());
			System.out.println("do you want to add another word?");
			answer = scan.next();

		} while (answer.equalsIgnoreCase("y"));
		
		System.out.println(inputs.toString());
		System.out.println(masked.toString());
		System.out.println(lengthList.toString());

	}

	public static String maskWord(String word) {
		String stars = "";
		for (int i = 0; i < word.length(); i++) {
			stars += "*";
		}
		return stars;
	}

}
