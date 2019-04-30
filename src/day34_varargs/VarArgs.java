package day34_varargs;

public class VarArgs {
	public static void main(String[] args) {
		printWords("red", "blue", "yellow");
		printWords("grey");
		printWords(); // empty array
		
		System.out.println(sum(3, 5 , 10));
		System.out.println(sum(87564, 545, 879844, 55,33232,54545432,2344,2345,533,1234,523));
		int budget = 200;
		if(sum(10, 45, 110, 30) <= budget) {
			System.out.println("Within budget");
		}else {
			System.out.println("Broke");
		}
		int total =sum(234,43,567,12,34,5);
		System.out.println("Total: "+ total);
		
		
	}

public static void printWords(String...words) {
	//handle it as array
	for(String w:words) {
	System.out.println(w);
	}
}	
	
   public static int  sum ( int... nums) {//varargs
	 int sum=0;
	for(int n:nums) {
		sum+=n;
	}
	return sum;
}
  
}
