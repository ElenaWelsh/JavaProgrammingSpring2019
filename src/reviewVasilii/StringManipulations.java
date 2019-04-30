package reviewVasilii;

public class StringManipulations {
public static void main(String[] args) {
	String word = "java";// literal
	word=word.toUpperCase();
	System.out.println(word);
	String word2 = new String("java");
	word2=word2.toUpperCase();
	System.out.println(word==word2);//false  only checks location
	
	System.out.println(word.equals(word2));//true equals method checks value
}
}
