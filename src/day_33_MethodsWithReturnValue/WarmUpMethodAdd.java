package day_33_MethodsWithReturnValue;

public class WarmUpMethodAdd {
	public static void main(String[] args) {
		
	addVoid(2,5);
    System.out.println(add(4,8));
	int result=add(4,8);
	
	System.out.println(result);
	result = add(9,8);
	System.out.println(result);
	System.out.println(multiply(7,8));
	System.out.println(minus(6,8));
	System.out.println(divide(5,0));
	
	
	} 
	

	public static void addVoid (int num1, int num2) {
		int sum=num1+num2;
		System.out.println("Sum " +sum);
	}

	public static int add (int num1,int num2) {
		int sum=num1+num2;
		return sum;
	}
	
	public static double multiply(int num1,int num2) {       //  Method: multiply with return value
		int result=num1*num2;
		return result;                                           
	}
	
	public static double minus(int num1, int num2) { 
		if (num2==0) {
			System.out.println("Error");
			System.exit(0); 
			return 0;                                         //Method: minus with return value
		}else {
		int result=num1-num2; 
		return result;
		}
	}
	
	public static double divide(int num1, int num2) {
		int result=num1/num2;                                       //Method: divide with return value
		return result;
	}
	
	
	}
