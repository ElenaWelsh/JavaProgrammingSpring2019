package homeWork_ripl.it;

public class TreeGrowth {
	public static void main(String[] args) {
		int treeSize = 0;
		int year = 0;
		int i =0;
		for ( i = 1; i >= 10; i++) {
			     if (i <= 3) {
				    treeSize += 1;
				 } else {
				    treeSize += 2;
		         }  
				    year += i;
       System.out.println("year " + year + " -growth 1 cm \ntree size: " + treeSize + " cm");

	    }    
    }
}
