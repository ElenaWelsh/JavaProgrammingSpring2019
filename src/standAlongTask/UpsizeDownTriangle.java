package standAlongTask;

public class UpsizeDownTriangle {
public static void main(String[] args) {
	for (int outer =10; outer >=1; outer--) {
		for (int inner=1; inner <=outer ; inner++) {
			System.out.print(inner +" ");
		}
	       System.out.println();
	}
	
	for (int i=1; i<=10;i++) {
		for(int j =1; j<=i; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	for (int o =9; o>=1;o--) {
		for(int inn=1;inn<=o;inn++) {
			System.out.print(inn+" ");
		}
		System.out.println();
	}
}
}
