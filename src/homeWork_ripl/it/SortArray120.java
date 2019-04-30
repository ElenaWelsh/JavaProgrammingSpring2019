package homeWork_ripl.it;
import java.util.*;
public class SortArray120 {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		    
		   
		    String[]words = str.split(", ");
		    String shortest = words[0];
		    for(String word:words){
		      if(word.length()<shortest.length()){
		        shortest=word;
		      }
		    }
		    int y = shortest.length();
		    String shortstr="";
		    for(String word:words){
		      if(word.length()==y){
		        shortstr=word+",";
		      }
		    }
		    String[] shortArr=shortstr.split(",");
		    Arrays.sort(shortArr);
		    System.out.println(Arrays.toString(shortArr));
		  }
		}

