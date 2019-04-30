package homeWork_ripl.it;

import java.util.Arrays;

public class multipltable128 {
	public static void main(String[] args) {
		int[][] arr = new int[10][10];

//	    for(int table:arr[] ) {
//		for(int i = 1; i<10;i++) {
//	  	  for(int j = 1; j<; j++) {
//	  		       table=i*j;
//	  	  }  
		for (int i =0; i <10; i++) {
			for (int j = 0; j < 10; j++) {
				arr[i][j]= (j+1)*(i+1);
			
			System.out.print(arr[i][j]+" ");
		}
             System.out.println();
		}
	}

}
