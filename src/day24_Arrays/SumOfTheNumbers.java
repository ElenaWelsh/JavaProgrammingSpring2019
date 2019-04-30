package day24_Arrays;

import java.util.Arrays;

public class SumOfTheNumbers {
public static void main(String[] args) {
	//let's create an array of intengers length3
	int[] numbers = new int[3];
	numbers[0]=25; //first value array
	numbers[1]=10; //second value array
	numbers[2]=20; // third value array
	//  System.out.println(numbers);    prints [I@59f95c5d
	// toString() from arrays class can help us to print an array as a string
	System.out.println(Arrays.toString(numbers)); //    [25, 10, 20]
     int sum =0;
     for (int i = 0; i<numbers.length; i++) {
    	 sum = sum + numbers[i];
     }
    	 System.out.println("Sum: "+ sum);
    	// Find the largest value in the array
    	 int max = Integer.MIN_VALUE;
    	 for(int i = 0; i<numbers.length;i++) {
    		 if (numbers[i]>max) {
    			 max=numbers[i];
    		 }
    	 }
    	 System.out.println("Max value: "+max);
    	 
    	 
     }
   }
  
