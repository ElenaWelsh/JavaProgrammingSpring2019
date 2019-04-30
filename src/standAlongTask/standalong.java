package standAlongTask;
import java.text.DecimalFormat;
import java.util.*;
public class standalong {

	public static void main(String[] args) {
		DecimalFormat df2 = new DecimalFormat(".##");
		int numberOfPeople, i;
		double checkAmount = 0, totalToPay = 0, totalTip = 0;
		String serviceQuality = "", split;
		Scanner scan = new Scanner(System.in);
		System.out.println("Split:");
		split = scan.next();
		if (!split.equalsIgnoreCase("yes") && !split.equalsIgnoreCase("no")) {
			System.out.println("INVALID INPUT");
			return;
		}

		// **** ********** CASE: NO SPLIT
		// ******************************************************************************************************
		if (split.equalsIgnoreCase("No")) {
			System.out.println("Check amount:");
			checkAmount = scan.nextDouble();
			System.out.println("Service quality:");
			serviceQuality = scan.next();

			if (serviceQuality.equalsIgnoreCase("Excellent")) {
				totalToPay = checkAmount + checkAmount * 0.25;
				totalTip = checkAmount * 0.25;
			} else if (serviceQuality.equalsIgnoreCase("Great")) {
				totalToPay = checkAmount + checkAmount * 0.2;
				totalTip = checkAmount * 0.2;
			} else if (serviceQuality.equalsIgnoreCase("Good")) {
				totalToPay = checkAmount + checkAmount * 0.15;
				totalTip = checkAmount * 0.15;
			} else if (serviceQuality.equalsIgnoreCase("Fair")) {
				totalToPay = checkAmount + checkAmount * 0.1;
				totalTip = checkAmount * 0.1;
			} else if (serviceQuality.equalsIgnoreCase("Poor")) {
				totalToPay = checkAmount + checkAmount * 0.05;
				totalTip = checkAmount * 0.05;
			} else {
				System.out.println("INVALID INPUT");
				return;

			}
			System.out.println("Total to pay: " + df2.format(totalToPay));
			System.out.println("Total tip " + df2.format(totalTip));
		}
//*********************************************************END OF CASE**********************************************************************

		// ********************** ********** CASE: SPLIT
		// ********************************************************************************************

		if (split.equalsIgnoreCase("Yes")) {
			System.out.println("Number of people:");
			numberOfPeople = scan.nextInt();
			if (numberOfPeople < 1) {
				System.out.print("INVALID INPUT");
				return;
			}
			System.out.println("Check amount:");
			checkAmount = scan.nextDouble();
			System.out.println("Service quality:");
			serviceQuality = scan.next();
			System.out.println();
			if (serviceQuality.equalsIgnoreCase("Excellent")) {
				totalToPay = checkAmount + checkAmount * 0.25;
				totalTip = checkAmount * 0.25;
			} else if (serviceQuality.equalsIgnoreCase("Great")) {
				totalToPay = checkAmount + checkAmount * 0.2;
				totalTip = checkAmount * 0.2;
			} else if (serviceQuality.equalsIgnoreCase("Good")) {

				totalToPay = checkAmount + checkAmount * 0.15;
				totalTip = checkAmount * 0.15;
			} else if (serviceQuality.equalsIgnoreCase("Fair")) {
				totalToPay = checkAmount + checkAmount * 0.1;
				totalTip = checkAmount * 0.1;
			} else if (serviceQuality.equalsIgnoreCase("Poor")) {
				totalToPay = checkAmount + checkAmount * 0.05;
				totalTip = checkAmount * 0.05;
			} else {
				System.out.println("INVALID INPUT");
				return;
			}
			System.out.print("Number of people entered: ");
			for (i = 1; i <= numberOfPeople; i++) {
				if (numberOfPeople <= 10) {
					System.out.print("&");
				} else if (numberOfPeople > 10) {
					numberOfPeople = 10;
					System.out.print("&");
				}

			}
			System.out.println();
			
			System.out.println("Total to pay: " + df2.format(totalToPay));
			System.out.println("Total tip " + df2.format(totalTip));
			System.out.println("Total per person: " + df2.format(totalToPay / numberOfPeople));
	
			System.out.println("Tip per person " + df2.format(totalTip / numberOfPeople));
		//	System.out.printf("Total to pay: %10.2f",totalTip);
			
			
		}
		scan.close();

	}
}

