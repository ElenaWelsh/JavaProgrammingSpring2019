package day21_Practice;

public class UniqueCharacters {
	public static void main(String[] args) {
		String word = "javva";
		String unique ="";
		char ch=word.charAt(0);
		System.out.println(unique.contains(ch+""));
		if(!unique.contains(""+ch)) {          //if(unique.indexOf(ch)==-1
			unique +=ch;                       //unique=unique+ch;  
		}
		
		String word2= "bananas";
		String unique2 = "";
		int i = 0;
		char ch2 = word2.charAt(i);
		//check if ch2 is in the unique2 variable
		// convert char - string = ch+""
		//String str = new String(ch);
		
		
		
}
}