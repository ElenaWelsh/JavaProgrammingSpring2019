package day22_Practice;

public class CatsAndNoDogs {
   public static void main(String[] args) {
	String str= "mycatyourdog";
	int count=0;
	for (int i = 0; i<str.length()-3;i++) {
		String temp = str.substring(i,i+3);
		if (str.substring(i,i+3).equals("cat")){
			count++;
		}
	}
	System.out.println(count);
}
}
