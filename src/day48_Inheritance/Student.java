package day48_Inheritance;

public class Student extends Person {
	int studentID;
	String clazz;
	
	
	public void code(String lang) {
		System.out.println(name +" is codding "+ lang);
	}

	public void attendClass() {
		System.out.println(name + " is attending " + clazz + "class");
	}
}
