package day27_arrays05;
import java.util.*;
public class ArraysCopyOf {
public static void main(String[] args) {
	double[]d1= {2.3,4.5,12.4};
	double[]d2=d1;
	System.out.println(Arrays.toString(d1));
	System.out.println(Arrays.toString(d2));
			d1[0]=1000.3;// changes value for both
			d2[1]=4000;   //change value for both
			
   double[]d3= Arrays.copyOf(d2,d2.length); //created new array,  now they are
   //totaly intepended you can add and resize array
   System.out.println("D3: "+Arrays.copyOf(d2,d2.length));
   
}
}
