package day07_scanner_operators;

public class ImplicitCasting {
	public static void main(String[] args) {
		// automatic casting from  smaller to larger type
		short shortValue = 3455;
		int intValue = shortValue;
		//int intValue = (int)shortValue;
		System.out.println("int value: "+intValue); 
		
		
		
		double price = 345;
		System.out.println("Price after casting: " + price); 
		int price1 = 34567;
		double dprice=price1;
		System.out.println("dprice after casting: " + dprice);
			
	}

}
