package day20_forLoop;

public class EvenOrOdd {
 public static void main(String[] args) {
	for (int n = 0; n<=100; n++) {
		if (n%2==0) {
			System.out.print(n+" ");
		}
	}
	System.out.println();
	for (int j = 0; j<=100; j++) {
		if (j%2!=0) {
			System.out.print(j+" ");
		}
	}
	System.out.println();
	
	int sumOfOdds=0;
	int sumOfEvens=0;
	
	for (int num = 0; num<=100; num++) {
		if (num%2==0) {
			sumOfEvens+=num;
		}else {
			sumOfOdds+=num;
		}
	}
			System.out.println("Sum of evens: "+sumOfEvens);
			System.out.println("Sum of odds: " +sumOfOdds);
}
}
