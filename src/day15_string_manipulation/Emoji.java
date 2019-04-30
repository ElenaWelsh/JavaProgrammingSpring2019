package day15_string_manipulation;

public class Emoji {
public static void main(String[] args) {
	String emoji = ":)";
	//==' != check if it is not 2 chars
	if (emoji.length()!=2){
	System.out.println("invalid emoji");
	return; //exit stop execution
	}
	char first = emoji.charAt(0);
	char second = emoji.charAt(1);
	
	if (first==':') {
	       if(second ==')') {
			    System.out.println("smile");
		   }else if (second=='('){
			    System.out.println("sad");
		   }else if (second=='/') {
			    System.out.println("upset");
		   }else if (second=='p') {
			    System.out.println("playful");	
	
	}else if (first==';') {
		   if(second ==')') {
			    System.out.println("wink");
		   }else if (second=='0'){
			    System.out.println("surprised");
		   }else {
			    System.out.println("Unknown emoji");
		   }
	}else if (first== '(') {
	         if( second ==':') {
	            System.out.println("smile");
	            }
    }else if  (first== ')') {
    	     if( second ==':') {
	            System.out.println("smale");
	            }
    }else {
    	        System.out.println("Invalid emoji");
    }
	
   }
	
 }	
	
}	   
