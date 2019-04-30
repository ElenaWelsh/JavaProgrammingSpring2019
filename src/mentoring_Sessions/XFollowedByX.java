package mentoring_Sessions;
import java.util.*;
public class XFollowedByX {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	boolean b = false;
//	for (int i = 0; i<str.length()-1; i++) {
//		if(str.charAt(i)=='x' && str.charAt(i+1)=='x' ) {
//			b=true;
//		}
//	}
//	System.out.println(b);
	
	int n = str.indexOf('x');
	if (str.charAt(n+1)=='x') {
		b=true;
	}
	System.out.println(b);
}
}
