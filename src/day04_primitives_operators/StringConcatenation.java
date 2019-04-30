package day04_primitives_operators;

public class StringConcatenation {
	public static void main(String[] args) {
		String firstName = "Elena";
		System.out.println("My name is " + firstName);
		String city = "Perm";
		System.out.println("I was born in " + city);
		String job = "SDET";
		String company = "any company";
		System.out.println("I work as " + job + " in " + company);
		int zipcode = 22202;
		System.out.println("I live in " +  zipcode + " zipcode");
		
		String city1 = "Tashkent";
		String city2 = "Kyiv";
		String city3 = "Moscow";
		System.out.println("From "+ city1 + " to " + city2 + " is $500");
		System.out.println("From "+ city3 + " to " + city1 + " is $550");
		System.out.println("I have been to " + city1 + ", " +  city3 + ", " + city2 + ".");
		String app = "Slack";
		
		System.out.println("We use "+app+" for messaging with Classmates");
		app = "Skype" + " and Slack";
		System.out.println("We use "+app+" for messaging with Classmates"); 
		
	}

}
 