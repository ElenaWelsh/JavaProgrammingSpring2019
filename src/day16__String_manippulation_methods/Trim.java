package day16__String_manippulation_methods;

public class Trim {
public static void main(String[] args) {
	String word =" java";
	word.trim();//java
	String word3 = " Java Programming ";
	word3.trim();  // "Java Programming"
	String word1 = " String methods ";
	System.out.println(word1.trim());// with trim
	System.out.println(word1);//no trim
	String word5 = "   Threespaces here";
	System.out.println(word5);// no spaces
	 String word6 = ".   Threespaces here";// no trim
}
}
