package day27_arrays05;

import java.util.Arrays;

public class ArraysClass {
public static void main(String[] args) {
	int[]nums= {43,12,4,1,3,5};
	// to String method
	System.out.println(Arrays.toString(nums));//[43, 12, 4, 1, 3, 5]
	String str=Arrays.toString(nums);
	Arrays.sort(nums);
	int lowest=nums[0];
	int largest=nums[nums.length-1];
	System.out.println(lowest);
	System.out.println(largest);
	
	// sort method sorts array in ascending order
	Arrays.sort(nums);
	System.out.println(Arrays.toString(nums));//[1, 3, 4, 5, 12, 43]

	String[] languages = {"Zulu", "Spanish", "Italian", "English", "Polish", "Arabic","Uzbek"};
     Arrays.sort(languages);
     System.out.println(Arrays.toString(languages));//alphabetical
    // can sort from one index to another
     
     int nums3[]= {4,10,20,50};
     Arrays.binarySearch(nums, 10);
}
}
