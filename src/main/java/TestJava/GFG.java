package TestJava;

import java.util.logging.Logger;

public class GFG {

	public static void main(String[] args) {
		   Logger logger 
           = Logger.getLogger(GFG.class.getName());
		Class<TestJava.GFG> c =   GFG.class;
		String name = c.getName();
		System.out.println(name);
 
       // Call info method 
       logger.info("Message 1"); 
       logger.info("Message 2"); 

	}

}
