package homeWork_ripl.it;

import java.util.Arrays;

public class SwapArrays {
public static void main(String[] args) {
	int[]nums= {4, 3, 2, 44, 1, 100, 55};
	for(int i = 0; i <=nums.length/2; i++) {
		int temp=nums[i];
		 nums[i]=nums[6-i];
		 nums[6-i]=temp;
		 
	}
	System.out.println(Arrays.toString(nums));

}
}
