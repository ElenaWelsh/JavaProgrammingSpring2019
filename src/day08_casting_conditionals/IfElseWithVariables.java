package day08_casting_conditionals;

public class IfElseWithVariables {
	public static void main(String[] args) {
		int temp = 45;
		
		if(temp >=65) {
			System.out.println("It is a nace day! Code Java");
			
		}else {
			System.out.println("Stay home and code Java!");
		}
		// 2 int variables, see which tean won
		
		int teamAScore = 5,teamBScore = 4;
		
		if (teamAScore>teamBScore) {
			System.out.println("Team A won");
		} else {
			System.out.println("Team B won"); 
		}
		
	}

}
