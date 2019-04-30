package homeWork_ripl.it;

import java.util.*;

public class ReplaceWithMax {
	public static void main(String[] args) {

		int arr[][] = { { 5, 5, 4, 2 }, { 9, 5, 4, 5 } }; // 2

		int max = arr[0][0];
		for (int[] arr1 : arr) {
			for (int arr2 : arr1) {
				if (arr2 > max) {
					max = arr2;
				}
			}
		}
		System.out.println(max);
		for (int i =0;i<arr.length;i++) {
			for(int j =0; j<arr[i].length;j++) {
				arr[i][j]=max;
			}
		}
		// FINAL PRINT
		System.out.println(Arrays.deepToString(arr));

	}

}
