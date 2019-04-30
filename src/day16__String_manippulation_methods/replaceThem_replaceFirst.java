package day16__String_manippulation_methods;

public class replaceThem_replaceFirst {
public static void main(String[] args) {
	String sentence = "Coding is fun, it is my hobby!!";
	String  withNoSpaces= sentence.replace(" ", "");
	System.out.println(withNoSpaces);
	System.out.println(sentence);
	sentence = sentence.replace(",","!!!");
	
	String mixed = "&^@#j$a-v|a@#$";
	mixed = mixed.replace("&^@#", "").replace("@#$","");
	mixed =mixed.replace("$", "").replace("-","").replace("|", "");
	System.out.println(mixed);
	
	String result = "about 115,000,000 results (0.59 seconds)";
	result = result.replace("About","");
	//result = result.replace("results(0.66 seconds)","");
	result = result.substring(0, result.indexOf(""));
	System.out.println(result);
	result = result.replace(",", "");
	System.out.println(result);
	 result = "About 115,000,000 results (0.11 seconds)";
	
	//using string methods(replace, substring) get number of results
	
	//115,000,000	
	result = result.replace("About ", "");//115,000,000 results (0.11 seconds)
	//result = result.replace(" results (0.66 seconds)", ""); might break whn number changes
	result = result.substring(0, result.indexOf(" "));
	result = result.replaceFirst(",", "");
	System.out.println(result);
}
}
