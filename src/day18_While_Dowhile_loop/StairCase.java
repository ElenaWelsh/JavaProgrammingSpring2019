package day18_While_Dowhile_loop;

public class StairCase {
public static void main(String[] args) {
	String stairs = "*";
	//System.out.println(stairs);
	//stairs =stairs +"*";        //stairs +="*";
    // 1) way:
	int num = 1;
	while(num<=10) {
		System.out.println(stairs);
		stairs+="*";
		num++;
	}
	
	//2) way:
	
	String stair = "*";
	while(stair.length()<=10) {
		System.out.println(stair);
		stair +="*";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
