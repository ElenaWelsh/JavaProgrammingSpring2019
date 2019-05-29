package day36_WrapperClasses_Arrays;

public class Boxing {
public static void main(String[] args) {
	// AUTOBOXING: converting from primitive to wrapper class object VS UNBOXING converting back to
	//primitive
	Integer num1 =1234;
	int n=5;
	Integer num2 = n;
	double d1 = 33.2;
	Double d2 = d1;
	
	
	long l1 =new Long (6000000);//unboxing
	Long l2 =new Long (3456789L);//no boxing
	long l3 = l2; //auto-unboxing
	Long l4= l3; //auto-boxing
	
	Integer num3 = Integer.valueOf(345);
	//Double d3 = num3; casting not possible with wrapper classes
}
}
