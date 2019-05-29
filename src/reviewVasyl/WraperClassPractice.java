package reviewVasyl;

public class WraperClassPractice {
public static void main(String[] args) {
	int num= 10;
	
	Integer num2 = new Integer(10);
	Integer num3 = new Integer(10);
	System.out.println(num==num2);//true
	System.out.println(num ==num3);//true
	System.out.println(num2==num3);//false automatic unboxing
	System.out.println(num2.intValue()==num3.intValue());// checking value
	System.out.println(num2.equals(num3));
	
}
}
