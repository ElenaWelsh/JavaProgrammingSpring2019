package day16__String_manippulation_methods;

public class CapitalCity {
public static void main(String[] args) {
	String str= "Moscow is a capital of Russia";
	str = str.replace("Moscow","Baku").replace("Russia","Azerbaijan");
	System.out.println(str);
	String email = "firstName_LastName@gmail.com";
	String company = "deloitte";
	String newEmail = email.replace("gmail", company);     
}
}
