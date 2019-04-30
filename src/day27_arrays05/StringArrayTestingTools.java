package day27_arrays05;

public class StringArrayTestingTools {
	public static void main(String[] args) {
//	Java --> programming language
//	Selenium --> Test Automation
//	 TestNG--> Unit Tests
//	JUnit --> Unit Tests
//	Cucumber --> BDD Style testing
//	Git --> Version control
//	Maven --> Building and execution for project
		String[] tools = { "Java", "Selenium", "TestNG", "JUnit", "Cucumber", "Git", "Maven" };
		for (String tool : tools) {
			switch (tool.toLowerCase()) {
			case "java":
				System.out.println("Java - programming language");
			case "selenium":
				System.out.println("Selenium - Test Automation");
			case "testNG":
			case "junit":
				System.out.println("JUnit - Unit Tests");
			case "Cucumber":
				System.out.println("Cucumber - BDD Style testing");
			case "Git":
				System.out.println("Git - Version control");
			case "Maven":
				System.out.println("Maven - Building and execution for project");
			default:
				System.out.println("Unknowing tool");
			}     
		}

	}
}


