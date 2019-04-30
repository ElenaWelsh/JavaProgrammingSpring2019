package day24_Arrays;

public class ForEachLoop {
	public static void main(String[] args) {
		// works only with collections of data ,but not with single variable
		// for(data type of array tempVariable name: arrayName ){}
		String[] cities = { "Washington D.C.", "McLean" };
		for (String city : cities) {
			System.out.println(city);
			// for(int i =0; i<cities.length;i++) {
			// String city = cities[i];
		}

		// for (String city:cities){
		// if(city.startsWith("M")) {
		// System.out.println(city);
	}

}
