package homeWork_ripl.it;

import java.util.*;

public class Zombi2 {
	public static void main(String[] args) {

		int[] inhabitans = { 3, 6, 0, 4, 3, 2, 7, 0 };


		boolean[] check = new boolean[inhabitans.length+2];
		int sum=0;
		int dayCount =0;
		System.out.println("Day "+ (dayCount++)+" "+Arrays.toString(inhabitans) );
        do { 
        	System.out.println();
        	sum=0;
		for (int i = 0; i < inhabitans.length; i++) {
			if (inhabitans[i] == 0) {
				check[i] = true;
				check[i + 2] = true;
			}
		}	
      
		for (int j = 1; j<check.length-1; j ++) {
			if (check[j]) {
				inhabitans[j-1]/=2;
			}
				 sum+=inhabitans[j-1];
			}
			
		System.out.println("Day "+ (dayCount++)+" "+Arrays.toString(inhabitans) );
	}while(sum!=0);
        
        System.out.println("---- EXTINCT ----");
		
	}
	}

