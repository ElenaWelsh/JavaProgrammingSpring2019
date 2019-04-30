package Murodulreviw;

public class ReverseString {
public static void main(String[] args) {
	String today = "tuesday";
			String t = today.substring(0,4);
			String d = today.substring(4);
			System.out.println(t+"\n"+ d);
			System.out.println(today.substring(2,3));//e
			System.out.println(today.substring(4,5));//d
			System.out.println(today.charAt(4));//d
			
			//revirsed  order
			for(int i =0;i<today.length();i++) {
			System.out.println(today.charAt(i));  //using charAt
			System.out.println(today.substring(i,i+1));//using substring
			}
			
			for(int j=today.length()-1; j>=0;j--) {
				System.out.println(today.charAt(j)+" ");
			//	System.out.println(today.substring (j,j+1));
			}
			
			
		String word="wednesday";	//using new var reversed
		String reversed = "";
		for (int r =word.length()-1; r>=0;r--) {
			//System.out.println(word.charAt(r));
			reversed += word.charAt(r);
		}
			System.out.println(reversed);
			
			
			if (reversed.equalsIgnoreCase(word)){
				System.out.println("Palindrome");
			}
			
}  
}
