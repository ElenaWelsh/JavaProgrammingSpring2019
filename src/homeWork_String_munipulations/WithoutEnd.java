package homeWork_String_munipulations;

public class WithoutEnd {
public static void main(String[] args) {
	/*Given a string, return a version without the first and last char,
	 *  so "Hello" yields "ell". The string length will be at least 2.
	 */


                String str ="Hello";          //) → "ell"
                       str ="java";          //) → "av"
                        str ="coding";      //) → "odin"
                
                if (str.length()>=2) {
                	str.substring(1,str.length()-1);
                System.out.println(str.substring(1,str.length()-1));	
                }
                
                
                
                
                
                
                
                
                
}
}
