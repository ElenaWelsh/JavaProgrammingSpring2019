package day25_Array_In_Java;

public class PopulationArray {
public static void main(String[] args) {
	int [] population = new int[5];
	population[0] = 5000;
	population[1] = 10000;
	population[2] = 7000;
	population[4] = 8907;
	population[3] = 4455;
	System.out.println("City 0 population " +population[0]);
	
	// int[] population = {5000, 10000, 7000, 8907, 4455};
	
	int idx  = 0;
	idx++;
	System.out.println("City 1 population " +population[idx]);
	String str = "abc";
	System.out.println("City str population " +population[str.length()]);
	
	//String array cities
	String[]cities = {"Miami", "London","Tokio","Rome","New York"};
	// population of Miami
	System.out.println("Population of "+ cities[0] +" is "+ population[0]);

	System.out.println("Population of "+ cities[1] +" is "+ population[1]);

	System.out.println("Population of "+ cities[2] +" is "+ population[2]);

	System.out.println("Population of "+ cities[3] +" is "+ population[3]);

	System.out.println("Population of "+ cities[4] +" is "+ population[4]);
	
	
}
}
