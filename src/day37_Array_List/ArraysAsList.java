package day37_Array_List;
import java.util.*;
public class ArraysAsList {
public static void main(String[] args) {
	List<String> cars= new ArrayList<>();
	cars.add("Honda");
	
	List<Integer> nums = Arrays.asList(4,2,5,7,8);// when using short cut, it is fixed size now
	System.out.println(nums.size());
	System.out.println(nums.toString());
	
	
	List<Double> prices =Arrays.asList (12.4,5.3,500.0,1230.50,5.99,12.0,9874.44,34.4,123.5,7.3);
	System.out.println(prices);
	double sum =0;
	for(Double price:prices) {
		sum+=price;
	}
	System.out.println("sum: " + sum);
	double sum2=0;
	for(int i =0; i<prices.size(); i++) {
		sum2+=prices.get(i);
	}
	System.out.println("sum2: "+sum2);
	
	List<Double> expensive=new ArrayList<>();
	for(double price: prices) {
		if (price>100.0) {
			expensive.add(price);
		}
	}
	System.out.println("Expensive:" +expensive.toString() );
	
	
	
	
}
}
