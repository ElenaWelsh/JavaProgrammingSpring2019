package day42_incapsulation;
import java.util.*;
public class StringShoesToObject {
	public static void main(String[] args) {
		String data = "Bruno Magli,9.5";
		String[] arrData = data.split(",");
		Shoes shoes = new Shoes();
		shoes.setShoesData(arrData[0], Double.parseDouble(arrData[1]));
		System.out.println(shoes.getShoesData());
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What shoes brand?"); scan.hasNext();
		String brand =scan.next();
		System.out.println("What is your size?");
		double size = scan.nextDouble();
		
		Shoes myShoes = new Shoes();
		myShoes.setShoesData(brand,size);
		System.out.println(myShoes.getShoesData());
		
		
	}
}
