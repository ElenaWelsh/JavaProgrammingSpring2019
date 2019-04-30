package day27_arrays05;
import java.util.*;
public class ArraysEquals {
public static void main(String[] args) {
	int[]nums= {4,5,6,10,100};
	int[]nums1= {4,5,6,10,100};
    System.out.println(Arrays.equals(nums, nums1));//true
	if(Arrays.equals(nums,nums1)){
		System.out.println("equals");
	}else {
		System.out.println("not equals");
	}
	String[] strArr1 = {"one","two","three"};
	String[] strArr2 = {"one","Two","three"};
	boolean match = Arrays.equals(strArr1,strArr2);
	System.out.println(match);//false
//	Webpage:
//		"apple,orange,orange"
//		Database:
//		"apple,apple,orange"
//		String st1 = "apple,orange,orange";
//		String st2 = "apple,apple,orange";
//		String[] strArr1 = st1.split(",");
//		String[] strArr2 = st2.split(",");
//		for(int i = 0; i < strArr1.length; i++ ) {
//		    if(!strArr1[i].equals(strArr2[i])){
//		        print mistmatch strArr1[i] <> strArr2[i];
//		        return false;
//		    }
//		}
//		========================================
//		String st1 = "apple,orange,orange";
//		String st2 = "apple,apple,orange";
//		Arrays.equals(st1.split(",") , st2.split(","));
//		===========================
//		ARRAYS:
//		    - toString
//		    - sort
//		    - binarySearch
//		    - equals
//		    - copyOf
}
}
