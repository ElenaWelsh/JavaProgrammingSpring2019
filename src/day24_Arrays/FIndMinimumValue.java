package day24_Arrays;

public class FIndMinimumValue {
public static void main(String[] args) {
	int[] numbers = new int[3];
	numbers[0]=25; //first value array
	numbers[1]=10; //second value array
	numbers[2]=20; // third value array
	 int min = Integer.MAX_VALUE;
	 for(int i = 0; i<numbers.length;i++) {
		 if (numbers[i]<min) {
			 min=numbers[i];
		 }
	 }
	 System.out.println("Min value: "+min);
	 
}
}
