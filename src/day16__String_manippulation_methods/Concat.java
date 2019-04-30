package day16__String_manippulation_methods;

public class Concat {
public static void main(String[] args) {
	String word ="Java ";
	System.out.println(word.concat("and eclipce"));
	//word = word.concat(123) will not work
	String word2 ="Hi! ";
	word2 = word2.concat(" hey!").concat("-how are you?");//+ operator can do more 
	System.out.println(word2);
}
}
