package day38_ArrayList;
import java.util.*;
public class AddAllremoveAll {
public static void main(String[] args) {
	List<String> l1=new ArrayList<>();
	l1.add("java");
	l1.add("python");
	
	List<String> l2 = new ArrayList<>();
	l2.add("C#");
	l2.add("C++");
	
	l2.addAll(l1);
	System.out.println(l2);
	l2.addAll(l1);
	System.out.println(l2);
	l1.addAll(l2);
	System.out.println(l1);
	l2.remove("C#");
	System.out.println(l2);
}
}
