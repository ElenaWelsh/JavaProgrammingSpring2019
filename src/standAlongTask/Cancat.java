package standAlongTask;

public class Cancat {
public static void main(String[] args) {
	
	String helloName1="Bob";                          // → "Hello Bob!"
	String helloName2 ="Alice";                       // → "Hello Alice!"
	String helloName3="X";   
	helloName1="Hello " + helloName1.concat("!");
	System.out.println(helloName1);                    // → "Hello X!"
}
}
