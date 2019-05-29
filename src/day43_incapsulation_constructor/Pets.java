package day43_incapsulation_constructor;

public class Pets {
private String type;
private String name;

public Pets(String type,String name) {
	this.type=type;
	this.name=name;
}
public Pets() {
	System.out.println("NO args constractor");
}
public void speak() {
	switch(type.toLowerCase()) {
	case "cat":
		System.out.println("Myauu");
		break;
	case "dog":
		System.out.println("Woof woof");
		break;
	case "bird":
		System.out.println("Churp, chip");
		
	}
}
@Override
public String toString() {
	return "Pets [type=" + type + ", name=" + name + "]";
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
