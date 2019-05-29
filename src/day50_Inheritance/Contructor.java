package day50_Inheritance;

public class Contructor extends Employee {
	@Override
	public void calculatePay(int hours, double rate) {
		double total =(hours*rate) +200;
		System.out.println("Contructors total pay: "+ total);
}
}