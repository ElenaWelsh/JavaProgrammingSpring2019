package day31_Methods_Void;
//import java.util.*;
public class Authentication {
public static void main(String[] args) {
	//Scanner scan=new Scanner(System.in);
	login("mentoring@cybertekschool.com","mentor001");
	login("mentoring@cybertekschool.com","mentor002");
}



public static void login(String userName,String password) {
	String validUsername = "mentoring@cybertekschool.com";
	String validPassword = "mentor001";
	if(userName.equalsIgnoreCase(validUsername)&&password.equalsIgnoreCase(validPassword) ) {
		System.out.println("Log in succesful");
	}else {
		System.out.println("Log in fail");
	}
}
/*
 *Name: login
 *Return type: void
 *2 String args/params: username, password
 *Inside the method:
 *	validUsername = "mentoring@cybertekschool.com"
 *  validPassword = "mentor001"
 *  
 * if username and password match, print "Login Successful! Welcome to Okta"
 * if not: "Sign in failed!"
 */


}














