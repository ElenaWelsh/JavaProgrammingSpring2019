package day49_Inheritance2;

public class Leopard extends Animal {
public Leopard() {
	super();
	System.out.println("Leopard constructor");
	setType("Leopard");
}
	public Leopard(String type) {
		super(type);
		System.out.println("Leopard one-arg constructor");
	}
}

