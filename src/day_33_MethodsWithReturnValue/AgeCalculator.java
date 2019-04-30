package day_33_MethodsWithReturnValue;

public class AgeCalculator {
public static void main(String[] args) {
	calculateAge(1990); 
}

public static int calculateAge (int year) {
	int age=  2019-year;
	if (age<0) {
		System.out.println("Invalid age");
		return 0;
	}else if (age >=0 && age<=14) { 
		System.out.println(age+" child " );
	}else if(age >=15 && age<=25) {
		System.out.println(age+" youngster " );
	}else if(age >=26 && age<=64) {
		System.out.println(age+" adult " );
	}else  {
		System.out.println( age +" senior ");
	}
	return age ;
}




}
//method calculateAge
//return: int
//params: int year
//calculates the age and return value
//ALSO
//age -> 1 - 14  -> child
//age -> 15 - 25 -> youngster
//age -> 26 - 64 -> adult
//age -> 65 > -> senior
//age -> negative -> invalid age
