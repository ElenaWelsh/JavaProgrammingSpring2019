package day23_Loop_Control_Nested_Arrays;

public class Print5RowsLetters {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
          if (i%2==0) {
			    for (char letter = 'a'; letter <= 'z'; letter++) {
				 System.out.print(letter);
			    }
         }else {
        	    for (char letter = 'a'; letter <= 'z'; letter++) {
 				System.out.print(letter);
                }
         }
			System.out.println();
			System.out.println("**************************");
		}
	}
}
