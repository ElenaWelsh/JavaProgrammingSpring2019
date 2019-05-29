package day47_blocks;

public class VariableAccess {
	// instance variable
	int myInstanceVariable = 40;
	
	//static variable
	static int myStaticVariable= 55;
	
public static void main(String[] args) {
	//System.out.println(myInstanceVar);  static main method can not access non-static var
	System.out.println(myStaticVariable);
	// the only way to access non-static var is creating an object
	VariableAccess v = new VariableAccess();
	System.out.println(v.myInstanceVariable);
	System.out.println(v.myStaticVariable);
	System.out.println(VariableAccess.myStaticVariable);
	
	
	
}
}
