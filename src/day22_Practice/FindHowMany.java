package day22_Practice;

public class FindHowMany {
public static void main(String[] args) {
	String word = "including wedpages, images";
	int length1= word.length();
	word = word.replace("e", "");
	int length2 = word.length();
	System.out.println(length1);
	System.out.println(length2);
	System.out.println(length1-length2);
}
}
