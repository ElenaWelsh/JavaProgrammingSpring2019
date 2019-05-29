package MurodulReviw;

import java.util.Arrays;

public class ArrayRemoveElementFrom {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 1, 1, 6 };
		int target = 1;
		int counter = 0;
		for (int num : nums) {
			if (num == target) {
				counter++;
			}
		}
         // System.out.println(counter);
		int [] newArray= new int[nums.length-counter];
		int idx=0;
		for(int num:nums) {
			if(num!=target) {
				newArray[idx]=num;
				idx++;
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(newArray));
	}
}
