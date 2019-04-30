package day13_ternary_string_intro;

public class Ternary {
public static void main(String[] args) {
	String result;
	int score =48;
	if(score>60) {
		result = "pass";
	}else{
	   result= "fail";
	}
	
	result = (score>60)?"pass":"fail";
	result = score>60?"pass":"fail";
	result = (score>100)?"pass":"fail";
	
	String quality = "good";
	int rating = (quality.equals("good"))?100:0;
	
	int PMhour = 6;
	boolean rushHour= (PMhour>=4 && PMhour<=7)? true:false;
	String result1 = rushHour?"yes":"no";
	
	int AMHour = 8;//6-9
	String amRushHour=AMHour>=6 && AMHour<=9?"yes":"no";
	

	System.out.println(AMHour+"is rush hour? -");
	
}
}
