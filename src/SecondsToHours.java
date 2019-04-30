

	import java.util.*;

	public class SecondsToHours {
	  public static void main(String[] args) {
	    //YOUR CODE HERE:
	    Scanner scan = new Scanner(System.in);
	    int inputSeconds, hours, minutes, seconds;
	    System.out.println("Enter seconds: ");
	    inputSeconds = scan.nextInt();
	    hours = inputSeconds/3600;
	    minutes =inputSeconds%3600/60;
	    seconds =inputSeconds%3600%60;
	    System.out.println(hours + " hours, "+ minutes+ " minutes, "+"and "+
	    seconds + " seconds");
	    
	    
	    
	  }

}
