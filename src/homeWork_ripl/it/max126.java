package homeWork_ripl.it;

public class max126 {
public static void main(String[] args) {
	
	int[][]nums= {
  		  {10,20},
  		  {20,30,40,50}};
      int max = Integer.MIN_VALUE;
	for(int i = 0; i< nums.length;i++) {
  	  for(int j = 0; j <nums[j].length; j++) {
  		  if( nums[i][j] >max) {
  			  max=nums [i][j];
  		  }
  	  }
  		 
	}
  	  System.out.println(max);
}
}
