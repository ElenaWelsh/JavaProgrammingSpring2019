package day46_static_keyword;

public class Customer {
	private String name;// instance variable depending on object
	private String email;
	static int count;   //one central copy of this variable can acceces though class or object

	public Customer() {
		name = "undefined";
		email = "undefined";
		count++;
	}

	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
		count++;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
}
