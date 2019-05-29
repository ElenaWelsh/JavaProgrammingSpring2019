package day53_inheritance06;

public class Cities {
	
		public static void main(String[] args) {
		    City baku= new City(123,"Baku");
		    System.out.println(baku.toString());
		    
		    
		    City instambul = new City(444,"Instambul");
		    City anotherCity  = new City(444,"Instambul");
		    
		    if(instambul.equals(anotherCity)){
		        System.out.println("Both are Instambul");
		    }else{{
		        System.out.println("Both not eual");
		        
		    }
		    System.out.println(instambul.toString());
		    System.out.println(anotherCity.toString());
		    
		    System.out.println(baku.hashCode());
		    System.out.println(instambul.hashCode());
		    System.out.println(anotherCity.hashCode());
		    
		    Capital cap = new Capital(101,"Washington DC", 800_000L);
		    System.out.println(cap.toString());
		    }
		    
		}
		}