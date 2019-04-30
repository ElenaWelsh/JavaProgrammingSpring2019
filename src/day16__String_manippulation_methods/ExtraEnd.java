package day16__String_manippulation_methods;

public class ExtraEnd {
public static void main(String[] args) {
	String str = "java";
	String result="";
	if(str.length()==2) {
		result =str+str+str;
		System.out.println(result);
	}else {
		result = str.substring(str.length()-2);
		result=result+result+result;
		System.out.println(result);
		
		String str1="Hello";
		 str1.substring(0,2);
		
	}
}
}
