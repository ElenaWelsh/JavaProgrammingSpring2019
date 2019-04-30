package day23_Loop_Control_Nested_Arrays;

public class Nested_Loops {
 public static void main(String[] args) {
     //	for(int i =1; i<=10; i++) {
     //		System.out.print(i + " ");
     //	}
	               //outer loop
	       for(int j =1; j<=2; j++) {
	                //inner loop
	           for(int i =1; i<=10; i++) {
		          System.out.print(i + " ");
	           }
	           System.out.println();
            }
       }
}
