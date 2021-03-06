package day27_arrays05;
import java.util.*;
public class CopyOf {
public static void main(String[] args) {
	int[]nums1= {34,56,23,1,55};
	int[]nums2=Arrays.copyOf(nums1, nums1.length+2);
	System.out.println(Arrays.toString(nums2));//[34, 56, 23, 1, 55, 0, 0] last two are empty
     int [] nums3 = Arrays.copyOfRange(nums1,1,3);
     System.out.println(Arrays.toString(nums3));//[56, 23]
     
     int[]brandNew = {34,23,54,23};
     brandNew=Arrays.copyOf(brandNew, brandNew.length +5);
     System.out.println("Length after: " + brandNew.length);
}
}
