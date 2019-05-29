package day46_static_keyword;

public class CompanyTest {
public static void main(String[] args) {
	
	System.out.println(Company.cname);
	
	System.out.println(Company.cname.toUpperCase());
	
	Company c = new Company();
	System.out.println(c.cname);
	 Company.companyInfo();
	System.out.println(Math.round(345.909));
}
}
