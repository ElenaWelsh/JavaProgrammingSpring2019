package day27_arrays05;
import java.util.*;
public class BinarySearch {
public static void main(String[] args) {
	int[]nums = {4,6,7,10,55}; // if number two times 
	System.out.println(Arrays.binarySearch(nums, 7));//2
	System.out.println(Arrays.binarySearch(nums, 55));//4
	System.out.println(Arrays.binarySearch(nums, 2));//-1
	System.out.println(Arrays.binarySearch(nums, 5));//-2
	int i = Arrays.binarySearch(nums, 10);
	System.out.println(i);
	
	
	int[]nums1 = {40,6,17,10,55};
	int j = Arrays.binarySearch(nums, 10);// gives wrong number, becouse not sorted
	//Arrays.binarySearch(a, fromIndex, toIndex, key)
			//Arrays.sort(a, fromIndex, toIndex, c); comparator
		    
}
}
