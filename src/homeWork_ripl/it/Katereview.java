package homeWork_ripl.it;
import java.util.*;
public class Katereview {


		  public static void main(String[] args) {
		    String[][] chessBoard = new String[8][8];
		    //WRITE YOUR CODE HERE
		  String [] count = {"1","2","3","4","5","6","7","8"};
				String [] countChar = {"a","b","c","d","e","f","g","h"};
					    for (int i = 0; i < chessBoard.length ; i++) {
					  	for (int j = 0; j < chessBoard[i].length; j++) {
						chessBoard[j][i]= count[j]+ countChar[i];
					
					}
				}  
		    //DO NOT CHANGE
		    System.out.println(Arrays.deepToString(chessBoard));
		  }
		}
	


