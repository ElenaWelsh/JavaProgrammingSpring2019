package day23_Loop_Control_Nested_Arrays;

public class NumbersLoop {
public static void main(String[] args) {

	for(int i=1 ; i<=50;i++) {
        if(i%20==0) {
			break;
		}
		if (i%5==0) {
			continue;
		}
		System.out.print(i +",");
	}
		
}
}
