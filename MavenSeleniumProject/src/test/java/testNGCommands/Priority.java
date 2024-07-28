package testNGCommands;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 4)  //priority is set to control the program and execution
	public void testCase1() {
		System.out.println("TestCase1 Executed");
	}

	@Test(priority=1)

	public void testcase2() {
		System.out.println("TestCase2 Executed");
	}

	@Test //if priority is not set testNG will consider as 0 priority & execute first
	public void testcase3() {
		System.out.println("TestCase3 Executed");
	}

	@Test(priority = 3)
	public void testcase4() {
		System.out.println("TestCase4 Executed");
	}

	@Test(priority = 5)
	public void testcase5() {
		System.out.println("TestCase5 Executed");
	}

@DataProvider (name = "data-provider")
public Object[][] dpMethod(){
	return new Object[][] {{2, 3}, {5, 7},{9,5}};
}
}