package Office_hours;

public class PetSmart {
	public static void main(String[] args) {
		Cat murodilsCat = new Cat();
		murodilsCat.breed= "Persian cat";
		murodilsCat.name = "Bars";
		sellCat(murodilsCat);
	
	OnlineCat marufsImaginaryCat = new OnlineCat();
	marufsImaginaryCat.breed = "lebanese";
	marufsImaginaryCat.name= "Tars";
	marufsImaginaryCat.location= "Arlington,TX";
	
	sellCatOline(marufsImaginaryCat);
	murodilsCat.makeSomeNoice();
	marufsImaginaryCat.makeSomeNoice();
	}
	public static void sellCat(Cat cat) {
		System.out.println("selling" + cat.breed);
		System.out.println("its name is "+ cat.name);
	}
	
	public static void sellCatOline(OnlineCat cat) {
        System.out.println("Selling"+cat.breed);
        System.out.println("Its name is "+cat.name);
        System.out.println("It is location"+cat.location);
    }
}


