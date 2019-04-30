package day24_Arrays;

public class Cities {
public static void main(String[] args) {
	String[] cities = {"Washington D.C.", "Kiev", "Annandale", "Moscow",
			"Istanbul","Baku","Miami","McLean"};
	System.out.println(cities.length);
	// print cities starts with "M"
	for (int i =0; i<cities.length; i++) {
		if(cities[i].startsWith("M")) {
			System.out.println(cities[i]);
		}
	}
}
}

