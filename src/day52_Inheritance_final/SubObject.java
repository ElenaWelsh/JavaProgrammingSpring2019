package day52_Inheritance_final;

public class SubObject extends Object{
public static void main(String[] args) {
	// public void toString() trying to over ride will not compile
	SubObject sb = new SubObject() ;
	sb.toString();
	// == and equals() method: == checks if are pointing to same  object, but not value 
	// equals () method check data/value in the objects and both return boolean - part of
	// object class 
	// we can override equals() method in out custom class so that we can compare value
	//
	
}
}
