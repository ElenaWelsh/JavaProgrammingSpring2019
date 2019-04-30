package day08_casting_conditionals;

public class CastingPrimitives {
	public static void main(String[] args) {
		// cast double value to Integer
		int i = (int)3.4; //will remove .4
		System.out.println("i: "+i);
		double price = 230.50;
		int dollars = (int)230.50;
		System.out.println("Dollars: " + dollars);
		System.out.println("Price: " + price);
		int count = 66;
		
		byte byteCount = (byte)count;
		System.out.println("Byte count: " + byteCount);
		 
		long longValue= 34567L;
		int intValue = (int)longValue;
		System.out.println("Int value:  " + intValue);
		int result = (int)(500.4/2.0); 
		System.out.println("Result: " +result);
		
		byte b = 123;
			int t = (int)b; // optional casting or implicit casting from smaller type to
			// larger casting
		// Explicit casting is used when converted from larger type to smaller type
			//byte to Intenger
		
	}

}
