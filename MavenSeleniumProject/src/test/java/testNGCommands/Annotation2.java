package testNGCommands;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Annotation2 {
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
  @BeforeClass
  public void beforeClass() {
  
  System.out.println("BeforeClass Executed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass Executed");
  }

}
