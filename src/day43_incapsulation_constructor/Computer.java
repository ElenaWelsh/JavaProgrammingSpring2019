package day43_incapsulation_constructor;

public class Computer {
private String brand;
private String os;
private double price;

public String toString() {
    return "Computer [brand=" + brand + ", os=" + os + ", price=" + price + "]";
}
public Computer(String brand,String os,double price) {
	System.out.println("Computer constractor");
	this.os=os;
	this.brand=brand;
	this.price=price;
}

public void setBrand(String brand) {
	this.brand = brand;
}
public String getBrand() {
	return brand;
}
public String getOs() {
	return os;
}
public void setOs(String os) {
	this.os = os;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


}


