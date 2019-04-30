/*package day11_logical_nestedif;

import java.util.*;
public class adel {
 public static void main(String[] args) {
            //WRITE YOUR CODE HERE
         Scanner scan = new Scanner(System.in);
           System.out.println("Split:");
           String split = scan.next();
           System.out.println("Number of people:");
           int number = scan.nextInt();
           System.out.println("Check amount:";
           double amount = scan.nextDouble();
           System.out.println(“Service Quality:“);
           String service = scan.next();
           double tip=0;
           switch (service) {
            case “Poor”:
              tip = amount*5/100;
              break;
            case “Fair”:
              tip = amount*10/100;
              break;
            case “Good”:
              tip = amount*15/100;
              break;
            case “Great”:
              tip = amount*20/100;
              break;
            case “Excellent”:
              tip = amount*25/100;
              break;
          }
           
           switch (number) {
             case 0:
               System.out.println(“Number of people entered: “);
             case 1:
               System.out.println(“Number of people entered: &“);
                break;
              case 2:
               System.out.println(“Number of people entered: &&“);
                break;
              case 3:
               System.out.println(“Number of people entered: &&&“);
                break;
              case 4:
               System.out.println(“Number of people entered: &&&&“);
                break;
              case 5:
               System.out.println(“Number of people entered: &&&&&“);
                break;
              case 6:
               System.out.println(“Number of people entered: &&&&&&“);
                break;
              case 7:
               System.out.println(“Number of people entered: &&&&&&&“);
                break;
              case 8:
               System.out.println(“Number of people entered: &&&&&&&&“);
                break;
              case 9:
               System.out.println(“Number of people entered: &&&&&&&&&“);
                break;
              default:
               System.out.println(“Number of people entered: &&&&&&&&&&“);
                break;
           }
               System.out.println(“Total to pay: ” + (amount+tip));
            System.out.println(“Total tip: ” + tip);

          
          if (split.equalsIgnoreCase(“no”))
            System.out.println(“Total per person: ” + amount);
          if (split.equalsIgnoreCase(“yes”) && number>0 && number<=10)
            System.out.println(“Total per person: ” + (amount+tip)/number);
            
          if (split.equalsIgnoreCase(“no”))
            System.out.println(“Tip per person: ” + tip);
          if (split.equalsIgnoreCase(“yes”) && number>0 && number<=10)
            System.out.println(“Tip per person: ” + tip/number);

 }
}

Elena I Welsh [7:32 PM]
thank you
Message Input


Message Adel Suleymanov
public class adel {
	
	Adel Suleymanov [7:18 PM]
			import java.util.*;

			public class Main {
			 public static void main(String[] args) {
			            //WRITE YOUR CODE HERE
			         Scanner scan = new Scanner(System.in);
			           System.out.println(“Split:“);
			           String split = scan.next();
			           System.out.println(“Number of people:“);
			           int number = scan.nextInt();
			           System.out.println(“Check amount:“);
			           double amount = scan.nextDouble();
			           System.out.println(“Service Quality:“);
			           String service = scan.next();
			           double tip=0;
			           switch (service) {
			            case “Poor”:
			              tip = amount*5/100;
			              break;
			            case “Fair”:
			              tip = amount*10/100;
			              break;
			            case “Good”:
			              tip = amount*15/100;
			              break;
			            case “Great”:
			              tip = amount*20/100;
			              break;
			            case “Excellent”:
			              tip = amount*25/100;
			              break;
			          }
			           
			           switch (number) {
			             case 0:
			               System.out.println(“Number of people entered: “);
			             case 1:
			               System.out.println(“Number of people entered: &“);
			                break;
			              case 2:
			               System.out.println(“Number of people entered: &&“);
			                break;
			              case 3:
			               System.out.println(“Number of people entered: &&&“);
			                break;
			              case 4:
			               System.out.println(“Number of people entered: &&&&“);
			                break;
			              case 5:
			               System.out.println(“Number of people entered: &&&&&“);
			                break;
			              case 6:
			               System.out.println(“Number of people entered: &&&&&&“);
			                break;
			              case 7:
			               System.out.println(“Number of people entered: &&&&&&&“);
			                break;
			              case 8:
			               System.out.println(“Number of people entered: &&&&&&&&“);
			                break;
			              case 9:
			               System.out.println(“Number of people entered: &&&&&&&&&“);
			                break;
			              default:
			               System.out.println(“Number of people entered: &&&&&&&&&&“);
			                break;
			           }
			               System.out.println(“Total to pay: ” + (amount+tip));
			            System.out.println(“Total tip: ” + tip);

			          
			          if (split.equalsIgnoreCase(“no”))
			            System.out.println(“Total per person: ” + amount);
			          if (split.equalsIgnoreCase(“yes”) && number>0 && number<=10)
			            System.out.println(“Total per person: ” + (amount+tip)/number);
			            
			          if (split.equalsIgnoreCase(“no”))
			            System.out.println(“Tip per person: ” + tip);
			          if (split.equalsIgnoreCase(“yes”) && number>0 && number<=10)
			            System.out.println(“Tip per person: ” + tip/number);

			 }
			}

			Elena I Welsh [7:32 PM]
			thank you
			Message Input


			Message Adel Suleymanov

			public class Main {
			 public static void main(String[] args) {
			            //WRITE YOUR CODE HERE
			         Scanner scan = new Scanner(System.in);
			           System.out.println(“Split:“);
			           String split = scan.next();
			           System.out.println(“Number of people:“);
			           int number = scan.nextInt();
			           System.out.println(“Check amount:“);
			           double amount = scan.nextDouble();
			           System.out.println(“Service Quality:“);
			           String service = scan.next();
			           double tip=0;
			           switch (service) {
			            case “Poor”:
			              tip = amount*5/100;
			              break;
			            case “Fair”:
			              tip = amount*10/100;
			              break;
			            case “Good”:
			              tip = amount*15/100;
			              break;
			            case “Great”:
			              tip = amount*20/100;
			              break;
			            case “Excellent”:
			              tip = amount*25/100;
			              break;
			          }
			           
			           switch (number) {
			             case 0:
			               System.out.println(“Number of people entered: “);
			             case 1:
			               System.out.println(“Number of people entered: &“);
			                break;
			              case 2:
			               System.out.println(“Number of people entered: &&“);
			                break;
			              case 3:
			               System.out.println(“Number of people entered: &&&“);
			                break;
			              case 4:
			               System.out.println(“Number of people entered: &&&&“);
			                break;
			              case 5:
			               System.out.println(“Number of people entered: &&&&&“);
			                break;
			              case 6:
			               System.out.println(“Number of people entered: &&&&&&“);
			                break;
			              case 7:
			               System.out.println(“Number of people entered: &&&&&&&“);
			                break;
			              case 8:
			               System.out.println(“Number of people entered: &&&&&&&&“);
			                break;
			              case 9:
			               System.out.println(“Number of people entered: &&&&&&&&&“);
			                break;
			              default:
			               System.out.println(“Number of people entered: &&&&&&&&&&“);
			                break;
			           }
			               System.out.println(“Total to pay: ” + (amount+tip));
			            System.out.println(“Total tip: ” + tip);

			          
			          if (split.equalsIgnoreCase("yes”)) {
			        	               if (amount>0 &&amount<=10) {
			        	System.out.println("Total per person " + (amount+tip)/number);  
			        	               }													.
			          }
			            System.out.println(“Total per person: ” + amount);
			          if (split.equalsIgnoreCase(“yes”) && number>0 && number<=10)
			            System.out.println(“Total per person: ” + (amount+tip)/number);
			            
			          if (split.equalsIgnoreCase(“no”))
			            System.out.println(“Tip per person: ” + tip);
			          if (split.equalsIgnoreCase(“yes”) && number>0 && number<=10)
			            System.out.println(“Tip per person: ” + tip/number);

			 }
			}

			
}*/
