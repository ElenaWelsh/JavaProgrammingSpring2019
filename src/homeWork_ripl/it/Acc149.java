package homeWork_ripl.it;

import java.util.*;

public class Acc149 {

	public static void add_to_r(int[] r, int n) {
		int[] new_r;
		new_r = Arrays.copyOf(r, r.length + 1);
		new_r[new_r.length - 1] = n;
		System.out.println(Arrays.toString(new_r));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("print");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt(), n = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {
		}

	

	add_to_r(arr,n);

}

}

	
