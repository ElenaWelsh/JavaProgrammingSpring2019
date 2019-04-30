package day32_methods;
import java.util.*;
public class Cooking {
	public static void main(String[] args) {
	
	//	makePancakes();
	//	makePasta();
		cook("Omelette","Eggs, Salt, Tomatoes, Green Peppers");
	}

	public static void add(String ing) {
		System.out.println("Add " + ing );
	}
	
	public static void mix(int sec) {
		System.out.println("Mix for "+ sec+ " seconds");
	}
	
	public static void fry(int min) {
		System.out.println("Fry for " + min+ " minutes");
	}
	
	public static void boil(int min) {
		System.out.println("Boil it for "+ min+" minutes");
	}
	
	public static void makePancakes() {
		System.out.println("Pancakes recipe");
	    add("Milk,Eggs,Flour,Sugar,Salt");
	    mix(120);
	    fry(3);
	    System.out.println("Enjoy");
	}
	
	public static void makePasta(){
		System.out.println("Pasta Recipe");
		add("Water,solt,olive oil");
		boil(2);
		add("Spagetti Pasta");
		boil(9);
		mix(60);
		add("Parmesan cheese");
		System.out.println("ENjoy your Pasta");
	}
	public static void cook(String dish,String ingredients) {
		System.out.println("--  "+ dish.toUpperCase()+ "  Recipe   --");
		add(ingredients);
		System.out.println("Cook it until it is cooked");
		System.out.println("--   "+ dish.toUpperCase() + "  is Ready   --");
	}
	
}
