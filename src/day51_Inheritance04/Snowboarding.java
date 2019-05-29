package day51_Inheritance04;

public class Snowboarding extends Exercise {
	
    public int perform(int minutes) {
    	int cals =super.perform(10);//call parent class method
    	System.out.println("Snowboarding for " + minutes);
    	return minutes * 7 + cals;
    }

}
