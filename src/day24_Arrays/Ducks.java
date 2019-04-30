package day24_Arrays;

public class Ducks {
public static void main(String[] args) {
	int[][] ducks ={{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
	System.out.println(ducks.length);//3 how many groups
	System.out.println(ducks[0].length);//5 length of each
	int num[][]=new int[5][3];
	System.out.println(ducks[0][1]);//2
}
}
