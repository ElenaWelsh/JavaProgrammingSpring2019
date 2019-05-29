package MurodulReviw;

import java.util.Arrays;

public class IntArray {
public static void main(String[] args) {
	int[]nums= {30,20,10,15,25};
	System.out.println(Arrays.toString(nums));
	for(int n: nums) {
		if(n>17)                  // one statement curly braces optional
		System.out.println(n);
	}
	// calculate sum using for loop
	int  sum =0;
	for (int i=0;i<nums.length;i++) {
		sum +=nums[i] ;
	}
	System.out.println("Sum: " + sum);
	
	int m = nums[nums.length/2];//20
	int l = nums[nums.length-1];//30
	System.out.println("m:"+ " | Last:" +l);
	
	int lowest=nums[0];
	for (int i = 0; i <nums.length;i++) {
		if(nums[i]<lowest) {
			lowest=nums[i];
		}
		System.out.println("Lowest: "+lowest);
	}
	int max=nums[0];
	for (int i = 0; i <nums.length;i++) {
		if(nums[i]>max) {
			max=nums[i];
		}
		System.out.println("Lowest: "+max);
	}
}
}
