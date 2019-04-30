package day11_logical_nestedif;

public class TruthTables {
	public static void main(String[] arg) {
		System.out.println("TRUTH TABLE FOR && OPERATOR");
		System.out.println("When true&&true - Resalt is "+ (true&&true));//true
		System.out.println("When true&&false - Resalt is "+ (true&&false));//false
		System.out.println("When false&&true - Resalt is "+ (false&&true));//false
		System.out.println("When false&&false - Resalt is "+ (false&&false));//false
		System.out.println();
		
		System.out.println("TRUTH TABLE FOR || OPERATOR");
		
		System.out.println("When true||true - Resalt is "+ (true||true));//true
		System.out.println("When true||false - Resalt is "+ (true||false));//true
		System.out.println("When false||true - Resalt is "+ (false||true));//true
		System.out.println("When false||false - Resalt is "+ (false||false));//false
		System.out.println();
		
		System.out.println();
		System.out.println("TRUTH TABLE FOR !(NOT) OPERATOR");
		System.out.println("When !true - result is "+ (!true));//false
		System.out.println("When !false - result is "+ (!false));//true
	}

}
