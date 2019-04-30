package day27_arrays05;

public class Times {
	public static void main(String[] args) {
		// int [] time1 =
		// {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
		// int [] time2 =
		// {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,24,
		// 26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,
		// 53,54,55,56,57,58,59};
		int[] time1 = new int[2];
		int[] time2 = new int[2];
		time1[0] = 10;
		time1[1] = 15;
		time2[0] = 16;
		time2[1] = 10;

		if (time1[0] < 0 || time1[0] > 23) {
			System.out.println("Time1 has invalid hour");
			return;
		}
		if (time1[1] < 0 || time1[1] > 59) {
			System.out.println("Time1 has invalid minute");
			return;
		}
		if (time2[0] < 0 || time2[0] > 23) {
			System.out.println("Time2 has invalid hour");
			return;
		}
		if (time2[1] < 0 || time2[1] > 59) {
			System.out.println("Time2 has invalid minute");
			return;
		}

		if (time1[0] < time2[0]) {
			System.out.println("Time1 is earlier");
		} else if (time2[0] < time1[0]) {
			System.out.println("Time2 is earlier");
		} else {
			if (time1[1] < time2[1]) {
				System.out.println("Time1 is earlier");
			} else if (time2[1] < time1[1]) {
				System.out.println("Time2 is earlier");
			} else {
				System.out.println("Same time!");
			}
		}
	}
}
