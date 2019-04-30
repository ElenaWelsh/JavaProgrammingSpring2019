package day16__String_manippulation_methods;

public class Number_from_string {
public static void main(String[] args) {
	String sentence = "I wrote [236] lines of code today";
	//assign to variable print number between[and]
	
	int start = sentence.indexOf('[')+1;
	int end = sentence.indexOf(']');
	
	String codeCount = sentence.substring(start,end);
	System.out.println(codeCount);
}
}
