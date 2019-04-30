package mentoring_Sessions;
import java.util.*;
public class Sentance {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//if string starts with does,is or are place a ?,otherwise add .
	String str = scan.nextLine().toLowerCase();
	
	if(str.startsWith("does")||str.startsWith("is")||str.startsWith("are")) {
   str+="?";
	}else{
		str+=".";
	}
	System.out.println(str.substring(0,1).toUpperCase()+str.substring(1));
	}

}
