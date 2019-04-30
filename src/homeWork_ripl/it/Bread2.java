package homeWork_ripl.it;
import java.util.Scanner;
public class Bread2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	 String str = scan.next();
	 int count =0;
	 int indexWord = str.indexOf("bread")+5;
	 int num2=0;
     for (int i = 0; i<=str.length()-5;i++) {
    	 if(str.substring(i,i+5).equals("bread")){
	    		count++;	    	}
     }
     
     if (count<2) {
    	 System.out.println("nothing");
     }else {
    	 System.out.println(str.substring(indexWord,str.lastIndexOf("bread")));
     }
}
}
