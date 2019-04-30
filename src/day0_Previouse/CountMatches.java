package day0_Previouse;

public class CountMatches {
public static void main(String[] args) {
	double[]prices= {123.43, 234, 3, 12, 54, 98, 5.34, 19.99, 98.23, 100, 2.30};
	int count =0;
	for(double price:prices) {
		if(price>20.0) {
			count++;
		}
	}
	if (count==0) {
		System.out.println("No items more then $20");
	}else {
	System.out.println(count+" items more then $20");
	}
}
}
