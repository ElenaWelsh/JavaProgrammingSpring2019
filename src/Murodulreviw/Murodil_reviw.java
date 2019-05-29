package MurodulReviw;

public class Murodil_reviw {
public static void main(String[] args) {
	
	String day="Monday";
	// check if end with day
	// ends with
	if(day.endsWith("day")){
		System.out.println("Ends with day");
	}else {
		System.out.println("Does not end with day");
		// create p
		String myDay = "Saturday";
		if(day.substring(day.length()-3).equals("day")) {
			System.out.println("last 3 are day");
		}
	}
	
}
}
