package day43_incapsulation_constructor;

public class MicroCenter {
public static void main(String[] args) {
	
	Computer comp1 = new Computer("iMac","macOS High Sierra",2567);
	comp1.setBrand("iMac");
	comp1.setOs("macOS High Sierra");
	comp1.setPrice(2567);
	System.out.println(comp1.toString());
	
}


}



