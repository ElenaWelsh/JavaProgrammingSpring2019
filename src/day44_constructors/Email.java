package day44_constructors;

public class Email {
	String message;
public Email(String message) {
	System.out.println("Sending email: "+ message);
	this.message = message;
}
}
