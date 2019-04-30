package day23_Loop_Control_Nested_Arrays;

public class PrintWord {
 public static void main(String[] args) {
	String word ="java";
	for ( int i =0; i<word.length(); i++ ) {
		if(word.substring(i,i+1).contentEquals("a")) { //  updated statement
			continue;                                  //
		}
		System.out.println(word.substring(i,i+1));
	 }
 }
}
