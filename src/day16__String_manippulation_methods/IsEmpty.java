package day16__String_manippulation_methods;

public class IsEmpty {
	public static void main(String[] args) {
		String userName = "";
		String password = "";
		System.out.println();
		if (userName.isEmpty()) {
			System.out.println("Username field cannot be empty");
		} else {
			System.out.println("Username is not empty");
		}
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and password cannot be empty");
		}else {
			System.out.println("User or password is not empty");
		}
			

	}
}
