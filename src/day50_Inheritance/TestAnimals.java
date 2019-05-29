package day50_Inheritance;

public class TestAnimals {
public static void main(String[] args) {
	Animal an = new Animal();
	Cat cat = new Cat();
	Dog dog = new Dog();
	Duck duck = new Duck();
	
	an.speak();
	cat.speak();
	dog.speak();
	duck.speak();
	
	an.move(5);
	cat.move(10);
	dog.move(15);
	duck.move(20);
}
}
