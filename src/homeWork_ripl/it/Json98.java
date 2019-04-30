package homeWork_ripl.it;
import java.util.*;
public class Json98 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
			String json = scan.nextLine();
		//input:{"id": 1934, "firstName": "James", "lastName": "May", "role": "student-team-member"}
	   // json.replace("firstName", "#");
	     int a =json.indexOf("firstName")+13;
	     int b = json.indexOf("\",",a);
	     System.out.println("First name: " + json.substring(a,b));
	     int c =json.indexOf("lastName")+12;
	     int d = json.indexOf("\",",c);
	     System.out.println("Last name: "+json.substring(c,d));
	  }
	}

