package homework_group;
import java.util.*;
public class Age {
        public static void main(String[] args) {
        	Scanner scan = new Scanner(System.in);
        	System.out.println("Enter current year,month and date");
        	int cury = scan.nextInt();
        	int curmonth=scan.nextInt();
        	int curdate=scan.nextInt();
        	
        	System.out.println("Enter year of birth,month of birth,day of birth:");
        	int byear=scan.nextInt();
        	int bmonth=scan.nextInt();
        	int bdate=scan.nextInt();
			int age=((cury*10000+curmonth*100+curdate)-(byear*10000+bmonth*100+bdate))/10000;
			System.out.println(age);
			
			
		}
}
