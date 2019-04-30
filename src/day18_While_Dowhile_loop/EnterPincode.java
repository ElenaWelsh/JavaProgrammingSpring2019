package day18_While_Dowhile_loop;
import java.util.Scanner;
public class EnterPincode {
public static void main(String[] args) {
	//Scanner scan = new Scanner(System.in);
	//int secretPincode =1234;
	//int pincode = 0;
	//pincode= scan.nextInt();
	//while(pincode!=secretPincode) {
		//System.out.println("Enter pincode");
	//}

      Scanner scan =  new Scanner(System.in);
      int secretPincode = 4321;
       int pincode =0;
       int attempts = 0;
       while(pincode!=secretPincode) {
    	   System.out.println("enter pincode");
    	   pincode = scan.nextInt();
    	   attempts ++;
    	   if (attempts ==3 && pincode != secretPincode) {
    		   System.out.println("Card is blocked");
    		   return;
    	   }
    	   
       }
             System.out.println("Access granted");
          





}
}
