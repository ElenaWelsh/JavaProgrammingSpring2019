package day07_scanner_operators;

public class PreAndPost {
	public static void main(String[] args) {
		int m = 10;
		int m2 = m++;
		System.out.println("m: "+ m);
		System.out.println("m2: " + m2);
		
		int n = 20;
		int n2= ++n;
		System.out.println("n: "+ n);
		System.out.println("n2:" + n2);
		int i = 10;
		i++;//add1
		++i;//add1
		
		int	batteries = 8;
		int oldBatteries = 5;
		int totalBatteries = batteries++ + ++oldBatteries;
		System.out.println("batteries"  + batteries);//9
		System.out.println("oldBatteries: " + oldBatteries);//6
		System.out.println("totalBatteries: " + totalBatteries);//14
		
	}

}
