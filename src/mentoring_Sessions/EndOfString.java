package mentoring_Sessions;
import java.util.*;
public class EndOfString {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String str = scan.next().toLowerCase();
	String str2 = scan.next().toLowerCase();
	boolean end = false;
	if (str.length()>=str2.length() && str.endsWith(str2)) {
		end=true;
	}
	if (str2.length()>=str.length() && str2.endsWith(str)) {
		end=true;
	}
	System.out.println(end);
}
}
