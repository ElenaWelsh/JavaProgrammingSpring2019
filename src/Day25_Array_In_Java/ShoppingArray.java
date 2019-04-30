package Day25_Array_In_Java;

public class ShoppingArray {
	public static void main(String[] args) {
		String[]products = {"Timberland Shoes","H&M Shirt","Swatch Watch Watch",
				"Gucci Bag", "Adidas socks"};
		
		double[]prices= {120.0,5.99,150.50,3000.5,6.99};
		int[]itemsId = {12345,12346,12347,12348,12349};
		
		// loop through products and print each one and count of products
		
		System.out.println("Products count: " + products.length);
		
		for(String product:products ) {
			System.out.println(product);
		}
		if(products.length==prices.length &&products.length==itemsId.length) {
		
		System.out.println("Shopping list looks good");
		}else {
			System.out.println("Something is wrong in this list");
			return;
		}
	//	prices for loop
		for(int i =0; i<prices.length-1; i++) {
			System.out.println(prices[i]);
		}
		for  (int i = itemsId.length-1; i>=0;i--) {
			System.out.println(itemsId[i]);
		}
		
		//print report with total price
		double totalPrice=0.0;
		System.out.println("######YOUR SHOPPING RECEIPT######");
		for(int i = 0; i<products.length; i++) {
			totalPrice+=prices[i];
		
		System.out.println("Item " +(i+1)+":"+itemsId[i]+" - "+  products[i]+" -$ "+
		prices[i]);
		}
         System.out.println("Total price: "+ totalPrice);
         int maxIndex=0;
         double maxPrice=0;
         for(int j=0;j<prices.length;j++) {
        	 if(prices[j]>maxPrice) {
        		 maxPrice=prices[j];
        		 maxIndex=j;
        	 }
         }
         System.out.println(itemsId[maxIndex]+" - "+ products[maxIndex]+" $"+ maxPrice);
         
         
         
         
         
	}
}
