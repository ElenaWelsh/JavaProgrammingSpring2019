package day0_Previouse;
import java.util.*;
public class LoopTotalPrice {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("How many items do you have");
	int itemsCount= scan.nextInt();
	String item ="";
	String allItems="";
	double price=0;
	double total=0;
	if (itemsCount>0) {
	for(int i=1; i <=itemsCount;i++) {
	  System.out.println("What is the item "+i+"?");
	  item = scan.next();
	  if (i ==itemsCount ) {
	  allItems+=item;
	  }else {	
		  allItems+=item+"," ; 
	  }
	  System.out.println("How much for the " + item+"?");
	   price= scan.nextDouble();
	   total+=price;
	}
	System.out.println("Your items: "+ allItems);
	System.out.println("Your total price: $" + total);
}
}
}