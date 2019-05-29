package day38_ArrayList;
import java.util.*;
public class ContainsMethod {
public static void main(String[] args) {
	ArrayList<String> list1 = new ArrayList<>();
	list1.add("Jan");
	list1.add("Feb");
	list1.add("Mar");
	list1.add("Apr");
	list1.add("May");
	ArrayList<String> list2 = list1;// this way it will point to the same abject
	ArrayList<String> months = new ArrayList<>(list1);//copy all the values from list one,
	//but not the same object
	months.add("Jun");
	months.add("Jul");
	months.add("Aug");
	System.out.println(months.contains("Jan"));//checks anywhere in my list
	System.out.println();
	System.out.println(months.indexOf("Feb"));
	System.out.println(months.get(1).equals("Feb"));
	
	ArrayList<String> month2 = new ArrayList<>(list1);
    
    System.out.println("Month:" + months.toString());
    System.out.println("Month2:" + month2.toString());
    
    if (months.containsAll(month2)) {
    	System.out.println("All months are there");
    }else {
    	System.out.println("Some values are missing");
    }
    
	String m = months.get(0);
	System.out.println(m);
}
}
