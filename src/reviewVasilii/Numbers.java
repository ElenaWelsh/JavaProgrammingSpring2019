package reviewVasilii;

import java.util.Arrays;

public class Numbers {
	public static void main(String[] args) {
		int[] nums = { 123, 532, 34, 643 };

		System.out.println(nums[1]);
		nums[1]=5;
		System.out.println(Arrays.toString(nums));
		int max =nums[0];
		for(int num:nums) {
			if (num>max) {
				max=num;
			}
		}
         System.out.println("Maximum: " +max);
         int min =nums[0];
         for(int num:nums) {
         if (num<min) {
				min=num;
			}
		}
      System.out.println("Minimum: " + min);
         
	}
}
