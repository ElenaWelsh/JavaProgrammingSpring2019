package day38_ArrayList;
import java.util.ArrayList;
public class RawArrayList {
public static void main(String[] args) {
	ArrayList list=new ArrayList();
	list.add("Saturday");
	list.add("Java day");
	list.add(1000);
	list.add(234.4);
	list.add(true);
	list.add(false);
	System.out.println(list.toString());// automaticly call toString
	
	String allValues = list.toString();
	System.out.println(allValues);
	// all values are stored as raw type, we can also call it as a general object type
	//can not do anything, only print it, can not store in to String without spetial manipulations
	
	
}
}
