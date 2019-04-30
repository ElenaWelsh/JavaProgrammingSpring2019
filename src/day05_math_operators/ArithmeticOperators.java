package day05_math_operators;

public class ArithmeticOperators {
	public static void main(String[] args) {
		// + addition operator
		System.out.println(55+5);
		int chairs = 140;
		System.out.println(chairs + 2);
		
		int moreChairs = chairs + 5;
		System.out.println(moreChairs);
		
		int tables = 130;
		
		int total = tables + chairs;
		System.out.println(total);
	    
		//Subtraction. Minus
		System.out.println(500-123);
		int result = 44-23;
		System.out.println(result);
		
		double balance = 1200.50;
		double transaction = 56.44;
		System.out.println(balance - transaction);
		balance = balance-transaction;
		
		
		//create a variable linesOfCode and assign 50
		
		int linesOfCode = 50;
		System.out.println("Lines of code " + linesOfCode);
		linesOfCode = linesOfCode - 2;
		System.out.println("Lines of code "+ linesOfCode);
		
		//multiplication*
		System.out.println(22*2);
		
		int classes = 5;
		System.out.println(linesOfCode * classes);
		int totalLinesOfCode = linesOfCode * classes;
		System.out.println("totalLinesOfCode=" + totalLinesOfCode );
		
		//DIVISION operator/
		
		System.out.println(10/3);
		//Division of whole number with whole number gives whole number
		
		System.out.println(55/5);//11
		System.out.println(10.0/3);//3.3333333333
		System.out.println(15/7);//2
		System.out.println(15.0/2);//7.5
		System.out.println(5.0/2.0);//2.5
		System.out.println(5/2.0);//2
		System.out.println();//divide by 0,compiler will compile, 
		//but when code is running it will give error
		System.out.println("number" + 10+10);//110
		System.out.println("number" + (10+10));//20
		System.out.println("number" + 10/10);//1
		System.out.println("number" + 5/2); //2
		System.out.println("number" + 5/2.0);//2.5
		System.out.println("number" + 5.0/2);//2.5
		
	}

}
