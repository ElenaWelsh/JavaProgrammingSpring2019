package homeWork_ripl.it;
import java.util.*;
public class ShoppingList {
	/*In this assignment, you will write a program that will generate a shopping list.
	 *  It's more advanced version of assignment #22 (Shopping list I).
	Your program should ask use to enter items followed by its price. After adding item, 
	 ask user if he wants to add one more item. If so, repeat previous steps again. If no,
	  print shopping list report and total price as show in examples. Your program should
	   accept up to 10 items. 
	Hint: use do while loop.output: Enter Item1 and its price:
input: Tomatoes
input: 5.5
output: Add one more item?
input: yes
output: Enter Item2 and its price:
input: Cheese
input: 3.5
output: Add one more item?
input: yes
output: Enter Item3 and its price:
input: Apples
input: 6.3
output: Add one more item?
input: no
output: Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
output: Total price: 15.3
*/
public static void main(String[] args) {
	int itemNum =1;
	String itemName,moreItem,list = "";
	double price, totalPrice =0.0;
	Scanner scan=new Scanner(System.in);
	do  {System.out.println("Enter item" +itemNum+ " and its price: ");
	itemName = scan.next();
	price = scan.nextDouble();
	System.out.println("Add one more item?");
	moreItem = scan.next();
	totalPrice += price;
	list+="Item"+itemNum+": "+itemName+ " Price:"+ price+", ";
	itemNum++;
	} while (moreItem.equalsIgnoreCase("yes")); 
	System.out.println(list.substring(0,list.length()-2));
	System.out.println("Total price: " + totalPrice+"$");
	
}
}
