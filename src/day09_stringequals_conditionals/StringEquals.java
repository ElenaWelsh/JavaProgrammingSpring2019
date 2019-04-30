package day09_stringequals_conditionals;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		System.out.println(str1 ==str2);//true
		System.out.println(str1 =="java");//true
		System.out.println(str1 =="Java"); //false
		
		//equals method
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals("java"));//true
		System.out.println(str1.equals("Java"));//false
		
		//String month = "March";
		String month = new String("March");
		String month2 = new String ("March");
		System.out.println(month==month2); //false
		// is not doing values comparison, just checking location in memory
		System.out.println(month.equals(month2));
		System.out.println(month.equals("March"));
		// in the above examples java is checking if values are the same, which is proper way 
		//to compare strings
		
		
		
		
	}

}
