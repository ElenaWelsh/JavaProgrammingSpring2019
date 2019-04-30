package homeWork_String_munipulations;

public class ExtraFront {
public static void main(String[] args) {
	/*Given a string, return a new string made of 3 copies
	 *  of the first 2 chars of the original string. The string may be any length.
	 *   If there are fewer than 2 chars, use whatever is there.
	 */


              String  str ="Hello";         //) → "HeHeHe"
                      str = "ab";            //) → "ababab"
                      str ="H";                  //) → "HHH"
	if (str.length()>=2) {
		System.out.println(str.substring(0,2)+str.substring(0,2)+str.substring(0,2));
	}else{
		System.out.println(str.substring(0)+str.substring(0)+str.substring(0));
	}
}
}
