package homeWork_ripl.it;

public class AddStrings175 {

	public static String lameDb(String db, String op,String id,String data)
	{	   String lameDb="";
	       String str=db;
	       if(op.equals("add")) {
	    	   lameDb = db+"#"+id+data;
	       } else {
		String [] DB = db.split("#");
		  for(int i = 0; i < DB.length; i++){
		    if (DB[i].startsWith(id)){
		      switch(op){
		         case "edit":
		          DB[i]=id+data;
		          break;
		        case "delete":
		            DB[i]="";
		            break;
		         default:
		          DB[i]=DB[i];
		         }  
		     }
		    }
		  for(int i = 0; i<DB.length;i++){
		       lameDb+=DB[i]+"#";
		      }
		       
		    if (lameDb.endsWith("#")){
		    	lameDb=lameDb.substring(0,lameDb.length()-1); 
		    }
		  
	       }  
		     return lameDb;
		  
		    
		    
		  }// end lameDb

	public static void main(String[] args) {

		System.out.print(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "delete", "1", "") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");

	}
}
