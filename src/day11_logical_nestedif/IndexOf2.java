package day11_logical_nestedif;

public class IndexOf2 {
public static void main(String[] args) {
	//index of with 2 inputs
	String list = "html-selenium-angular-jenkins-grid";
	int firstDash= list.indexOf("-"); //4
	System.out.println(firstDash);
	int secondDash=list.indexOf("-",5);
	System.out.println("second dash: " +secondDash);//13
	int thirdDash = list.indexOf("-",secondDash +1);
	System.out.println(thirdDash);
	//last dash
	int lastDash = list.lastIndexOf("-");
	System.out.println(lastDash); //29
	//list.in   drop down all the  choices coming up with description
	
	
	String word = "java";
	// find second a
	int first = word.indexOf("a");//1
	int second = word.indexOf("a", first+1);//3
	
	//int second= word.indexOf("a",word.indexOf("a"+1));  all in one statement
}
}
