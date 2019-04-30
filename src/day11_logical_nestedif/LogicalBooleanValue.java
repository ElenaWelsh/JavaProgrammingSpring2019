package day11_logical_nestedif;

public class LogicalBooleanValue {
public static void main(String[] args) {
	
	boolean b1=5>10 && 10>100;//false
	System.out.println("B1: "+ b1);
	
	boolean b2 ='a'=='a'&&123>120; //true
	 System.out.println("B2: "+b2);
	
	boolean b3 = true && 10 >=10 && 1000<=900; //false
	System.out.println("B3: "+b3);
	
	boolean b4 = false && false && 10==10; //false
	System.out.println("B4: "+b4);
	
	boolean b5 = false||true&&10==10; //true //&& takes priority
	System.out.println("B5: "+b5);
	
	boolean b6 = false&&true||10==10; //true
	System.out.println("B6: "+b6);
	
	boolean b7 = false && true||10==10; //true
	System.out.println("B7: "+b7);
	
	boolean b8= false&&(true||10==10); //false
	System.out.println("B8: "+b8);
	
	boolean topicDone =true;
	boolean isMoreThen3pm = true;
	boolean everyThingIsClear = true||false;
	boolean letsGoForABreak= topicDone&&isMoreThen3pm&&everyThingIsClear;
	System.out.println("latsGoForABreak: " + letsGoForABreak);
	
	
	boolean b9 = !(true ||false ) && true; //false
	
	boolean b10 = !true || false  && true; //false||false generated false
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
