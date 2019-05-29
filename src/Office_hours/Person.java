package Office_hours;

public class Person {
private String firstName;
private String lastName;
private String birthday;

// the constructor
public Person(String bDay) {
	System.out.println("constructor");
	birthday=bDay;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getBirthDay() {
	return birthday;
}
//public void setBirthDay(String birthDay) {
//	this.birthday = birthDay;
//}
@Override
public String toString() {
	return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthDay=" + birthday + "]";
}

}
