package day33_MethodsWithReturnValue;

public class Calctests {
public static void main(String[] args) {
	System.out.println(WarmUpMethodAdd.add(3,8));
	int addResult=WarmUpMethodAdd.add(21,41);
	double mResult = WarmUpMethodAdd.multiply(50,40);
	double miResult=WarmUpMethodAdd.minus(3000,200);
	double dResult=WarmUpMethodAdd.divide(455,5);
	System.out.println("addResult "+addResult);
	System.out.println("mResult " +mResult);
	System.out.println("miResult "+miResult);

	if(WarmUpMethodAdd.add(10,16)==26) {
		System.out.println("Add Unit Test pass");
	}else {
		System.out.println("Add Unit Test failed");
	}

}
}
