package day52_Inheritance_final;
import java.util.*;
public class FinalArrays {
public static void main(String [] args) {
	final int[] TEAMS = {11,11}; 
	System.out.println("Team1:"+ TEAMS[0]);
	System.out.println("Team1:"+ TEAMS[1]);
	TEAMS[0]=10;
	TEAMS[0]=9;
	
	System.out.println("Team1:"+ TEAMS[0]);
	System.out.println("Team1:"+ TEAMS[1]);
	 final double[] PRICES = new double[3];
	 PRICES[0]=85.5;
			 PRICES[1]=99.99;
					 PRICES[2]=98.98;
					 System.out.println(Arrays.toString(PRICES));
	//		PRICES = new double[3]; will not work, you are keeping the object
					 
}
}
