package day23_Loop_Control_Nested_Arrays;

public class Array1a {
public static void main(String[] args) {
	 
			int[] numbers = new int[3];
			int num1 =5;
			int num2 =7;
			int num3 =10;
			numbers[0]=num1;
			numbers[1]=num2;
			numbers[2]=num3;
			
			
			for(int i =0; i<numbers.length;i++) {
				System.out.println(numbers[i]);
			}
			
	byte[]	bytesArray = new byte[4];
	String[] names = new String[5];
	String[] names2 = {"Shaun","Roman","Vlad","Burak","Maria"};
	System.out.println(names2[4]);
	System.out.println("Number of items: "+names2.length);
	String[] countries = {};// empty array not created
	String name1 = null;
	String[]fruits=new String[]	{"apple","orange"};
	// for each loop
	for(String fruit : fruits) {
		System.out.println(fruit
				);
	}
			
}
}
