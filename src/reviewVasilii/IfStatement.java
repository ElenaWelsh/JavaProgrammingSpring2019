package reviewVasilii;
import java.util.*;
public class IfStatement {
public static void main(String[] args) {
	//int age = 20;
	Scanner scan = new Scanner(System.in);
	System.out.println("What is your age?");
	int age=scan.nextInt();
	if(age<21 && age>0) {
		System.out.println("Underage! Get out!");//if condition true
	}else if (age<1){
		System.out.println("Invalid age");
	}else {
		System.out.println("You are fine, you can come in!");// if condition false
	}
	
}
}
