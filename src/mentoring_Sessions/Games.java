package mentoring_Sessions;

public class Games {
public static void main(String[] args) {
	String str = "I used to play soccer, basketball, rugby and voleyball when i was a kid";
	
	String reversedWord = "";
	int i =str.length()-1;
	while (i>=0) {
		reversedWord = reversedWord + str.charAt(i);
		i=i-1;
	}
           System.out.println(reversedWord);
           
	int num = 4368;
	int j = 0;
	while(num>0) {
		int digit = num%10;
		num=num/10;
		j++;
		System.out.println("digit from the right hand side " + j + " is " + digit);
	}
}
}
