package day51_Inheritance04;

public class JuiJitsu extends Exercise {
	@Override
	  public int perform(int minutes) {
		  System.out.println("Performing JuiJitsu");
		  return minutes *12;
	  }
}
