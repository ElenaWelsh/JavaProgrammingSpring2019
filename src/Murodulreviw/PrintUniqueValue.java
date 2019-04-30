package Murodulreviw;

public class PrintUniqueValue {
	public static void main(String[] args) {
		
	
         String str = "jjavabook";//vbk
         
         for(int i =0; i<str.length(); i++) {
        	 char temp=str.charAt(i);
        	 int count =0;
        	 for(int j =0; j<str.length();j++) {
        		 if(temp==str.charAt(j)&& i !=j) {
        			 count++;
        			 break;
        		 }
        	 }
        	 if(count==0) {
        		 System.out.println(temp);
        	 }
         }
         
         
}
}