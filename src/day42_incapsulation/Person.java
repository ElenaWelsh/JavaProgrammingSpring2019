package day42_incapsulation;

public class Person {
	private String name;
	private int age;
    // getter and setter public method getter read only
	public String getName() {
		return name;
	}
	// setter write only method void
	public void setName(String name) {
		this.name = name;
	}
	
}
