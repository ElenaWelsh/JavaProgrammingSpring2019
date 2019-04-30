package day30_methods02;

import java.util.*;

public class MyNumbers {
	public static void main(String[] args) {

		showMe5Numbers();
		doPush10Ups();
		
		rangePrint();
		
	}

	public static void showMe5Numbers() {
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.print(r.nextInt(1001) + " ");
		}
		System.out.println();
	}

	public static void doPush10Ups() {
    for(int i=1;i<=10;i++) {
    	System.out.println("Pushup - "+ i);
    }
    System.out.println("Time to rest");
}

	public static void rangePrint() {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter two numbers:");
	   int num1=scan.nextInt();
	   int num2 =scan.nextInt();
   if (num1<num2) {
	   for(int i= num1; i<=num2; i ++) {
		 System.out.print(i+" ");
	   }
   } else if(num2<num1) {
	   for(int k= num1; k>=num2; k --) {
			 System.out.print(k+" "); 
	   }
   }  else {
            System.out.println(num1);
}
   }
   
	   }
	
