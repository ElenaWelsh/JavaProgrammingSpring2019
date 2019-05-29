package day42_incapsulation;
import java.util.*;
public class Starbucks {
public static void main(String[] args) {
	Coffee [] coffeeArray= new Coffee[2];  //cteate array
	coffeeArray[0] = new Coffee(); //creat object
	coffeeArray[0].setCoffeeInfo("EXPRESSO", "TALL", 2.55, 7);
	coffeeArray[0].getCoffeeInfo();
	
	Coffee latte = new Coffee();
	latte.setCoffeeInfo("CAFE LATTE", "GRANDE", 3.85, 190);
	coffeeArray[1]=latte;
}
}
