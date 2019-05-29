package Office_hours;

public class CreatePeopleHere {
public static void main(String[] args) {
	
	//when we use constructors certain actions are being taken during the process
	//of creating the object
	Person john = new Person("01/01/2000");
	System.out.println(john.getBirthDay());
	
	john.setFirstName("John");
	john.setLastName("Doe");
	
	
	System.out.println(john.getFirstName());
	System.out.println(john.getLastName());
	System.out.println(john.getBirthDay());
	
	john.setFirstName("Smith");
	System.out.println(john.getFirstName());
	
}

}
