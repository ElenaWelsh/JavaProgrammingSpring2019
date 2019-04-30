package Murodulreviw;

public class ArraysContains {
	public static void main(String[] args) {

		int[] arr1 = {1, 5, 78};
		int[] arr2 = { 20, 5, 22, 4, 7 };
		// check if all items in arr1 in arr2
	

		for (int n1 : arr1) {
		//	System.out.println("Outer: " + n1);
			int count =0;
			for (int n2 : arr2) {
		//		System.out.println("Inner: " + n2);
				if(n2==n1) {
					System.out.println("Found" + n1 + "is in Arr2");
					count++;
					break;
				}
			}
			      if(count==0) {
			    	  System.out.println("Did not find "+ n1+ " is in Arr2");
			      }
		}

	}
}
