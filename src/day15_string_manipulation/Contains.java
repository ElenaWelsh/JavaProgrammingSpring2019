package day15_string_manipulation;

public class Contains {
public static void main(String[] args) {
	String email = "test@gmail.com";
	System.out.println(email.contains("@")); 
	//use this method, when position not important
	String list = "potatos, apples, tomatos, eggs, milk, bread, cerial, meat, avocados";
	
	if(list.contains("apples")) {
		System.out.println("Apples are there!");
	}else {
		System.out.println("let's Add apples now!");
	}
	
	boolean hasEggs =  list.contains("eggs"); //true
	System.out.println("Contains eggs: " + hasEggs);
	boolean hasCucumbers = list.toLowerCase().contains("cucumbers");
	System.out.println("Contains cucumbers: "+hasCucumbers);//false
	
	email = "name@yahoo.com";
	if(email.contains("yahoo")) {
		System.out.println("Yahoo account");
	}else if (email.contains("gmail")){
		System.out.println("Gmail account");
	}
	     String etsyTitle="Wooden spoon | Etsy";
	     if(etsyTitle.contains(" | ")) {
	    	 System.out.println(" | is there");
	     }
	     String name = "Elena";
	    if( name.contains("e")) {
	    	System.out.println("My name contains e");
	    }else { 
	    	System.out.println("My name does not contain e");
}
	     
	     
}
}
