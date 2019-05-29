package MurodulReviw;

public class ArraysOrder {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 4, 6, 7, 12 };
		int[] nums2 = new int[] { 1, 4, 6, 3, 7, 12 };
		boolean sorted;
		isArraySorted(nums2);
		
		
		
		
		for (int i = 0; i < nums2.length - 1; i++) {
			System.out.println(nums2[i] + " " + nums2[i + 1]);
			if (nums2[i] > nums2[i + 1]) {
				sorted = false;
				break;
			}
		}
		System.out.println("Array is sorted");
	}

//	private static void isArraySorted(int[] nums) {
//		boolean sorted = true;
//		for (int i = 0; i < nums.length - 1; i++) {
//			System.out.println(nums[i] + " " + nums[i + 1]);
//			if (nums[i] > nums[i + 1]) {
//				sorted = false;
//				break;
//			}
//		}
//		System.out.println("Array is sorted");
//	}
//	

	private static void isArraySorted(int[] nums) {
	boolean sorted = true;
	for (int i = 0; i < nums.length - 1; i++) {
		System.out.println(nums[i] + " " + nums[i + 1]);
		if (nums[i] > nums[i + 1]) {
			sorted = false;
			break;
		}
	}
	System.out.println("Array is sorted");
	}		
}
