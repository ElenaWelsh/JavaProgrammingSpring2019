package day50_Inheritance;

public class App {
	private String name;
	public static int count;
    private String developer;
    
    
    
 public App(String name) {            //           public App() {         will also work
	 this.name=name;                 //          this.name=100;      still no arg constructor
	                                //         called automatically
 }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 
public static void build(String language) {
	System.out.println("Building an app using"+ language);
}
}
