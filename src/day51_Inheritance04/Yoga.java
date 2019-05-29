package day51_Inheritance04;

public class Yoga extends Exercise {
	@Override
	  public int perform(int minutes) {
		  System.out.println("Doing Yoga");
		  return minutes *5;
	  }
}
