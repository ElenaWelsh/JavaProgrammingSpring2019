package reviewVasyl;

import java.util.Arrays;

public class MultidimentionalArray {
	public static void main(String[] args) {
		int[][] nums = { { 123, 532, 34, 643, -345, 73, 436, 344362, 547 },
				         { 12123, 657, 34, 56643, -567, 73, 345, 4563657, 35673576 },
				         { 22342, 343, 3453245, 34534, -567, 73, 345, 4563657 } };
		int max = nums[0][0];
		int min = nums[0][0];
		int countNegative=0;
		int total=0;
		    for (int rows = 0; rows < nums.length; rows++) {
			    for (int columns = 0; columns < nums[rows].length; columns++) {
				   if (nums[rows][columns] > max) {
					   max = nums[rows][columns];
				    }
				   if (nums[rows][columns] < min) {
					   min = nums[rows][columns];
				    }
                      if(nums[rows][columns]<0) {
                    	  countNegative ++;
                      }
                      total +=nums[rows][columns];
			    }
		    }
		
		            System.out.println("Minimum " + min);
		            System.out.println("Maximum " + max);
		            System.out.println("Negative " + countNegative);
		            System.out.println("Total: "+ total);
	}
}