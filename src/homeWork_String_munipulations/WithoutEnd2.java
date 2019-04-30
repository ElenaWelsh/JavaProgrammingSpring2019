package homeWork_String_munipulations;

public class WithoutEnd2 {
public static void main(String[] args) {
	/*Given a string, return a version without both the 
	 * first and last char of the string. The string may be any length, including 0.
	 */


			String str="Hello";      // → "ell"
			str="abc";            // → "b"
			str="b";            //) → ""
			if(str.length()>=2) {
				System.out.println(str.substring(1,str.length()-1));
			}else {
				System.out.println();
			}
			
			
			

}
}
