package day37_Array_List;
import java.util.*;
public class RemoveIntenger {
public static void main(String[] args) {
	ArrayList<Integer> nums = new ArrayList<>(10);
	System.out.println(nums.size());
	nums.add(4);
	nums.add(1);
	nums.add(443);
	nums.add(5);
	nums.add(5);
	nums.add(100);
	nums.add(55);
	System.out.println(nums.toString());
	nums.remove(2);
	System.out.println(nums.toString());
	
	
	Integer n1 = new Integer(5);
	Integer n2=Integer.valueOf(5);
	nums.remove(n1);
	nums.remove( n1 );
	nums.remove(new Integer(4));
	System.out.println(nums.toString());

}
}


