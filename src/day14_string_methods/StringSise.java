package day14_string_methods;

public class StringSise {
public static void main(String[] args) {
	String str1= "Good Morning";
	if(str1.equals("Good Morning")){
		System.out.println("match");
	}else {System.out.println("Not Match");
	
	if(str1.equalsIgnoreCase("good morning")) {
		System.out.println();
	}else { System.out.println();
}
	System.out.println(str1.toUpperCase());
	System.out.println(str1);
	str1 = str1.toUpperCase();
	System.out.println("After assignment:" + str1);
	
	
	if (str1.toLowerCase().contentEquals("Good Morning")) {
		System.out.println("Chained methods: match");
	}else { System.out.println("Chained methods does not match");
	}
          String myName =" Murodil";
	      System.out.println(myName.length());
	      int length = myName.length();
	      System.out.println(length);
	      
	      String userName = "password";
	    		  if (userName.length()==8) {
	    			  System.out.println("Valid user name");
	    		  }else {
	                  System.out.println("Invalid user name");
                  }
	    		  
	    		String password = "woodenSpoon";
	    if(password.length()>6) {
	    	System.out.println("Password is good");
	    }else {
	    	System.out.println("Password is too shotr");
	    }
	    		  int passwordLength = password.length();
	    		  if(passwordLength<6) {
	    			  System.out.println("Invalid password.Too short");
	    		  }else {
	    			  System.out.println("Valid password");
	    		  }
	    		  
	    		  
	    		  
	    		  
	    		  
	    		  
	    		  
	}	    		  
	    		  
	    		  
	    		  
	    		  
	}
}