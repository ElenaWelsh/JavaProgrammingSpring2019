package day11_logical_nestedif;

public class Substring {
public static void main(String[] args) {
	String sentence= "Java String manipulation is fun!";
	System.out.println(sentence.substring(0,4));//Java
	System.out.println(sentence.substring(5,11));//String
	System.out.println(sentence.substring(7,11));//ring
	System.out.println(sentence.substring(10,5)); // error
	System.out.println(sentence.substring(10,40));//error
}
}
