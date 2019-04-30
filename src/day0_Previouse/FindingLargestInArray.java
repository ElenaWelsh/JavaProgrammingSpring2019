package day0_Previouse;
import java.util.*;
public class FindingLargestInArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("How many items in array?");
	int count = scan.nextInt();
	int[] nums=new int[count];
	for(int i=0; i<count;i++) {
		System.out.println("Enter number" + (i+1));
		nums[i]=scan.nextInt();
	}
	for(int n:nums) {
		System.out.print(n+" ");
	}
	System.out.println();
	
	int largest= nums[0]; //assume first one is the largest
	for(int num:nums) {
		if(num>largest) {
			largest=num;
		}
	}
	System.out.println("Largest value: "+ largest);
  }
}

