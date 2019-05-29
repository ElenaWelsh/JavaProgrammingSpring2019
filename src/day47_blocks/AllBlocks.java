package day47_blocks;

public class AllBlocks {
	int nonStaticInt = 10;
	static int staticInt =10;
  static {
	  System.out.println("STATIC BLOCK - I run first and only once");
	  staticInt--;
  }
  {
	  System.out.println("INIT BLOCK - I run each time ibject is created, before constructor");
	  staticInt +=5;
	  nonStaticInt +=5;
  }
  public AllBlocks() {
	  System.out.println("CONSTRUCTOR - I run each time object is created, after unit block");
	  staticInt +=3;
	  nonStaticInt +=3;
  }
}
