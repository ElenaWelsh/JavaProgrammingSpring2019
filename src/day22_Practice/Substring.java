package day22_Practice;

public class Substring {
	public static void main(String[] args) {
		
		String word = "java";
		System.out.print(word.substring(0,1)+" ");
		System.out.print(word.substring(1,2)+" ");
		System.out.print(word.substring(2,3)+" ");
		System.out.print(word.substring(3,4)+" ");        
		// System.out.println(word.substring(4,5)); //error
		int i=0;
	//	System.out.println(word.substring(i,i+1));
	//	i++;
		System.out.println("=============================================");
		for(int n=0; n<=3;n++) {
			System.out.println(word.substring(n,n+1));
		}
		System.out.println("##############################################");
		for (int m =3; m>=0; m--) {
			System.out.println(word.substring(m,m+1));
		}
		System.out.println(word.substring(word.length()-1));
}
}