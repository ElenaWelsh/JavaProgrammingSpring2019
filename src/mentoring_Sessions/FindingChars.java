package mentoring_Sessions;
import java.util.*;
public class FindingChars {
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
        String sen =" welcome to this class ";
        char alph = 'a';
        int sum = 0;
        for (int j =0 ; j<26 ; j++) {
			sum=0;
			for (int i = 0 ; i < sen.length();i++) {
				if (alph==sen.charAt(i)) {
					sum+=1;
					
				}
				
			}
			if(sum!=0)
			System.out.println("you have "+alph +" "+sum);
			alph+=1;
		}
	}
}