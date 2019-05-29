package practiceHomeWorkClasses;

import java.util.Arrays;

public class PetSmart {
public static void main(String[] args) {
	DogFood food1 = new DogFood();
	food1.setBrand("Purina");
	food1.setInfo("Colitis");
	food1.setPrice(25.25);
	food1.setDry(true);
	System.out.println(food1.toString());
	System.out.println(food1.getBrand());
	food1.buyFood("Homemade");
	System.out.println(food1.getBrand());
	//food1.setIngredience({"chicken", "peas", "sweet potato", "rice"});
	
	String[] ings= {"chicken", "peas", "sweet potato", "rice"};
	food1.setIngredience(ings);
	System.out.println(Arrays.toString(food1.getIngredience()));
	
}
}
