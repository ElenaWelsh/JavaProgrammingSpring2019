package day06_operators2;

public class ShortHandOperators {
	public static void main(String[] args) {
		int students = 45;
		students = students+5;
		System.out.println("Students " + students);
		students = students - 2;
		System.out.println("students: " + students);
		int teachers = 10;
		System.out.println(teachers);
	    teachers +=2;
	     //teachers = teachers + 2
	    teachers -=5; //decrease by 5
	    System.out.println("Teachers: " + teachers);
	    
	    
	    int cars = 12;
	    cars*=2; // cars = cars * 2
	    System.out.println(cars);
	    cars +=cars; //cars =  cars + cars
	    
	    int shoes = 20;
	    shoes /= 4;
	    System.out.println("Shoes : " + 20 / 4.0 );
	    
	    double price = 45.50;
	    int amount = 5;
	    price +=amount;
	    System.out.println(price);
	    
	    int minutes = 66;
	    minutes %= 60; // minutes = minutes % 60
	    System.out.println("Remaining : " + minutes);
	     
	    
	    
	    
	    
	    
	}    

}
