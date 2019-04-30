package standAlongTask;

public class SumArraysNot6 {
public static void main(String[] args) {
//	int a=0; int c=0;
//	int sum=0;
//	int[]nums= {1,3,9,6,5,4,7,8,9,10};
//	for(int i =0; i<nums.length; i++) {
//		if(nums[i]==6) {
//			a=i;
//		}
//		if(nums[i]==7) {
//			c=i;
//		}
//	 }
//		for(int j=0; j<nums.length;j++) {
//			if(j<a || j>c) {
//				sum+=nums[j];
//				
//			}
//		}
//		System.out.println(sum);
//	}
//}	
	

	 
//	  for(int i=0;i<nums.length;i++){
//	    if(nums[i] == 6){
//	      while(nums[i] != 7){
//	        i++;
//	      }
//	    }
//	    else{
//	      sum += nums[i];
//	    }
//	  }
//	  System.out.println(sum);
	     int sum=0;
	     int[]nums= {1,3,9,6,5,4,7,8,9,10};

        boolean ifsix = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 6){
                sum += nums[i];
              }else if(nums[i] == 6){
                    ifsix =true;
                    i++;
                       if( nums[i+1 ] == 7){
                        ifsix = false;
                         i++;
                       }
                 }
              }
        
                  System.out.println(sum);
    }        
}
