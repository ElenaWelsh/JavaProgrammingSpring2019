package day0_Previouse;

public class FindNumberInArray {
public static void main(String[] args) {
	int []nums = {17,29,18,43,100,90,23,77,3,10};
	int lookfor=1;
	boolean found = false;
	for(int i=0;i<nums.length;i++) {
		if(nums[i]==lookfor) {
			System.out.println("value found at index "+ i);
			found=true;
			break;
		}
	}	
	         if (!found) {
			System.out.println(lookfor+" not found in the array");
		}
	}
}

