package day28_Arrays_multi;

import java.util.*;

public class ReverseSentence {
	public static void main(String[] args) {
		String sentence = "you are very interesting person";
		String[] arrSentence = sentence.split(" ");
		System.out.println(arrSentence.length);
		System.out.println(Arrays.toString(arrSentence));
		String reversed = "";
		for (int i = arrSentence.length - 1; i >= 0; i--) {
			// System.out.println(arrSentence[i]);
			reversed += arrSentence[i] + " ";
		}
		reversed = reversed.trim();
		System.out.println(reversed);
	}
}
