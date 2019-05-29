package practiceHomeWorkClasses;

import java.util.Arrays;

public class DogFood {
private String brand;
private String info;
private double price;
private boolean dry;
private String[] ingredience;

public void setIngredience(String[]ingredience) {
	this.ingredience = ingredience;
}
public String[] getIngredience() {
	return ingredience;
}

public void setBrand(String brand) {
	this.brand = brand;
}
public String getBrand() {
	return brand;
}
public void setInfo(String info) {
	this.info = info;
}
public String getInfo() {
	return info;
}
public void setPrice(double price) {
	this.price=price;
}
public double getPrice() {
	return price;
}
public void setDry(boolean dry) {
	this.dry=dry;
}
public boolean isDry() {
	return dry;
}
@Override
public String toString() {
	return "DogFood [brand=" + brand + ", info=" + info + ", price=" + price + ", dry=" + dry + ", ingredience="
			+ Arrays.toString(ingredience) + "]";
}
public void buyFood(String brand) {
	System.out.println("Buying dog food: " +brand);
}
}

