package day19__Loops;
import java.util.*;
public class Transactions {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("what is your ballance?");
	double balance = scan.nextDouble();
	int count = 0;
	while (balance>0) {
		count++;
		System.out.println("What is transaction #" + count + " amount?");
		  double transaction=scan.nextDouble();
		    if (transaction > balance) {
			System.out.println("Your balance is about to be 0 or negative due to this transaction");
			continue;//go on top of the loop right away
		}
		     balance -=transaction; //balance =balance - transaction
		     System.out.println("Current balance: "+balance);
	
	}
	   
		System.out.println("You have insuffitient funds for any more, your balance is "+ balance);
		System.out.println("Transaction total count: "+ count);
	}
}

 