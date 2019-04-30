package day12_switch_ternary;
import java.util.*;
public class GroupCalculatorwrong {
	  public static void main(String[] args) {
	   //WRITE YOUR CODE HERE
	   Scanner scan = new Scanner(System.in);
	   int people;
	   double checkAmount=0.0, totalTip=0.0, totalPerPerson=0.0, tipPerPerson=0.0, totalToPay=0.0;
	   String service;
	   boolean split;
	   System.out.println("Split the bill?");
	   split = scan.nextBoolean();
	   System.out.println("Number of people?");
	   people = scan.nextInt();
	   System.out.println("Check Amount: "); 
	   checkAmount = scan.nextDouble();
	   System.out.println("Service Quality:");
	    service=scan.next();
	    System.out.println("Number of people entered : "+people);
	    
	        switch(service){ 
	           case "Poor":
	                      totalTip  = checkAmount/100*5;
	                      totalToPay = checkAmount + totalTip;
	                      System.out.println("Total to pay: "+ totalToPay);
	                      System.out.println("Total tip: " + totalTip);
	                      break;
	           case "Fair":
	                       totalTip =checkAmount/100*10;
	                       totalToPay = checkAmount + totalTip;
	                      System.out.println("Total to pay: "+ totalToPay);
	                      System.out.println("Total tip: " + totalTip);
	                      break;
	           case "Good":
	                      totalTip=checkAmount/100*15;
	                      totalToPay = checkAmount + totalTip;
	                      System.out.println("Total to pay: "+ totalToPay);
	                      System.out.println("Total tip: " + totalTip);
	                      break;
	           case "Great":
	                      totalTip = checkAmount/100*20;
	                      totalToPay = checkAmount + totalTip;
	                      System.out.println("Total to pay: "+ totalToPay);
	                      System.out.println("Total tip: " + totalTip);
	                      break;
	           case "Exellent":
	                      totalTip = checkAmount/100*25;
	                      totalToPay = checkAmount = totalTip;
	                      System.out.println("Total to pay: "+ totalToPay);
	                      System.out.println("Total tip: " + totalTip);
	                       break;
	                      }
	             if (split ==true){
	                           if ( people>0 && people<=10){
	                                totalPerPerson = totalToPay/people;
	                                tipPerPerson=totalTip/people;
	                           }else if (people > 10){
	                                totalPerPerson=totalToPay/10;
	                                tipPerPerson=totalTip/10;
	                           }else if (people==0) {
	                        	   totalPerPerson=totalToPay;
	                        	   tipPerPerson=totalTip;
	                           }
	           } else {
	               totalPerPerson=totalToPay;
	               tipPerPerson=totalTip;
	           }
	             System.out.println("Total per person: " + totalPerPerson);
	             System.out.println("Tip per person: "+ tipPerPerson);
	   } 
	      
	  }


