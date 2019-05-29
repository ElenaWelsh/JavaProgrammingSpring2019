package day50_Inheritance;

public class Google extends SearchEngine {
	@Override
	public int search(String  word) {
		System.out.println("Google is searching for: " +word);
		int resultsCount =word.length();
		return resultsCount;
	}
	@Override   //protected
	public void search(String item, String item2) {
		System.out.println("Searching for 2 items: " +item+" "+item2);
		int resultsCount =item.length()+item2.length();
		System.out.println("Total count: "+ resultsCount);
	}
	@Override     //default, protected
		String clickResult() {
			System.out.println("Clicking result");
			return "Search result page";
		}
		

}
