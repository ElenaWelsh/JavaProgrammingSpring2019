package day39_ArrayList;

import java.util.*;

public class GetRandomList {
	public static void main(String[] args) {

		System.out.println(getRandomList(20));
		List<Integer> rlist = getRandomList(10);
		Collections.sort(rlist);
		System.out.println(rlist);
		
		 List<String> strNums = new ArrayList<>();
	        strNums.add("123");
	        strNums.add("33");
	        strNums.add("128");
	        strNums.add("3");
	        
	        List<Integer> converted = convertToIntList(strNums);
	        System.out.println(converted);
	




	}

	public static List<Integer> getRandomList(int size) {
		Random r = new Random();
		List<Integer> randomNums = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			randomNums.add(r.nextInt(101));
		}
		return randomNums;
	}

	public static List<Integer> convertToIntList(List<String> strList) {
        List<Integer> newList = new ArrayList<>();
        for(String str : strList) {
            newList.add( Integer.parseInt(str) );
        }
        return newList;
    }

}
