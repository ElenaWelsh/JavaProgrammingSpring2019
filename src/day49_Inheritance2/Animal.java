package day49_Inheritance2;

public class Animal {
 private String type;
 
 public Animal() {
	 System.out.println("Animal Constructor");
	 type ="undefined";
 }	 
	 public Animal (String type) {
		 this.type = type;
 }
	 
 

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}
}
