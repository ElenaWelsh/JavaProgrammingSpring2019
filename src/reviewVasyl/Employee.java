package reviewVasyl;

public class Employee {
  String firstName;
  String lastName;
  int employee_id;
  int age;
  float hourlyRate;
  char gender;
  boolean isInsured;
  String title;
  String email;
  String[] titles = {"Developer", "Scrum master", "SDET", "PO", "QA Analyst", "BA", "HR"};
  
  public void printInfo() {
	  System.out.println("First name: " + firstName + ", Last name: " + lastName + ", Employee id: " + employee_id
				+ ", Age: " + age + ", Hourly rate: " + hourlyRate + "$, Gender: " + gender + ", Insured? " + isInsured
				+ ", Title: " + title+", Email: "+email);
  }
  
  public String generateEmail() {
      String newEmail= firstName.toLowerCase()+"_"+lastName.toLowerCase()+"@gmail.com";
      email= newEmail;
      return newEmail;
      
  }
  public void setEmail(String e) {
      //lets check if email is valid before us changing it
      if(email.contains("@")) {
      email=e;
  }else{
      System.out.println("Invalid email!");
  }
  }
  public void printEmail() {
      System.out.println("Email of "+firstName+" "+lastName+" : "+email);
  }
  
} 