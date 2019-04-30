package day0_Previouse;

public class FindSmallestNumber {
	public static void main(String[] args) {
		int[] nums = { -100, -230, 0, 234, 345, 123 };
		int smallest = nums[0];
		for (int num : nums) {
			if (smallest > num) {
				smallest = num;
			}
		}
		System.out.println(smallest);
	}
}
