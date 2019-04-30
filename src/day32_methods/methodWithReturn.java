package day32_methods;

public class methodWithReturn {
public static void main(String[] args) {
	
	System.out.println(giveMe10$());
	int i=giveMe10$();
	System.out.println(i);
	String Myname=giveMeYourName();
	System.out.println("My name is "+ Myname );
	
}	
	// method returns int value
	public static int giveMe10$() {
		System.out.println("Returning 10 from method");
		return 10;
	}
	
	public static String giveMeYourName() {
	String name = "Murodil";
		return name;
    }

}
