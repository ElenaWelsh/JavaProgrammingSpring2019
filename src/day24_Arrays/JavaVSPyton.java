package day24_Arrays;

import java.util.Scanner;


public class JavaVSPyton {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String sentence = scan.nextLine();
    int coutj = 0,coutp=0;
    for (int i=0 ; i<sentence.length()-6; i++){
      if (sentence.substring(i,i+4).equals("java")){
        coutj++;
        
      }
      if(sentence.substring(i,i+6).equals("python")){
        coutp++;
      }
    }
    System.out.println(coutp == coutj);
    



}
}
