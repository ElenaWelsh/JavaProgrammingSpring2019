package day26_Array_04;

import java.util.Arrays;

public class Split {
	public static void main(String[] args) {
		String words = "java,kava,html,selenium";
		String[] wordsArray = words.split(",");
		System.out.println("Count: " + wordsArray.length);
		System.out.println(wordsArray[0]);
		System.out.println(Arrays.toString(wordsArray));

		for (String word : wordsArray) {
			System.out.println(word);
		}
		String diceResult = "1 - 20 of 1,461 positions";
		String[] result = diceResult.split(" ");
		System.out.println("Number: " + result[4]);

		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		String[] allWords = sentence.split(" ");
		String[] happySplit = sentence.split("happy");
		String[] splitI = sentence.split("I");
		
		for (String w : allWords) {
			System.out.println(w);
		}
		
		String word ="java";
		char[] charsArray = word.toCharArray();
		for(char ch:charsArray) {
			System.out.println(ch);
		}

	}
}
