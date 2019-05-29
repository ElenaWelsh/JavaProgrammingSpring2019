package day52_Inheritance_final;

public class FinalVariables {
	final int ROADSTER_MAX_RANGE = 610;
	// instance variable has to give value here right away  or
	final int MAX_SPEED ;
	
	final int MODEL_X_PASSENGERS;
	
	public FinalVariables() {
		MAX_SPEED =180;                    	//or constructor or
	}
	
	{
		MODEL_X_PASSENGERS =7;
			}                          //Initializing block
	
public static void main(String[] args) {
	final int MAX_PASSAGERS_COUNT = 5; //local variable inside method, 
	//can not be static or have access modifier
	// MAX_PASSAGERS_COUNT=10    will not compile, final convention write upper case
	double M =  Math.PI;
	FinalVariables var = new FinalVariables();
	System.out.println("Max range for roadster"+ var.ROADSTER_MAX_RANGE );
}
}
