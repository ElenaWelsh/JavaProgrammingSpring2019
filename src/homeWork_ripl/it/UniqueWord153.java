package homeWork_ripl.it;

public class UniqueWord153 {
public static void main(String[] args) {
 String[]words = {"java", "code", "python", "code", "rust", "code", "rust"};
 int count = 0;
  for (int i = 0; i < words.length;i++) {
	  count=0;
	  for (int j =0; j <words.length; j++) {
		 if(words[i] ==words[j]) {
			 count++;
		 }
	  }
	  if ( count== 1) {
		  System.out.println(words[i]);
		  
	  }
  }
}
}
