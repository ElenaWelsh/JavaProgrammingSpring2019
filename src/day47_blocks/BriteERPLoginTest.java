package day47_blocks;
import static day47_blocks.BriteERP.*;// after importing pacKage you don't need to call class name anymore

                                           // line11  though line  13
public class BriteERPLoginTest {
public static void main(String[] args) {
	//static block  runs automatically in the beginning
	BriteERP.enterEmail();
	BriteERP.enterPassword();
	BriteERP.varifyLogin();
	
	enterEmail();
	enterPassword();
	varifyLogin();
}
}
