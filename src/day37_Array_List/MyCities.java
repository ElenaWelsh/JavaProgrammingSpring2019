package day37_Array_List;
import java.util.*;
public class MyCities {
public static void main(String[] args) {
	ArrayList<String> cities = new ArrayList<>();
	cities.add("Barnaul");
	cities.add("Dushanbe");
	cities.add("Sterling");
	cities.add("Baku");
	cities.add("Tashkent");
	cities.add("Baku");
	for(String city : cities) {
		System.out.print(city + " ");
	}
	System.out.println();
	for(int i=0; i<cities.size(); i++) {
		System.out.println(cities.get(i)+" ");
	}
	cities.remove("Baku");
	System.out.println(cities.toString());
	System.out.println(cities);
	cities.add(0, "Miami"); // adding to certain position and shifting the rest
	System.out.println(cities);
	
	cities.add(1, "Istanbul");
	System.out.println(cities);

    int idx= cities.indexOf("Sterling");
     cities.set(idx, "Zagreb");
     boolean empty = cities.isEmpty();
     System.out.println(empty);
}
}
