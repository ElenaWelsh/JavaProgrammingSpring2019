package day47_blocks;

import java.time.LocalDateTime;

public class BriteERP {
	static {
		System.out.println("Launch Browser");
		System.out.println("Navigate to: " + TestData.url);

	}
	public static void enterEmail() {
		System.out.println("Enter email: "+ TestData.email);
	}
	public static void enterPassword() {
		System.out.println("Enter email: "+ TestData.password);
	}
	public static void varifyLogin() {
		System.out.println("Expected name: "+ TestData.userName);
		System.out.println("Actual name: dicplayed: Victoria Ludovska");
		System.out.println("Login Successful - " + LocalDateTime.now());
	}
}
