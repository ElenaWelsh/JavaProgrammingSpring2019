package day23_Loop_Control_Nested_Arrays;

public class PrintNumbersWithLoop {
public static void main(String[] args) {
//	for (int j = 0; j<=10; j++) {
//		for(int i = 1; i <=j;  i++) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//	}
	for (int j = 10; j>=1; j--) {
		for(int i = j; i >=1;  i--) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
}
