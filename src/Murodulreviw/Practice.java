package MurodulReviw;

import java.util.*;

public class Practice {
	public static void main(String[] args) {
		int[] nums1 = { 10, 20, 5, 3 };
		int[] nums2 = { 5, 1, 1, 4 };
		System.out.println(Arrays.toString(add2Arrays(nums1,nums2)));
		String[] first = {"cybertek", "java","student","mentor"};
			String [] second= {"100","001","five","best"};	
			String[] third = add2Arrays(first, second);
			System.out.println("first:" + Arrays.toString(first));
			System.out.println("second:" + Arrays.toString(second));
			System.out.println("third:" + Arrays.toString(third));
	}	
        public static int[] add2Arrays(int[] nums1,int[] nums2) {
        	int[] nums3 = new int[nums1.length];
		for (int i = 0; i < nums1.length; i++) {
			nums3[i] = nums1[i] + nums2[i];
		}
//		System.out.println("nums1 " + Arrays.toString(nums1));
//		System.out.println("nums2 " + Arrays.toString(nums2));
//		System.out.println("nums3 " + Arrays.toString(nums3));
		return nums3;
	}
       
        public static String[] add2Arrays(String[] str1, String[] str2) {
        	String[] newOne = new String [str1.length];
    		for (int i = 0; i < str1.length; i++) {
    			newOne[i] = str1[i]+ "-" + str2[i];
    		}
    		return newOne;
        }
}
