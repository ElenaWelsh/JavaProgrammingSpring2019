package day39_ArrayList;
import java.util.*;
public class Cities {
public static void main(String[] args) {
	ArrayList<String> cities = new ArrayList<>();
    
    cities.add("Tokyo");
    cities.add("New York");
    cities.add(0,"Paris");
    cities.add("Pittsburgh");
    cities.add(1,"Berlin");
    cities.add("Madrid");
    cities.add("Moscow");
    cities.add("Istanbul");
    cities.add("Washington D.C.");
    cities.add("Amsterdam");
    cities.add("Zurich");
    cities.add("Singapore");
    cities.add("Milan");
    cities.add("Toronto");
    cities.add("London");
    cities.add("Lima");
    for (String city: cities) {
    	System.out.print(city + " | ");
    }
    System.out.println();
    
    for( int i =0; i< cities.size(); i++) {
    	System.out.print(cities.get(i)+" | ");
    }
    System.out.println();
    
    // to String()
  
    System.out.println(cities.toString().toUpperCase());
    
     // Make each city all upper case
   // String paris = cities.get(0).toUpperCase(); just one city change
    cities.set(1,cities.get(1).toUpperCase());
    
    for( int j =0; j< cities.size(); j++) {
    	String city = cities.get(j).toUpperCase();
    	cities.set(j, city);
    }
    	System.out.println(cities.toString());
    	
    	// Find longest city and shortest
    	String longest ="";
    	for (String city: cities) {
        	if( city.length()>longest.length()) {
        		longest = city;
        	}
    	}
        	System.out.println("Longest City: " + longest);
        	
        	
        	String shortest =cities.get(0);
        	for (String city: cities) {
            	if( city.length()<shortest.length()) {
            		shortest = city;
            	}
        	}
            	System.out.println("Shortest City: " + shortest);
            
            	 ArrayList<String> citiesMoreThan6 = new ArrayList<>();
                 //assign all cities that have more than 6 chars to this arraylist
                 
                 for(String ct : cities) {
                         if(ct.length() > 6) {
                             citiesMoreThan6.add(ct);
                         }
                 }
                 
                 System.out.println(citiesMoreThan6);
                 
    	
}    
}

