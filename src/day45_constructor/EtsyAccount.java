package day45_constructor;
import java.util.*;
public class EtsyAccount {
	private String email;
	private String firstName;// null is not empty string
	private String password;

// first constructor no args set empty
	public EtsyAccount() {
		email = "";
		firstName = "";
		password = "";
	}
	// constructor number 2
	// takes 3 args and set them using setters
	public EtsyAccount(String email, String firstName,String password) {
		this.setEmail(email);
		setFirstName(firstName);
		setPassword(password);
	}
	
	//constructor 3 email. firstName with setters and autogenerate password
	public EtsyAccount(String email, String firstName) {
		setEmail(email);
		setFirstName(firstName);
		this.password= getRandomPassword();
	}
	
	private String getRandomPassword() {
		Random rd = new Random();
		   String letters = "abcdefghijklmnopqrstuvwxyz0123456789";
	        String rdPassword = "";
	        for(int i = 1; i <= 6; i++) {
				rdPassword+=letters.charAt( rd.nextInt( letters.length()));
			}
			return rdPassword;
		}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email.indexOf("@")>0 && email.indexOf("@")<email.length()-1) {
			this.email = email;
			}else {
				System.out.println( "Please enter a valid email address");
			}
		
	}

	public String getFirstName() {
		
		return firstName;
	}
	private boolean isValidFirstName(String firstName) {
		if (firstName.isEmpty()) {
			System.out.println("Can not be blank");
		}
		if (firstName.startsWith(" ")||firstName.endsWith(" ")) {
			return false;
		}
		for (int i=0; i< firstName.length(); i++) {
			char ch =firstName.charAt(i);
			if(!Character.isAlphabetic(ch)&& ch !=' ') {
				return false;
			}
		}
		return true;
	}

	public void setFirstName(String firstName) {
		if(isValidFirstName(firstName)) {
		this.firstName = firstName;
		}else {
			System.out.println("Your first name contains invalid characters.");
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(password.length()<6) {
			System.out.println("Invalid password");
			this.password="";
		}else {
		this.password = password;
	}
	}
	@Override
	public String toString() {
		return "Etsy [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
	}
	

}
