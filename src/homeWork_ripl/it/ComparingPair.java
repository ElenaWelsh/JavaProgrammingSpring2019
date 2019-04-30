package homeWork_ripl.it;

import java.util.*;

public class ComparingPair {
	public static void main(String[] args) {
		System.out.println("Print array:");
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };
		// int[] nums = {4456688};
		// TODO: write your code below
		Arrays.sort(nums);
		for (int i = 0; i <= 4; i += 2) {
			if (nums[i] != nums[i + 1]) {
				System.out.println(nums[i]);
				System.exit(0);;
			}
		}
		System.out.println(nums[nums.length - 1]);
	}
}
