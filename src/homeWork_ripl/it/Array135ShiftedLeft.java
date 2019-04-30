package homeWork_ripl.it;
import java.util.*;
public class Array135ShiftedLeft {
public static void main(String[] args) {
//	int[] nums= {6, 2, 5, 3};
//	int[]shifted=new int[nums.length];
//    int temp= nums[nums.length-1];
//    for (int i =0; i < nums.length-2;i++){
//      nums[i]=nums[i+1];
//      shifted[shifted.length]+=nums[i];
//      shifted[shifted.length-1]=temp;
//    }
//    System.out.println(Arrays.toString(shifted));
	  int[] nums= {6, 2, 5, 3};
	  int temp = nums[0];
	  for (int i=0; i<nums.length-1;i++) {
		  nums[i]=nums[i+1];
	  }
	  nums[nums.length-1]=temp;
	  System.out.println(Arrays.toString(nums));
}
}
