package day10_logicalperators_conditionals;

public class IfStatementWithBooleanVariables {
           public static void main(String[] args) {
	             boolean isBreakTime = false;
	             if (isBreakTime==true) {
	            	 System.out.println("Break till 8:35 pm");
	             } else {
	            	 System.out.println("Not Break time yet");
	             }
 
	             
	             
/*                if (isBreakTime) {
	            	 System.out.println("Break till 8:35 pm");
	             } else {
	            	 System.out.println("Not Break time yet");
	             }   */
	                
	                 boolean classTime = false;
	                 if (classTime) {
	                	 System.out.println("Come back on time");
	                	 System.out.println("Stop talking");
	                	 System.out.println("Pay attention");
	                	 System.out.println("Code and have fun");
	                 }else {
	                	 System.out.println("Take a walk and have some water.");
	                	 
	                 }
	                                                  
	                 boolean qualified = false;
	                 if (qualified==false) {
	                	 System.out.println("Your application was not approoved");
	                 }
    }
}

