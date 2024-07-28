package testNGCommands;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

//Annnotations are basically pre and post conditonal statements
public class Annotation {
  @Test
  public void testcase1() {
	  System.out.println("TestCase1 Executed");
  }
  @Test
  public void testcase2() {
	  System.out.println("TestCase2 Executed");
  }
  @Test
  public void testcase3() {
	  System.out.println("TestCase3 Executed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod Executed");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod Executed");
  }

}
