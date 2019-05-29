package homeWork_ripl.it;

public class CleanString {
	public static void main(String[] args) {
		
		System.out.println(extractNum("aa2aa3"));
	}

	 public static String extractNum(String s) {
		 String extraNum ="";
		 for(int i =0; i <s.length(); i++) {
			 if(Character.isDigit(s.charAt(i))) {
				 extraNum += s.charAt(i);
			 }
		  }
		 return extraNum;
	 }
}
