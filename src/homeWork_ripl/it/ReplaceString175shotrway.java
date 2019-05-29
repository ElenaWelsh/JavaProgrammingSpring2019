package homeWork_ripl.it;

public class ReplaceString175shotrway {
		  public static String lameDb(String db, String op,String id,String data)
		  {
		    String [] arr = db.split("#");
		    
		    switch (op){
		      case "add":
		        return db + "#"+id + data;
		      case "delete":
		        
		        return db.replace(arr[Integer.parseInt(id)-1],"");
		      case "edit":
		        return db.replace(arr[Integer.parseInt(id)-1],id+data);
		      default :
		       return db;
		    }
		    
		    
		  }//end lameDb
		  public static void main(String[] args) 
		   {
		    
		     
		     System.out.print(
		       lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
		       );
		       
		      System.out.print(
		       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
		       );
		       
		      System.out.print(
		       lameDb("1tst#2bla#3foo","delete","1","")+"\n"
		       );
		       
		        System.out.print(
		       lameDb("1tst#2bla#3foo","none","1","")+"\n"
		       );
		     
		   }
		  
		}


