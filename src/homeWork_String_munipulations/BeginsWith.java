package homeWork_String_munipulations;

public class BeginsWith {
public static void main(String[] args) {
	/*Given a string, if the string begins with "red" or "blue" return
	 *  that color string, otherwise return the empty string.
	 */


			String str = "redxx";// → "red"
		str = "xxred";             //) → ""
		str ="blueTimes";          //) → "blue"

	if (str.startsWith("red")) {
		System.out.println(str.substring(0,3));
	}else if (str.startsWith("blue")) {
		System.out.println(str.substring(0,4));
	}else {
		System.out.println("");
	}
			
}
}
