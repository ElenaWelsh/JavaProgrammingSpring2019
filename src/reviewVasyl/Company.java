package reviewVasyl;

public class Company {
public static void main(String[] args) {
	Employee employee1 = new Employee();
	employee1.printInfo();
	employee1.firstName = "Pavel";
	employee1.lastName = "Babayan";
	employee1.title ="";
	employee1.gender ='m';
	employee1.email = "";
	employee1.printInfo();
	
	Employee employee2 = new Employee();
	employee2.firstName = "Murad";
	
//	Employee[] it_department=new Employee[2];
	Employee[] it_department= {employee1, employee2};
	
}
}
 