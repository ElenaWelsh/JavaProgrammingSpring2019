package homeWork_ripl.it;

import java.util.Arrays;

public class UniqueNumbers152 {
	public static void main(String[] args) {
		int[] nums = { 2, 5, 5, 6, 3, 6, 9, 34, 3 };
		
	
		 
		for (int i = 0; i< nums.length;i++) {
			for(int j = 0 ;j< nums.length; j++) {
				if( nums[i]==nums[j]&& i!=j) {
			         nums[i]=-1;
			         nums[j] =-1;
		       }
			}
		}
	           for(int  i=0; i<nums.length;i++) {
	        	   if (nums[i]>0) {
	                 System.out.println(nums[i]);
	        	   }
	           }
	
	}
	
}	
	
	
	

	