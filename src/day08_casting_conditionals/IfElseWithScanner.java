package day08_casting_conditionals;
import java.util.Scanner;
public class IfElseWithScanner {
	public static void main(String[] args) {
		//passingPr=65;
		//youtScorePr = take from percentage
		Scanner scan = new Scanner(System.in);
		
		int passingPercentage = 65;
		
		System.out.println("what is your score?");
		
		int yourScorePercentage = scan.nextInt();
		
		if(yourScorePercentage>=passingPercentage) {
			System.out.println("you passed");
		}else {
			System.out.println("you failed");
		}
		
	}

}
