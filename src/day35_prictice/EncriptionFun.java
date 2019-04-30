package day35_prictice;

public class EncriptionFun {
public static void main(String[] args) {
	System.out.println(encryptChar('z'));
	
	
	
}
 public static char encryptChar(char ch) {
 String alphabet = "abcdefghijklmnopqrstuvwxyz";
 String encrypted ="zyxwvutsrqponmlkjihgfedcba";
 
  //encrypted.charAt(alphabet.indexOf(ch));
    int i = alphabet.indexOf(ch);
     char ret=encrypted.charAt(i);
      return ret;
 }
 
 
 public static String encryptWord(String word) {
	 String cyphered = "";
	 for (int i = 0; i < word.length(); i++) {
		 cyphered  +=encryptChar(word.charAt(i));
    }
	   return  cyphered;
  }
}
 
 
 
 
 
 
 
 
 
 

