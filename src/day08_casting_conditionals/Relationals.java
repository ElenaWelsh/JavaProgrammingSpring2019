package day08_casting_conditionals;

public class Relationals {
	public static void main(String[] args) {
		double d1 = 23.56;
		double d2 = 20.43;
		System.out.println(d1>=d2);
		boolean check = d1>=d2;
		System.out.println("Check:"+ check);
		
		//boolean b = true>false; can not compere booleans
		boolean b = true==false; //false
		b = true != false;
		
	}

}
