package day46_static_keyword;

public class Campus {
	private String city;
	static {
		System.out.println("static block"); // static block runs first once before everything else
	}
	public Campus(String city) {
		System.out.println("Constructor");
		this.city=city;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public static void canpusInfo() {
		System.out.println("Welcome to campus");
	}
	@Override
	public String toString() {
		return "Campus [city=" + city + "]";
	}
	
}
