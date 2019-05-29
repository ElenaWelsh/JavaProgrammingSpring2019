package standAlongTask;
import java.util.*;
public class ArrayListPractice {
public static void main(String[] args) {
	ArrayList <String> list = new ArrayList<>();
	list.add("Apple"); list.add("Orange"); list.add("Grapes"); list.add("Banana");
	System.out.println(list); // with[]
	System.out.println(list.toString());// with[]
	for(int i = 0; i<list.size(); i++) {
		System.out.print(list.get(i)+ " "); //need loop to print without[]
	}
	System.out.println();
	System.out.println(list.get(0));//Apple
	System.out.println(list.contains("Grapes"));// case sensitive
	System.out.println(list.indexOf("Apple")); // index of Apple 0
	System.out.println(list.size()); // number of elements  4
	System.out.println(list.isEmpty());
	list.set(1,"Pear");
	System.out.println(list);
	list.add(0,"Orange");
	System.out.println(list); 
}
}
