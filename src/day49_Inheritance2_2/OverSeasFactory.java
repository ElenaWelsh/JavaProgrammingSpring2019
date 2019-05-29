package day49_Inheritance2_2;
import day49_Inheritance2.Device; 

// non-subclass in different package
public class OverSeasFactory {
public static void main(String[] args) {
	Device dv =new Device();
	dv.brand ="Samsung";
	//dv.model not visible
	//db.price not visible
}
}
