package day23_Loop_Control_Nested_Arrays;
import java.util.*;
public class Calculate_Sum {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//sum of six numbers, if number less or ==0, ignore this number
    int sum=0;                
	for (int i=0; i < 6;i++) {
		System.out.println("Enter number:");
		int num = scan.nextInt();
		    if (num<=0){
			continue;
		    }
		    sum+=num;
	}
	System.out.println("Total sum: " + sum);
  }
}

