package day50_Inheritance;

public class Duck extends Animal {
	public void speak() {
		System.out.println("Duck is saying Quwack Quwack");
	}
	public void move(int steps) {
		System.out.println("Duck is moving "+ steps+ " steps");
	}
}
