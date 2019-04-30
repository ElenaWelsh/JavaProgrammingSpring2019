package day08_casting_conditionals;

public class ExpicitCasting {
        public static void main(String[] args) {
        	
        System.out.println(10/2.0);//result is double
        System.out.println(10.0/2.);//result is double
        int result = (int)(10/2.0); // or 10/(int)2.0;
        
        int rent1 =987;
        int rent2=1100;
        int rent3 =894;
        int rent4 =1234;
        double average =(rent1+rent2+rent3+rent4)/ (double)4;
       // double average =(double)(rent1+rent2+rent3+rent4)/ 4.0;
        
        double d = 40.2;
        int k = (byte)d;
        // both implicit and explicit casting
		
       	
        
        
	
}
}
