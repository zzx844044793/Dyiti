package wo.shi.test;

public class A {
			static{  
		          System.out.println("父类静态代码");  
		      } 
			
			{
					System.out.println("父类非静态"); 
			}
			
		    public A(){  
		          System.out.println("父类构造");  
		      }  
}
