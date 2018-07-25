package wo.shi.zzx;

public abstract class TestInstance { 
	
		 static int i = 1; 
		 static int a = 2;
		 public static TestInstance getInstance() { 
			 for(;a<10;a++) {
				 System.out.println(a);
			 }
			 System.out.println(++i); 
			 return null;
		 	} 

}
