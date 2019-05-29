package day36_WrapperClasses_Arrays;
import java.util.*;
public class ArrayListExample {
public static void main(String[] args) {
	ArrayList<String> languages= new ArrayList<>();
	languages.add("Java");
	languages.add("English");
	languages.add("Arabic");
	languages.add("Russian");
	languages.add("Azerbaijani");
	languages.add("Ukranian");
	System.out.println(languages.size());//7
	languages.add("Turkish");
	System.out.println(languages.size());//8
	languages.remove(0);//7
	System.out.println(languages.toString());
	
}
}
