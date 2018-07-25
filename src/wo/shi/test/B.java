package wo.shi.test;

public class B extends A{
	 static{  
		         System.out.println("子类静态");  
		    }  
	 
	 		{
		 		System.out.println("子类非静态"); 
	 		}
		    
	 		public B(){  
		         System.out.println("子类构造");  
		     }  
}
