package homeWork_ripl.it;

import java.util.*;

public class Inhabitants122 {
   public static void main(String[] args) {
	int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 1};
//    for(int i =0; i<inhabitants.length;i++){
//	       while(inhabitants[i]!=0){
//	        inhabitants[i]/=2;
//	        i++;
//       System.out.println(Arrays.toString(inhabitants));
//	    }
//	 }
//	for(int i =0; i<inhabitants.length;i++){
//		inhabitants[i]=inhabitants[i]/2;
//	}
	int max=Integer.MIN_VALUE;
  	int maxPosition=0;
     int dayCounter=0;
     
     for(int  i = 0;i<inhabitants.length;i++) {
    	if (inhabitants [i]>max) {
	      	max=inhabitants[i];
	      	maxPosition = i;
 	}
}

   do {
     System.out.println("Day "+dayCounter+" "+Arrays.toString(inhabitants));
           dayCounter++;
     for(int j= 0; j<inhabitants.length; j++) {	
    		 inhabitants[j]=inhabitants[j]/2;	
    		  
    		  }
       }while(inhabitants[maxPosition]>0); 
       
      
 System.out.println("Day "+dayCounter+" "+Arrays.toString(inhabitants));
 System.out.println("---- EXTINCT ----");


}
}
   
 

