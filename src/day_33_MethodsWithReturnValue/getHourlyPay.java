package day_33_MethodsWithReturnValue;

public class getHourlyPay {
	public static void main(String[] args) {
           getHourlyPay(20,8);
	}

	public static int getHourlyPay(int hours, int rate) {
		if (hours <= 0) {
			System.out.println("Invalid hours");
			return 0;
		}
		if (rate <= 0) {
			System.out.println("Invalid rate");
			return 0;
		}
		    int total = hours * rate;
		    return total;
		    
	}

}
