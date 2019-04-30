package homeWork_ripl.it;
import java.util.*;
public class Chestgame {
	public static void main(String[] args) {
	    String[][] chessBoard = new String[8][8];
	    //WRITE YOUR CODE HERE
	   char a='a';
	    for( int i=0;i<8; i++){
	      for(int j=0;j<8 ; j++){
	        chessBoard[i][j]=(i+1)+""+a ;
	        a++;
	      }
	      a='a';
	    }
	    //DO NOT CHANGE
	    System.out.println(Arrays.deepToString(chessBoard));
	    
	    
}
}