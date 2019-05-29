package MurodulReviw;
import java.util.*;
public class getRandomArray {
public static void main(String[] args) {

}
public static int[] getRandomArray(int size){
	Random rand=new Random();
	int [] nums = new int[size];
	for (int i =0;i<size; i++) {
		nums[i]=rand.nextInt(101);
	}
	return nums;
	}
}










