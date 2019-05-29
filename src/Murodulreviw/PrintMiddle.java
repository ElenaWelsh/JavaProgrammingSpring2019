package MurodulReviw;
import java.util.*;
public class PrintMiddle {
public static void main(String[] args) {
	String word = "javaclass";
	System.out.println("Middle one:" +word.charAt(word.length()/2));
	word="javadays";
	//print middle two
	String middle2=word.charAt(word.length()/2-1)+ ""+ 
			       word.charAt(word.length()/2);
	System.out.println("Middle2:"+ middle2);
	String middleTwo= word.substring(word.length()/2-1,word.length()/2+1);
	
	
	Scanner scan =new Scanner(System.in);
	String strInput=scan.next();
	String m="";
	if (strInput.length()%2==0) {// even count of char
		m=strInput.substring(strInput.length()/2-1,strInput.length()/2+1);
	}else {
		m=strInput.substring(strInput.length()/2,strInput.length()/2+1);
	System.out.println("M:"+m);
		
		
}
}
}