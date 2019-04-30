package day29_ArraysAndMethods;

public class CustomMethods {
public static void main(String[] args) {
//	System.out.println("Student is studying");
//	System.out.println("Student is eating");
//	System.out.println("Student is studying");
	
	sayHello();
	study();//calling the method
	study();
	study();
	code();
	
}
	public static void study() {
		System.out.println("Student is studying");	
	}
	//created method say hello
	
	
	public static void sayHello() {
		System.out.println("Hello friends!");
		System.out.println("How are you today?");
	}
	public static void code() {
		System.out.println("Inside code method");
		System.out.println("Student is coding java");
	}
	
	






	
}

