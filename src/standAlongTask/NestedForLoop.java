package standAlongTask;

public class NestedForLoop {
	public static void main(String[] args) {
		for (int j = 0; j <= 10; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("Outside the loop");
	}
}
