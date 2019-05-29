package day52_Inheritance_final;

public class FinalMethods {
public final void method1() {
	System.out.println("Final method 1");
}
class Sub extends FinalMethods{
	//public final void method1() {                 can not override because it 
	//	System.out.println("Overrided  method 1");        is final, but can be 
//	}                                                    //overloadedd

	public final void method1(String str) {
		System.out.println("Overloaded method 1");
	}
} 
}
