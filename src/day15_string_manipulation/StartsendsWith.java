package day15_string_manipulation;

public class StartsendsWith {
public static void main(String[] args) {
	String word1 = "eclipse";
	System.out.println(word1.startsWith("e"));//true
	System.out.println(word1.startsWith("ec"));//true
	System.out.println(word1.startsWith("ecli"));//true
	System.out.println(word1.startsWith("Ec"));//false: case sensitive
	System.out.println(word1.endsWith("e"));//true
	System.out.println(word1.endsWith("ipse"));//true
	System.out.println(word1.endsWith("java"));//false
	                          //ECLIPSE
	System.out.println(word1.toUpperCase().endsWith("PSE"));//true
	String name= "Mr. Jackson";
	if (name.startsWith("Mr.")) {
	System.out.println("man");
	}else if (name.startsWith("Mrs.")){
	System.out.println("married woman");
	}else if (name.startsWith("Ms.")) {
	System.out.println("some woman");
	}else if (name.startsWith("Dr.")) {
	
	
	
}
}
}