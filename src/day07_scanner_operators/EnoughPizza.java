package day07_scanner_operators;

public class EnoughPizza {
	public static void main(String[] args) {
		// slices in pizza 8
		// slice per student 2
		int pizzaCount = 30;
		int studentCount =145;
		int slicesCount = 30 * 8;
		
		boolean isEnoughPizza = slicesCount/studentCount>=2; 
		boolean isEnoughPizza1 = pizzaCount * 8 >= studentCount *2;
		System.out.println(isEnoughPizza);
		System.out.println(isEnoughPizza1);
		
		
	}

}
