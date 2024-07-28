package testNGCommands;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleParameter {
  @Test
  //@Parameters("Para 1") //Always choose testNG package //always give the parameter name given in xml file
  @Parameters({"Para 1","Para 2"}) //if more than 2 parameters use this syntax
  public void testcase(String name,int a) {
	 System.out.println(name);
	 System.out.println(a);
  }
  
  @Test
  //@Parameters("Para 1") //Always choose testNG package //always give the parameter name given in xml file
  @Parameters({"Para 1","Para 2"}) //if more than 2 parameters use this syntax
  public void testcase2(String name,int a) {
	 System.out.println(name);
	 System.out.println(a);
  }
  
	  

	 
	 
  
}

