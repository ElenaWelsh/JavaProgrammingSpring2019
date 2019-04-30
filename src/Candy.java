import java.util.*;
public class Candy {
 public static void main(String[] args) {
	    int numberOfCandies,numberOfGumballs;
	    Scanner scan = new Scanner(System.in);
	    int NumberOfCoupons =  scan.nextInt();
	    if (NumberOfCoupons<3){
	      System.out.println("Not enough coupons");
	    }
	    numberOfCandies = NumberOfCoupons/10;
	    System.out.println("Number of Candies: "+ numberOfCandies);
	    numberOfGumballs = numberOfCandies%10/3;
	     
	    //Write your code here
	    
	  }
	}