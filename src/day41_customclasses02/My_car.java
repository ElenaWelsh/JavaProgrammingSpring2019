package day41_customclasses02;

public class My_car {
public static void main(String[] args) {
	Car car1 = new Car();
	car1.make = "Ford";
	car1.model ="Fiesta";
	car1.color ="Grey";
	car1.currentSpeed =55;
	
	car1.PrintCarInfo();
	car1.showCurrentSpeed(70);
	car1.accellerate(20);
	System.out.println(car1.currentSpeed);
	BMW bmw = new BMW();
	bmw.model = "740i";
	System.out.println(bmw.make);
	bmw.showPrice();
	System.out.println("Car price: "+ bmw.price);
} 
}
