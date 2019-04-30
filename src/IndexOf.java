
public class IndexOf {
public static void main(String[] args) {
	String str = "java";
	str.indexOf("a");// ==1
	String word1 ="github";
	System.out.println(word1.indexOf("g"));// ==0
	System.out.println(word1.indexOf("th"));// ==2
	System.out.println(word1.indexOf("hub"));// ==3 starts from 3
	System.out.println(word1.indexOf("java"));// -1 if can not find gives -1 each time
	String url="www.okta.com";
	int i= url.indexOf(".");
	System.out.println("pos of . :" + i); //=3
	                              //4
	System.out.println(url.charAt(i+1));//'o'
	
	String title= "Java - Google Search";
	int dash = title.indexOf("-");//5
	System.out.println(title.charAt(dash-1));//" "
	System.out.println(title.charAt(dash+1));//" "
	System.out.println(title.charAt(dash-2));//" a"
	System.out.println(title.charAt(dash-2));//"G "
	
	String country = "United States of America";
	int states = country.indexOf("States");//7 place where is starts
	System.out.println("Position of states: " + states);
	
	String word2 = "java, c++, pyton, tomcat, eclipse";
	if(word2.contains("c++")) {  //using contains
		System.out.println( "c++ is there ");
		
	}
	
	if(word2.indexOf("c++")>-1) {
    	 System.out.println( "c++ is there ");   //using indexOf
     }
	
	
	
	
	
	
	
	
	
}
}
