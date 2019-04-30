package day20_forLoop;

public class IdexOf {
public static void main(String[] args) {
	String word = "amazon";
	char letter = 'a';
	int index=-1;            // not found
	for (int i =0; i<word.length(); i++) {
		if (word.charAt(i)==letter) {
			index=i;
             break; // so it will break from the code after first a
		}
	}	
		System.out.println("Index: " + index);
}
}
