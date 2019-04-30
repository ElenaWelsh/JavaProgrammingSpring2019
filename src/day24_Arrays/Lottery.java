package day24_Arrays;

import java.util.Arrays;

public class Lottery {
	public static void main(String[] args) {
		int[] lotteryNumbers = { 12, 45, 3, 62, 42, 90 };
		System.out.println(Arrays.toString(lotteryNumbers));
		Arrays.sort(lotteryNumbers);
		System.out.println(Arrays.toString(lotteryNumbers));
		int index = Arrays.binarySearch(lotteryNumbers, 90);
		System.out.println("Position: " + index);// works only with sorted arrays
		int index2 = Arrays.binarySearch(lotteryNumbers, 5);
		System.out.println("Position: " + index2);// if it does not exist ---negative number
		System.out.println("Position: " + Arrays.binarySearch(lotteryNumbers, 42));
	}
}
