package homeWork_ripl.it;
import java.util.*;
public class TimeConversion {
public static void main(String[] args) {
	String time ="02:23:45PM";
	String s = "";
	
	if (time.endsWith("AM")&& time.startsWith("12")) {
		s="00"+time.substring(2,8);
         System.out.println(s);
         }else if(time.endsWith("AM")) {
        	 s=time.substring(0, 8);
         }
	 if (time.endsWith("PM")){
		 String temp = time.substring(0,2);
	    int hour=Integer.parseInt(temp);
	    hour=hour+12;
	    s =hour+time.substring(2,8);
	    System.out.println(s);
	 }
    
	
	}
		
}

