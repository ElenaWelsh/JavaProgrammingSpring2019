package day47_blocks;

import static java.lang.Math.*;
import static java.lang.Character.*;  //need to import it only if you do static import
import static java.util.Arrays.sort;
import java.util.Arrays;
import static java.time.LocalDateTime.now;

public class StaticImports {
	public static void main(String[] args) {
    System.out.println(PI);//pie
    System.out.println(max(10,5));
    System.out.println(min(10,5));
    System.out.println(round(45.99));
    System.out.println(abs(-10));// absolute value
    System.out.println(pow(10.4,2)); 
    System.out.println(sqrt(5));
    System.out.println(random()*10);
    System.out.println(isDigit('4'));
    System.out.println(isAlphabetic('J'));
    
    int [] nums = {34,23,44,11,4444,1222};
    sort(nums);
    System.out.println(Arrays.toString(nums));
    System.out.println(now());
	}
}
