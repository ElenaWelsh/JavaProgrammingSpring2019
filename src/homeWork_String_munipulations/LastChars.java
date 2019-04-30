package homeWork_String_munipulations;

public class LastChars {
public static void main(String[] args) {
	/*Given 2 strings, a and b, return a new string made of the first char of a and 
	 * the last char of b, so "yo" and "java" yields "ya". If either string is length 0,
	 *  use '@' for its missing char.
	 */


    String  a ="last", b ="chars";            //) → "ls"
       a ="yo";b= "java";                      // → "ya"
       a="hi";  b= "";                         // → "h@"
	
	if (a.length()>0 && b.length()>0) {
		System.out.println(a.charAt(0)+""+b.charAt(b.length()-1));
	} else if(a.length()==0 && b.length()>0){
		System.out.println("@"+b.charAt(b.length()-1));
	} else if(a.length()>0 && b.length()==0){
		System.out.println(a.charAt(0)+"@");
	}else {
		System.out.println("@@");
	}
	
	
	
	
	
}
}
