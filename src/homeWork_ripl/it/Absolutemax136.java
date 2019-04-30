package homeWork_ripl.it;

public class Absolutemax136 {
	public static void main(String[] args) {
		// 1 2 3
		// 4 5 6
		// 9 8 9
		int right = 0;
		int left = 0;
		int diff = 0;
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 8, 9 } };
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j) {
					right += matrix[i][j];

				}
				if (i == matrix.length - j - 1) {
					left += matrix[i][j];
				}
			}
		}

		
		if (left > right) {
			diff = left - right;
		} else if (right > left) {
			diff = right - left;
		} else {
			diff = 0;
		}
		System.out.println(diff);
	}
}
