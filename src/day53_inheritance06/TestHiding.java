package day53_inheritance06;

public class TestHiding {
public static void main(String[] args) {
	City city = new City(345,"London");
	Capital cap = new Capital(433,"Paris",56565656L);
	
	System.out.println(city.count);
	System.out.println(cap.count);
	
	System.out.println(city.toString());
	System.out.println(cap.toString());
	cap.displayCount();
	// static methods
	city.buildARoad();
	cap.buildARoad();
	
	City.buildARoad();    // call thougth class because it is static
	Capital.buildARoad();
}

}
